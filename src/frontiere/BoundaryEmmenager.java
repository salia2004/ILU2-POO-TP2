package frontiere;

import controleur.ControlEmmenager;
import personnages.Druide;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					question.append("Bienvenue villageois "+ nomVisiteur+ " \n");
					question.append("Quelle est votre force ? \n");
					int force=-1;
					force = Clavier.entrerEntier(question.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !\n");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		question.append("Bienvenur druide "+ nomVisiteur+ "\n");
		
		question.append("Quelle est votre force ?\n");
		int forcedruide=-1;
		forcedruide = Clavier.entrerEntier(question.toString());
		question.delete(0, question.length());
		
		question.append("Quelle est la potion la plus faible que vous utilisez?\n");
		int potionMin=Clavier.entrerEntier(question.toString());
		question.delete(0, question.length());
		
		question.append("Quelle est la potion la plus forte que vous utilisez?\n");
		int potionMax=Clavier.entrerEntier(question.toString());
		question.delete(0, question.length());
		
		while (potionMax<potionMin)
		{
			question.append("Attention druide ,vous vous"
					+ " etes tromper entre le minimum et le maximum\n");
			question.delete(0, question.length());
		}
		controlEmmenager.ajouterDruide(nomVisiteur, forcedruide,potionMin,potionMax);
		}
}
