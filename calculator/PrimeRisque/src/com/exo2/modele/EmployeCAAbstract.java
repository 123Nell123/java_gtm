package com.exo2.modele;



public abstract class EmployeCAAbstract extends EmployeAbst {
	private int CA;
	
	//getteur et setteur;
	
	public int getCA() {
	return CA;
	}
//
//	public void setCA(int cA) {
//		CA = cA;
//	}
	
	
	// constructeur
	
//	public EmployeCAAbstract() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public EmployeCAAbstract(String nom, String prenom) {
//		super(nom, prenom);
//		// TODO Auto-generated constructor stub
//	}
//
//	
//	public EmployeCAAbstract(String nom, String prenom,  int cA) {
//		super(nom, prenom);
//		CA = cA;
//	}
	
	public EmployeCAAbstract(String nom, String prenom, int age, String dateentre, int cA) {
		super(nom, prenom, age, dateentre);
		CA = cA;
	}

	//methode metier
//	public abstract   int CalculerSalaire(int CA);

	
}
