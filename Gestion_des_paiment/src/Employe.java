
public class Employe {
		
		///// les variables
		
	private	String nom,prenom,data_naissance;
	
	////// constructor
	
	public Employe(String nom, String prenom, String data_naissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.data_naissance = data_naissance;
		}

	////// les Getters / Setters
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getData_naissance() {
		return data_naissance;
	}

	public void setData_naissance(String data_naissance) {
		this.data_naissance = data_naissance;
	}

	@Override
	public String toString() {
		return "Employe : \n" + "mon nom est : " + nom + "\n" + "mon prenom est  : " + prenom + "\n" + "mon date_naissance est : " + data_naissance + "\n" ;
	}
		
		
}
