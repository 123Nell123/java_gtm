package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeRisque;

public class ManutentionDangereux extends Manutention implements EmployeRisque{

	
	

	public ManutentionDangereux(String nom, String prenom, int age, String string, int nh) {
		super(nom, prenom, age, string, nh);
		// TODO Auto-generated constructor stub
	}

	public int calculSalaire() {

		return super.CalculerSalaire()+ primeMensuelle ;
			
			}
	
}
