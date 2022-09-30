package com.exo.java.lanceur;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Scanner;

import com.exo.java.ihm.Saisie;
import com.exo.java.metier.DetermineParite;

public class Lancement {

	public static void main(String[] args ) 
	{
		Saisie exo1 = null;
		ArrayList<Integer> aa= exo1.EntreLesValeurs();
		exo1.afficheResume(aa);
	
	}
	
}




