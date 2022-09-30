package domain;

public class Agence {
	
	//attributs
	private int id;
	private String dateCreation;
private Gerant gerantdeAgence;

	//getteurs setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Gerant getGerantdeAgence() {
		return gerantdeAgence;
	}
	public void setGerantdeAgence(Gerant gerantdeAgence) {
		this.gerantdeAgence = gerantdeAgence;
	}


	//constructeur
	
	public Agence(int id, String dateCreation, Gerant gerantdeAgence) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.gerantdeAgence = gerantdeAgence;
	}
	
}
