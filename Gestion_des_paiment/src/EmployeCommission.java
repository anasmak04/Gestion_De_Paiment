
public class EmployeCommission extends Employe {
	double salaire, ventes , commission;
	
	double slaire_mensuel;
	public EmployeCommission(String nom, String prenom, String data_naissance,double salaire,double ventes,double commission, double slaire_mensuel) {
		super(nom,prenom,data_naissance);
		this.salaire = salaire;
		this.ventes = ventes;
		this.commission = commission;
		this.slaire_mensuel = salaire + (ventes * commission);
	}
	
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double getVentes() {
		return ventes;
	}
	public void setVentes(double ventes) {
		this.ventes = ventes;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getSlaire_mensuel() {
		return slaire_mensuel;
	}
	public void setSlaire_mensuel(double slaire_mensuel) {
		this.slaire_mensuel = slaire_mensuel;
	}
	
	
	@Override
	public String toString() {
		return "EmployeCommission : \n" + "mon nom est : " + getNom() + "\n" + "mon prenom est  : " + getPrenom() + "\n" + "mon date_naissance est : " + getData_naissance() + "\n" +
		 "salaire : " + salaire + "\n" + "ventes : " + ventes + "\n" + "commission : " + commission + "\n" + "salaire_mensuel : " + slaire_mensuel ;
	}
	
}
