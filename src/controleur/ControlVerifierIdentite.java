package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		Gaulois g=village.trouverHabitant(nomVendeur);
		boolean response=false;
		if (g.equals(nomVendeur))/////proleme la 
		{
			response=true;
		}
		return response;
	}
}
