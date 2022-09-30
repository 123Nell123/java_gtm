package fr.gtm.behome.domaine;

public class MaxiAgent extends Agent {

	

	// constructeur
	public MaxiAgent(String nom, String prenom, int id, int nbBien, float prime) {
		super(nom, prenom, id, nbBien, prime);
		// TODO Auto-generated constructor stub
	}

	//public Agent( int id,String nom, String prenom, Bien bienAgent)
	
	public MaxiAgent(int id, String nom, String prenom, Bien bienAgent) {
		super(id, nom, prenom, bienAgent);
		// TODO Auto-generated constructor stub
	}

	
	public MaxiAgent(int id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}
// method

	



	@Override
	public void setPrime(float prime) {
		// TODO Auto-generated method stub
		super.setPrime(prime);
	}

	

	@Override
	public void toucherUneCom (float com) {
		
		setPrime((float) (com *0.05)) ;
		super.toucherUneCom(com);
		System.out.println("la maison a coute"+" "+ com + "la prime touchee pour le MaxiAgent" +" "+ getNom()+" "+ "est"+" "+ getPrime() + " "+ "soit 5%" );

	
	
	}




	
	
}
