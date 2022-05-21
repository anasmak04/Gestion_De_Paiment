
public class EmployeFixe extends Employe {
	double salaire;
	public EmployeFixe(String nom, String prenom, String data_naissance,double salaire) {
		super(nom,prenom,data_naissance);
		this.salaire = salaire;
	}
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	
	@Override
	public String toString() {
		return "EmployeFixe : \n"+ "mon nom est : " + getNom()+"\n" + "mon prenom est  : " + getPrenom() +"\n" + "mon date_naissance est : " + getData_naissance() +"\n" + "salaire est : " + salaire;
	}
	
	
	
	
	
}
