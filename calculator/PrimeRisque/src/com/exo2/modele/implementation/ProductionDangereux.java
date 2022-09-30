package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeRisque;

public class ProductionDangereux extends Production implements EmployeRisque {

	
	
	public ProductionDangereux(String nom, String prenom, int age, String string, int nu) {
		super(nom, prenom, age, string, nu);
		// TODO Auto-generated constructor stub
	}

	public int calculSalaire() {

		return  super.CalculerSalaire() + primeMensuelle ;
		
	}
	
	
}
