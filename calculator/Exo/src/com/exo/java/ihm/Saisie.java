package com.exo.java.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.exo.java.metier.DetermineParite;

public class Saisie {

// cette classe permet de rentrer dans le system.in des valeurs 
	
	
	public static ArrayList<Integer>  EntreLesValeurs (){
		// entre des valeurs et les envoies a la classe parite
		//retourne la liste de valeur entree
		
		ArrayList<Integer> chiffres= new ArrayList<>();
		//liste d array qui permet de rentrer la list d'integer
		//hasmap
		Map<Integer, String> maHashMap = new HashMap<Integer, String>();
		
		
		
		Boolean encore = true;
		while (encore == true) 
		{
			

			try {
				Scanner scanner = new Scanner( System.in )  ;

				System.out.print( "Veuillez saisir un premier entier puis cliquer sur enter 2 fois:" );
				String sortie = scanner.nextLine();
				int a =Integer.parseInt(sortie);
				
				DetermineParite pp= new DetermineParite();
				scanner.nextLine();
				try {
					String resul = pp.parite(a);
					chiffres.add(a);
					maHashMap.put(a,resul);
					} 
				catch (Exception eNegatif) {
				
					eNegatif.printStackTrace();
					System.out.println("il faut mettre une valeur negative");
					}
				

				}
			catch (NumberFormatException ePasUnInt) {
				ePasUnInt.printStackTrace();
				System.out.println("la valeur n'est pas un integer");

				};


				
			
			try {
				Scanner sc1= new Scanner(System.in);	
				System.out.println("Voulez vous continuez (true or false) ?");
					
				//String reponse = sc1.next();
				//encore = Boolean.parseBoolean(reponse);
				encore = sc1.nextBoolean();
				}
			catch (IllegalFormatException pasBonneReponse) {
				pasBonneReponse.printStackTrace();
				System.out.println("mettre un booleans svp");
				}
			finally 
			{System.out.println("fin du test");}
		}
		Iterator iterator = maHashMap.keySet().iterator() ;
		while (iterator.hasNext())
			{
			Object o = iterator.next();
			System.out.println(o+ " est "+maHashMap.get(o));;
		
			};
		System.out.println("fin de l'exercie, aurevoir");
		return chiffres;

	}
	
	//TODO faire un resume en distinguant les pairs des impairs
	
	//option1: faire 2 listes une pair et une impair et afficher chacune
	//option2: faire une liste cle valeur dans laquelle on range les elements et leurs valeurs au fur et a mesure
	public static void afficheResume(ArrayList<Integer> maList) {
		for (int i:maList) {
			System.out.println("rappel des valeurs testées " +i);
		}
		
		
	}

}
