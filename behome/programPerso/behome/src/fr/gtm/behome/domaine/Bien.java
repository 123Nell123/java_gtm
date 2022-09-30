package fr.gtm.behome.domaine;

public class Bien {
	// decla
	private String type;
	private int surface;
	private int prix;
	private Boolean disponible ;
	private String entrepreneur;
	private int Id;
	
	//TODO association bilaterale
	
private Agent AgentPropriete;
	
	
	
	//getters setters

	
	
	
	// construction

	

public String getType() {
	return type;
}


public int getId() {
	return Id;
}


public void setId(int id) {
	Id = id;
}


public Bien(String type, int surface, int prix, Boolean disponible, String entrepreneur, int Id) {
	super();
	this.type = type;
	this.surface = surface;
	this.prix = prix;
	this.disponible = disponible;
	this.entrepreneur = entrepreneur;
	this.Id = Id;
	
}
public Bien(String type, int surface, int prix, Boolean disponible, String entrepreneur, 
			Agent agentPropriete) {
		super();
		this.type = type;
		this.surface = surface;
		this.prix = prix;
		this.disponible = disponible;
		this.entrepreneur = entrepreneur;
		AgentPropriete = agentPropriete;
	}


public void setType(String type) {
	this.type = type;
}


public int getSurface() {
	return surface;
}


public void setSurface(int surface) {
	this.surface = surface;
}


public int getPrix() {
	return prix;
}


public void setPrix(int prix) {
	this.prix = prix;
}


public Boolean getDisponible() {
	return disponible;
}


public void setDisponible(Boolean disponible) {
	this.disponible = disponible;
}


public String getEntrepreneur() {
	return entrepreneur;
}


public void setEntrepreneur(String entrepreneur) {
	this.entrepreneur = entrepreneur;
}




public Agent getAgentPropriete() {
	return AgentPropriete;
}


public void setAgentPropriete(Agent agentPropriete) {
	AgentPropriete = agentPropriete;
}


	
	
	
// methode

	// methode


	
	
	@Override
	public String toString() {
		return "Bien [type=" + type + ", surface=" + surface + ", prix=" + prix + ", disponible=" + disponible
				+ ", entrepreneur=" + entrepreneur + ", Id=" + Id + ", AgentPropriete=" + AgentPropriete + "]";
	}	
}

