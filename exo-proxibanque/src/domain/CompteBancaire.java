package domain;

public class CompteBancaire {
	
	private int numero;
	public static float solde;
	private String dateOuverture;
	private Client compteBancaireClient;
	
	
	public CompteBancaire(int numero, float solde, String dateOuverture, Client compteBancaireClient) {
		super();
		this.numero = numero;
		CompteBancaire.solde = CompteCourant.soldeCC+ CompteEpargne.soldeCompteEpargne;
		this.dateOuverture = dateOuverture;
		this.compteBancaireClient = compteBancaireClient;
	}
	
	public CompteBancaire(int numero,String dateOuverture, Client compteBancaireClient) {
		super();
		this.numero = numero;
		this.dateOuverture = dateOuverture;
		this.compteBancaireClient = compteBancaireClient;
	}


	public CompteBancaire(int numero, float solde, String dateOuverture) {
		super();
		this.numero = numero;
		CompteBancaire.solde = CompteCourant.soldeCC+ CompteEpargne.soldeCompteEpargne;
		this.dateOuverture = dateOuverture;
	}



	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	private float getSolde() {
		return solde;
	}


	private void setSolde(float solde) {
		this.solde = solde;
	}


	public String getDateOuverture() {
		return dateOuverture;
	}


	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	public Client getCompteBancaireClient() {
		return compteBancaireClient;
	}


	public void setCompteBancaireClient(Client compteBancaireClient) {
		this.compteBancaireClient = compteBancaireClient;
	}


	@Override
	public String toString() {
		return "CompteBancaire [numero=" + numero + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ ", compteBancaireClient=" + compteBancaireClient + ", getNumero()=" + getNumero() + ", getSolde()="
				+ getSolde() + ", getDateOuverture()=" + getDateOuverture() + ", getCompteBancaireClient()="
				+ getCompteBancaireClient() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	// TODO virement ce compte a compte
	/* 
	 * un compte A est deibter au profit d'un compte B
	 *  soit x la somme echange
	 */
	
	public static float crediter(int y,float x) {
		
		solde = (solde + x);
		return solde;
		
	}
	
	public static float debiter(int y,float x) {
		
		solde = (solde - x);
		return solde;
		
	}
	
	
	
	
	
	

}
