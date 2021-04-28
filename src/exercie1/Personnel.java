package exercie1;

import java.util.ArrayList;

public class Personnel {
	
	ArrayList<Employe> liste =new ArrayList<>();
	
	public void ajouterEmploye(Employe employe) {
		
		liste.add(employe);
		
		
	}
	 
	
	public void afficherSalaire() {
		for (Employe employe : liste) {
			System.out.println(employe.calculerSalaire());
		}
	}

	
	public double SalaireMoyenne() 
	
	{
		double somme=0;
		return 0 ;
	}
	
}
