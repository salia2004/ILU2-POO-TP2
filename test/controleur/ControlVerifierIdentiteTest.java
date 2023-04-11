package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialisation()
	{
		System.out.println("Initialisation......");
		village= new Village("Abraracourcix",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
		
	}
	
	@Test
	void testControlVerifierIdentite() {
		ControlVerifierIdentite controlverfieridentite= new ControlVerifierIdentite(village);
		assertNotNull(controlverfieridentite,"Constructeur ne renvoi pas null");
	}

	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite controlverfieridentite= new ControlVerifierIdentite(village);
		Gaulois bonemine =new Gaulois("Bonemine",10);
		Gaulois panoramix = new Gaulois("Panoramix",9);
		assertTrue(controlverfieridentite.verifierIdentite("Abraracourcix"));//
		village.ajouterHabitant(bonemine);
		assertTrue(controlverfieridentite.verifierIdentite("Bonemine"));//
		assertFalse(controlverfieridentite.verifierIdentite("Panoramix"));//
		village.ajouterHabitant(panoramix);
		assertTrue(controlverfieridentite.verifierIdentite("Panoramix"));//
	}

}
