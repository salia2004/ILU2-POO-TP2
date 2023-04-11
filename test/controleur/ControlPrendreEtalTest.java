package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private Chef abraracourcix;
	private ControlVerifierIdentite controlVerifierIdentite;
	
	@BeforeEach
	public void init()
	{
		System.out.println("Initialisation......");
		village= new Village("Abraracourcix",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
		controlVerifierIdentite= new ControlVerifierIdentite(village);
		
	}

	@Test
	void testControlPrendreEtal() {
		ControlPrendreEtal controlPE= new ControlPrendreEtal(controlVerifierIdentite,village);
		assertNotNull(controlPE,"constructeur non vide");
	}

	@Test
	void testResteEtals() {
		ControlPrendreEtal controlPE= new ControlPrendreEtal(controlVerifierIdentite,village);
	}

	@Test
	void testPrendreEtal() {
		ControlPrendreEtal controlPE= new ControlPrendreEtal(controlVerifierIdentite,village);
		fail("Not yet implemented");
	}

	@Test
	void testVerifierIdentite() {
		ControlPrendreEtal controlPE= new ControlPrendreEtal(controlVerifierIdentite,village);
		fail("Not yet implemented");
	}

}
