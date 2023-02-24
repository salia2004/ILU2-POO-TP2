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
		StringBuilder question = new StringBuilder();
		if (!x){
			question.append("Je suis desolee "+ nomVendeur+ "je vais regarder si je peut vous trouver un etal.\n");}
		else{
			question.append("Bonjour"+ nomVendeur+ "je vais regarder si je peut vous trouver un etal.\n");
			question.delete(0, question.length());
			x=controlPrendreEtal.resteEtals();
			if(!x){
				question.append("Desole"+ nomVendeur+ "je n'ai plus d'etal disponible.\n");}
			else {
				installerVendeur(nomVendeur);}
		}
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder question = new StringBuilder();
		question.append("C'est parfait ,il me reste un etal pour vous !!.\n");
		question.append("Il me faudrait quelques renseignement.\n");
		question.append("Quels produits souhwitez-vous vendre ?\n");
		String produit =scan.next();
		question.delete(0, question.length());
		question.append("Combien souhaitez-vous en vendre?\n");
		int nb=scan.nextInt();
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nb);
		if (numeroEtal!=-1)
		{
			question.append("le vendeur "+ nomVendeur + " s'est installer a l'etal n° "+ numeroEtal);}
	}
	
		
	
}
