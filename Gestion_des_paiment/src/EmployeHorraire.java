
public class EmployeHorraire extends Employe {
	double taux_horaire, heures,salaire;
	public EmployeHorraire(String nom, String prenom, String data_naissance,double salaire,double taux_horaire,double heures) {
		super(nom,prenom,data_naissance);
		this.taux_horaire = taux_horaire;
		this.heures = heures;
		this.salaire = (taux_horaire * heures);
	}
	public double getTaux_horaire() {
		return taux_horaire;
	}
	public void setTaux_horaire(double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}
	public double getHeures() {
		return heures;
	}
	public void setHeures(double heures) {
		this.heures = heures;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "EmployeHorraire : \n" + "mon nom est : " + getNom() + "\n"+ ", mon prenom est  : " + getPrenom() + "\n"+ "mon date_naissance est : " + getData_naissance() + "\n"+ "taux_horaire :" + taux_horaire + "\n"+ "heures : " + heures + "\n"+ "salaire_mensuel : " + salaire;
	}
	
	
}
