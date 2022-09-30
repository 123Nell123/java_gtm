package com.exo2.modele;

import java.util.Date;

public abstract  class EmployeAbst {

	private String nom;
private String prenom;	
private int age ;
private String dateentre;
private String id;

protected int salaire;





//int salaire;

//@Override
//public String toString() {
//	return "EmployeAbst [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateentre=" + dateentre + ", id=" + id
//			+ ", salaire=" + salaire + "]";
//}

//
//public String getnom() {
//	return nom;
//}
//
//public void setNom(String nom) {
//	this.nom = nom;
//}
//public String getPrenom() {
//	return prenom;
//}
//public void setPrenom(String prenom) {
//	this.prenom = prenom;
//}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
//public Date getDateentre() {
//	return dateentre;
//}
//public void setDateentre(Date dateentre) {
//	this.dateentre = dateentre;
//}


// consctructeur



//public EmployeAbst(String nom, String prenom, int age, Date dateentre, String id) {
//	super();
//	this.nom = nom;
//	this.prenom = prenom;
//	this.age = age;
//	this.dateentre = dateentre;
//	this.id = id;
//}

//public EmployeAbst(String nom, String prenom) {
//	super();
//	this.nom = nom;
//	this.prenom = prenom;
//	
//}
//
//public EmployeAbst() {
//	super();
//}

public EmployeAbst(String nom, String prenom, int age, String dateentre) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.dateentre = dateentre;
}




//methode metier
public String getNom() {
	id = nom+prenom;
	return id;
}


public  abstract int CalculerSalaire();

	
}
