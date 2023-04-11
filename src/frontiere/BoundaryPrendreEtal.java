package frontiere;

import java.util.Scanner;
import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean x;
		x=controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!x)
		{
			System.out.println("Je suis desolee "+ nomVendeur + " mais il faut être un habitant de notre village pour commercer ici..\n");
		}
		else
		{
			System.out.println("Bonjour "+ nomVendeur+ " je vais regarder si je peut vous trouver un etal.\n");
			x=controlPrendreEtal.resteEtals();
			if(!x)
			{
				System.out.println("Desole "+ nomVendeur+ " je n'ai plus d'etal disponible.\n");
			}
			else 
			{
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {//sa marche mais demander pour les indices 
		System.out.println("C'est parfait ,il me reste un etal pour vous !!.\n");
		System.out.println("Il me faudrait quelques renseignement.\n");
		
		System.out.println("Quels produits souhwitez-vous vendre ?\n");
		String produit =scan.next();
		
		System.out.println("Combien souhaitez-vous en vendre?\n");
		int nb=scan.nextInt();
		
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nb);
		if (numeroEtal!=-1)
		{
			numeroEtal=numeroEtal+1;
			System.out.println("le vendeur "+ nomVendeur + " s'est installer a l'etal n° "+ numeroEtal);}
	}
	
		
	
}
