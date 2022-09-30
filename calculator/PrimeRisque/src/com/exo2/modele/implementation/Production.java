package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeAbst;

public class Production extends EmployeAbst {

int nu;
	




public Production(String nom, String prenom, int age, String string, int nu) {
	super(nom, prenom, age, string);
	this.nu = nu;
}


public int getNu() {
	return nu;
}


@Override
public int CalculerSalaire() {
	salaire = getNu() * 5 ;
	return salaire ;
}


}
