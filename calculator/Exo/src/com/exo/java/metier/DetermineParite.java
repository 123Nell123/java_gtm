package com.exo.java.metier;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.exo.java.exception.ExceptionNeg;
import com.exo.java.modele.Operation;

public class DetermineParite implements Operation {

	public String parite(int entier) throws ExceptionNeg {
		// prend un int en parametre entier et determine si il est pair renvoi un resultat string (pair, impair, ou null)
		String result="";
		if (entier <0) throw new ExceptionNeg("negatif");
			
		else if (entier ==0) 
		{result=null ; }
		else if (entier%2==0) 
		{ result ="pair";}
		else if (entier%2==1)
		{ result="impair";}	
		System.out.println(entier+" a est " + result );
			return result;
		}

	public void parite(String string) {	
		//utilise que pour tester la condition exception notAInteger
	}

	@Override
	public void afficher() {
		// affiche tout les test demandes pas utilise en ce moment
	}
	
}
