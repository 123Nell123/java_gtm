package domain;

public class Client {



	
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String tel;
	private char carteElectron;
	private char cartePremier;
	private char entrepriseParticulier;
	private Conseiller conseillerClient;
	private CompteBancaire comptebancaireClient;
	
	
	//constructeur
	
	public Client(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
			char carteElectron, char cartePremier, char entrepriseParticulier, Conseiller conseillerClient,
			CompteBancaire comptebancaireClient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		this.carteElectron = carteElectron;
		this.cartePremier = cartePremier;
		this.entrepriseParticulier = entrepriseParticulier;
		this.conseillerClient = conseillerClient;
		this.comptebancaireClient = comptebancaireClient;
	}
	
	public Client(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
			char carteElectron, char cartePremier, char entrepriseParticulier, Conseiller conseillerClient
			)
	{
		
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		this.carteElectron = carteElectron;
		this.cartePremier = cartePremier;
		this.entrepriseParticulier = entrepriseParticulier;
		this.conseillerClient = conseillerClient;
	}

	public Client(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
			char carteElectron, char cartePremier, char entrepriseParticulier)
		
		{
			
			
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.codePostal = codePostal;
			this.ville = ville;
			this.tel = tel;
			this.carteElectron = carteElectron;
			this.cartePremier = cartePremier;
			this.entrepriseParticulier = entrepriseParticulier;
			
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public String getPrenom() {
			return prenom;
		}



		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}



		public String getAdresse() {
			return adresse;
		}



		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}



		public String getCodePostal() {
			return codePostal;
		}



		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}



		public String getVille() {
			return ville;
		}



		public void setVille(String ville) {
			this.ville = ville;
		}



		public String getTel() {
			return tel;
		}



		public void setTel(String tel) {
			this.tel = tel;
		}



		public char getCarteElectron() {
			return carteElectron;
		}



		public void setCarteElectron(char carteElectron) {
			this.carteElectron = carteElectron;
		}



		public char getCartePremier() {
			return cartePremier;
		}



		public void setCartePremier(char cartePremier) {
			this.cartePremier = cartePremier;
		}



		public char getEntrepriseParticulier() {
			return entrepriseParticulier;
		}



		public void setEntrepriseParticulier(char entrepriseParticulier) {
			this.entrepriseParticulier = entrepriseParticulier;
		}



		public Conseiller getConseillerClient() {
			return conseillerClient;
		}



		public void setConseillerClient(Conseiller conseillerClient) {
			this.conseillerClient = conseillerClient;
		}



		public CompteBancaire getComptebancaireClient() {
			return comptebancaireClient;
		}



		public void setComptebancaireClient(CompteBancaire comptebancaireClient) {
			this.comptebancaireClient = comptebancaireClient;
		}

		
		
		
		// methode metiers
		

		
		

	/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal="
					+ codePostal + ", ville=" + ville + ", tel=" + tel + ", carteElectron=" + carteElectron
					+ ", cartePremier=" + cartePremier + ", entrepriseParticulier=" + entrepriseParticulier
					+ ", conseillerClient=" + conseillerClient + ", comptebancaireClient=" + comptebancaireClient + "]";
		}

	public void creer(int id , String nom)
	{System.out.println("le compte  ref"+id + " de Mr Ou Mme" +nom+"est créé.");
	}




	public void modifier(int id , String nom)
	{System.out.println("le compte  ref"+id + " de Mr Ou Mme" +nom+ "est modifié.");
	}


	public void afficher(String nom, int numero )
	{System.out.println("le compte  ref"+id + "appartient à Mr Ou Mme" +nom );
	System.out.println();
	}
	/*
	public class CompteBancaire {
		
		private int numero;
		public static float solde;
		private String dateOuverture;
		private Client compteBancaireClient;
		*/
		
		
		

	public void supprimerClient()
	{System.out.println("le compte  ref"+id + " de Mr Ou Mme" +nom+ "est supprimé.");
	}




	}
	
