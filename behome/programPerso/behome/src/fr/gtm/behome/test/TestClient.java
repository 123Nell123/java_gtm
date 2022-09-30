package fr.gtm.behome.test;

import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import fr.gtm.behome.domaine.Client;

public class TestClient{

	// scenario : verifie que un client à un ID
	
	Client client1 ;
	
	@Test
	public void testClientExiste() {
		client1 = new Client(1);
		Client client2 = new Client(2);
		
		int A1 = client1.getIdClient();
		int A2 = client2.getIdClient();
		System.out.println("verifie l'incrementation des ID clients A1 et A2:"+ A1+" , "+ A2);
		assertNotSame("les Id des agents 1 et 2  sont identiques", A2, A1) ;
	}
	
}
