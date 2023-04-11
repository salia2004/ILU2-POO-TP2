package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] donnesM=controlAfficherMarche.donnerInfosMarche();
		if(donnesM.length==0)
		{
			System.out.println("Le marche est vide , revenez plus tard");}
		else
		{
			System.out.println(nomAcheteur + " ,vous trouverez au marche :  ");
			for(int i=0;i<donnesM.length;i+=3) 
			{
				System.out.println("- "+ donnesM[i] +" qui vend "+ donnesM[i+1] + " " + donnesM[i+2]);
			}}
		}//fonction
	
	
	
	
	
	
	
}//class
