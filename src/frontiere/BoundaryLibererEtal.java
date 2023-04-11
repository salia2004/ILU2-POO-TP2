package frontiere;

import controleur.ControlLibererEtal;
import villagegaulois.Etal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		Etal nom=controlLibererEtal.isVendeur(nomVendeur);
		if (nom==null)//vendeur pas reconnu
		{
			System.out.println("Mais vous n'etes pas inscrit sur notre marche aujourd'hui");
		}
		else
		{
			String[] tab=controlLibererEtal.libererEtal(nomVendeur);//tableau des donnees sur l'etal
			if(tab[0]=="true")
			{
				System.out.println("Vous avez vendu  "+tab[4]+"  sur "+ tab[3] +" "+tab[2]+".");
				System.out.println("Au revoir "+ nomVendeur+" passez une bonne journee");}}
		}

}
