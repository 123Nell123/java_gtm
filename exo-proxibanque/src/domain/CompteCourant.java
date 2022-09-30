package domain;

public class CompteCourant extends CompteBancaire{
	
	public static float soldeCC;

	public CompteCourant(int numero, float solde, String dateOuverture, Client compteBancaireClient) {
		super(numero, solde, dateOuverture, compteBancaireClient);
		// TODO Auto-generated constructor stub
	}
	


	public CompteCourant(int numero, float solde, String dateOuverture, Client compteBancaireClient, float soldeCC) {
		super(numero, solde, dateOuverture, compteBancaireClient);
		this.soldeCC = soldeCC;
	}

	public CompteCourant(int numero, String dateOuverture, Client compteBancaireClient, float soldeCC) {
		super(numero,dateOuverture, compteBancaireClient);
		this.soldeCC = soldeCC;
	}





	public static float getSoldeCC() {
		return soldeCC;
	}



	public static void setSoldeCC(float soldeCC) {
		CompteCourant.soldeCC = soldeCC;
	}



	@Override
	public String toString() {
		return "CompteCourant [soldeCC=" + soldeCC + ", getNumero()=" + getNumero() /*+ ", getSolde()=" + getSolde()*/
				+ ", getDateOuverture()=" + getDateOuverture() + ", getCompteBancaireClient()="
				+ getCompteBancaireClient() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	/*public static float debiter(int y,float x) {
		
		CompteBancaire.solde = (CompteBancaire.solde -x);
		return CompteBancaire.solde;
		
	}*/
	
	public static float debiter(int y, float x) {
		soldeCC = (soldeCC - x);
		return soldeCC;
	}

}
