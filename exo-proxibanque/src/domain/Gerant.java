package domain;

public class Gerant extends Conseiller {
	
	
	//attribut
	public Agence AgenceduGerant;
	// constructeur
	public Gerant(int id, String nom, String prenom, String email) {
		super(id, nom, prenom, email);	
	}
		
	// m�thodes m�tiers
public void auditCompte ()
{
System.out.println("le solde des comptes est" );
}


	
}


