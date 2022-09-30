package com.exo2.modele.implementation;

import java.util.Date;

import com.exo2.modele.EmployeAbst;

public class Manutention extends EmployeAbst {

int nh;





public Manutention(String nom, String prenom, int age, String string, int nh) {
	super(nom, prenom, age, string);
	this.nh = nh;
}






public int getNh() {
	return nh;
}






@Override
public int CalculerSalaire() {
	salaire = getNh() * 65 ;
	return salaire ;
}
}
