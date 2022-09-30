package com.exo2.lanceur;

import com.exo2.modele.implementation.Vendeur;

public class CalculerSalaire {

	

	public static  void calculersalaire(String typeEmploye, String Nom, String Prenom) {
			
if (typeEmploye=="vendeur")
			
		{
	
		Vendeur vendeur1;
		vendeur1 = new Vendeur(Prenom,Nom,1000, null, 0);

		int salaireFinal = vendeur1.CalculerSalaire();
			System.out.println("salaire " + salaireFinal);
//		
		
		}
		
		}
	
}
