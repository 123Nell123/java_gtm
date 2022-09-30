package com.exo2.lanceur;

import com.exo2.modele.implementation.Manutention;
import com.exo2.modele.implementation.ManutentionDangereux;
import com.exo2.modele.implementation.Personnel;
import com.exo2.modele.implementation.Production;
import com.exo2.modele.implementation.ProductionDangereux;
import com.exo2.modele.implementation.Representant;
import com.exo2.modele.implementation.Vendeur;

public class Launch {

	
	
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// definition variable
		//TODO scanner
//		int ca_an=100;
//		int nh = 10;
//		int nu = 4;
//		String typeEmploye1 = "vendeur";
//		String Nom1 = "pasqua";
//		String Prenom1= "charles";
//		String Nomprenom= Nom1 + Prenom1;
//		int salaire;
//		
//		
//		CalculerSalaire calcul=new CalculerSalaire();
//		calcul.calculersalaire(typeEmploye1, Nom1, Prenom1);
//
//		
		
		        Personnel p = new Personnel();
		        
		  
		        
	        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
		        p.ajouterEmploye(new Production("Yves", "Bosseur", 28, "1998", 1000));
		        p.ajouterEmploye(new Manutention("Jeanne", "Stocketout", 32, "1998", 45));
		        p.ajouterEmploye(new ManutentionDangereux("Jean", "Flippe", 28, "2000", 1000));
		        p.ajouterEmploye(new ManutentionDangereux("Al", "Abordage", 30, "2001", 45));
		        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
		        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
		        p.ajouterEmploye(new Production("Yves", "Bosseur", 28, "1998", 1000));
		        p.ajouterEmploye(new Manutention("Jeanne", "Stocketout", 32, "1998", 45));
		        p.ajouterEmploye(new ProductionDangereux("Jean", "Flippe", 28, "2000", 1000));
		        p.ajouterEmploye(new ManutentionDangereux("Al", "Abordage", 30, "2001", 45));

		        p.afficherSalaires();
		        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
		    }
		
		
	
	}
	
		
	
	

