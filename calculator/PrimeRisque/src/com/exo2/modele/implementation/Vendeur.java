package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeCAAbstract;

public class Vendeur extends EmployeCAAbstract {

	


	public Vendeur(String nom, String prenom, int age, String dateentre, int cA) {
		super(nom, prenom, age, dateentre, cA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int CalculerSalaire() {
		salaire = (this.getCA() *20) + 400;
		return salaire;

	}




//	@Override
//	public String toString() {
//		return "Vendeur [getCA()=" + getCA() + ", getnom()=" + getnom() + ", getPrenom()=" + getPrenom() + ", toString()="
//				+ super.toString() + "]";
//	}


	




}
