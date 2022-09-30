package domain;

public class Gerant extends Conseiller {
	
	
	//attribut
	public Agence AgenceduGerant;
	// constructeur
	public Gerant(int id, String nom, String prenom, String email) {
		super(id, nom, prenom, email);	
	}
		
	// méthodes métiers
public void auditCompte ()
{
System.out.println("le solde des comptes est" );
}


	
}


