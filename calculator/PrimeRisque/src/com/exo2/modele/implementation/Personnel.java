package com.exo2.modele.implementation;

import java.util.ArrayList;
import java.util.List;

import com.exo2.modele.EmployeAbst;

public class Personnel {
	
	int salaireTotal = 0 ;	
	//declaration
	List<EmployeAbst> Employes = new ArrayList<EmployeAbst>();
	
	
	
	public void ajouterEmploye(EmployeAbst employe) {
					
						Employes.add(employe);
		
	};

	public void afficherSalaires() {
		
		for ( EmployeAbst i: Employes)
		{
		salaireTotal =	i.CalculerSalaire() + salaireTotal ;
		System.out.println(" salaire est "+ i.CalculerSalaire());
		}
	}
		
		public double salaireMoyen()
		{
			double salMoy = 0;
			int nbreSalarie = Employes.size();
			salMoy = salaireTotal/nbreSalarie ;
			
				
			return salMoy;
		}
			
	
	
	
}
