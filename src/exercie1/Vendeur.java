package exercie1;

public class Vendeur extends Employe {

	public Vendeur(String nom, String prenom, int age, String date, double chifa) {
		super(nom, prenom, age, date);
		this.chifa = chifa;
	}

	private double chifa ;

	
	 public double calculerSalaire() {
	        return chifa*0.2+400;
	    }
	
	
	
	
	}
      




