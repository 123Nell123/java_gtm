package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeCAAbstract;

public class Representant extends EmployeCAAbstract {

	private final static int BONUS_VENDEUR = 800;

public Representant(String nom, String prenom, int age, String string, int cA) {
		super(nom, prenom, age, string, cA);
		// TODO Auto-generated constructor stub
	}

@Override
	public int CalculerSalaire() {
		salaire = (getCA()*20/100) + BONUS_VENDEUR;
		return salaire;
	
	}


}
