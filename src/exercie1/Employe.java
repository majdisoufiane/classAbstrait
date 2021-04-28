package exercie1;



public abstract class Employe {
public Employe(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

private String nom ;
private String prenom ;
private int age ;
private String date;

public abstract double  calculerSalaire();

public String getNom() {
	return " Employe= nom"+nom+ " "+ "prenom" +prenom   ;

}

@Override
public String toString() {
	return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
} 

}
