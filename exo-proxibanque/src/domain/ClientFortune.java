package domain;

public class ClientFortune extends Client{
	
	
	
	//constructeur


	



/**
 * @param id
 * @param nom
 * @param prenom
 * @param adresse
 * @param codePostal
 * @param ville
 * @param tel
 * @param carteElectron
 * @param cartePremier
 * @param entrepriseParticulier
 * @param conseillerClient
 * @param comptebancaireClient
 */
public ClientFortune(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
		char carteElectron, char cartePremier, char entrepriseParticulier, Conseiller conseillerClient,
		CompteBancaire comptebancaireClient) {
	super(id, nom, prenom, adresse, codePostal, ville, tel, carteElectron, cartePremier, entrepriseParticulier,
			conseillerClient, comptebancaireClient);
	// TODO Auto-generated constructor stub
}

/**
 * @param id
 * @param nom
 * @param prenom
 * @param adresse
 * @param codePostal
 * @param ville
 * @param tel
 * @param carteElectron
 * @param cartePremier
 * @param entrepriseParticulier
 * @param conseillerClient
 */
public ClientFortune(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
		char carteElectron, char cartePremier, char entrepriseParticulier, Conseiller conseillerClient) {
	super(id, nom, prenom, adresse, codePostal, ville, tel, carteElectron, cartePremier, entrepriseParticulier,
			conseillerClient);
	// TODO Auto-generated constructor stub
}

/**
 * @param i
 * @param string
 * @param string2
 * @param string3
 * @param string4
 * @param string5
 * @param string6
 * @param c
 * @param d
 * @param e
 */
public ClientFortune(int i, String string, String string2, String string3, String string4, String string5,
		String string6, char c, char d, char e) {
	super(i, string, string2, string3, string4, string5, string6, c, d, e);

}

//méthode métier

//TODO completer instruction placement
public void fairePlacement () {

	System.out.println("le placement de a été fait depuis le compte"+ this.getComptebancaireClient());

}
	
	}
	

	
	


