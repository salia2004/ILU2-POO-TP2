package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	private Village village; 
	private Chef abraracourcix;
	@BeforeEach
	public void init()
	{
		System.out.println("Initilalisation......");
		village=new Village("Abraracourcix",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
	}
	@Test
	void testControlTrouverEtalVendeur() {
		ControlTrouverEtalVendeur controltrouveretalvendeur=new ControlTrouverEtalVendeur(village);
		assertNotNull(controltrouveretalvendeur,"le constructeut ne retourne pas null");
	}

	@Test
	void testTrouverEtalVendeur() {
		ControlTrouverEtalVendeur controltrouveretalvendeur=new ControlTrouverEtalVendeur(village);
		Gaulois bonemine =new Gaulois("Bonemine",10);
		Gaulois panoramix = new Gaulois("Panoramix",9);
		assertNull(controltrouveretalvendeur.trouverEtalVendeur("Bonemime"));//bonemine fait pas arpi du village 
		village.ajouterHabitant(bonemine);
		village.ajouterHabitant(panoramix);
		assertNull(controltrouveretalvendeur.trouverEtalVendeur("Panoramix"));//il est habitant mais na pas d'etal
		village.installerVendeur(panoramix,"fleurs",10);
		assertNotNull(controltrouveretalvendeur.trouverEtalVendeur("Panoramix"));//il est habitant et il a un etal 

	}

}
