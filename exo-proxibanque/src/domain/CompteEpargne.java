package domain;

public class CompteEpargne extends CompteBancaire{

	public static float soldeCompteEpargne;
	
	public CompteEpargne(int numero, String dateOuverture, Client compteBancaireClient) {
		super(numero, dateOuverture, compteBancaireClient);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(int numero, String dateOuverture, Client compteBancaireClient,
			float soldeCompteEpargne) {
		super(numero,  dateOuverture, compteBancaireClient);
		this.soldeCompteEpargne = soldeCompteEpargne;
	}



	@Override
	public String toString() {
		return "CompteEpargne [soldeCompteEpargne=" + soldeCompteEpargne + ", getNumero()=" + getNumero()
				/*+ ", getSolde()=" + getSolde()*/ + ", getDateOuverture()=" + getDateOuverture()
				+ ", getCompteBancaireClient()=" + getCompteBancaireClient() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public static float remuneration() {
		
		float remuneration = (CompteEpargne.soldeCompteEpargne * 3 / 100) ;
		CompteEpargne.soldeCompteEpargne  = CompteEpargne.soldeCompteEpargne + remuneration ; 
		
		return CompteEpargne.soldeCompteEpargne;
	}
	
}
