package domain;

public class Conseiller {

	
	//attribut
	private int id;
	private String nom; 
	private String prenom;
	private String email;
	
	private Client clientDuConseiller ;	
	
	
	// getter setteurs
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Client getClientDuConseiller() {
		return clientDuConseiller;
	}
	public void setClientDuConseiller(Client clientDuConseiller) {
		this.clientDuConseiller = clientDuConseiller;
	}
	
	
	// constructeur
	public Conseiller(int id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		
	}	
		
		public Conseiller(int id, String nom, String prenom, String email , Client clientDuConseiller ) {
			super();
			this.clientDuConseiller = clientDuConseiller;
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
		}
		
		
	
	// méthodes métiers
public void faireVirement () {
	System.out.println("le virement est fait");
}
	
	
	public void	simulationCreditConso () {
		System.out.println("vous souhaitez faire un credit conso");
	
		
		
	}
	
	public void	simulationCreditimmo () {
		System.out.println("le credit conso");
	
	}
	
	
	
}


