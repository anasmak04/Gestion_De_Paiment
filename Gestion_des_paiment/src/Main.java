
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe employe = new Employe("elmakhloufi","anas" , "02-07-2000");
		EmployeFixe empFi = new EmployeFixe("saadaoui","hamid" , "07-02-1998",2000);
		EmployeCommission empCom = new EmployeCommission ("makhloufi","soufiane","01-01-1980",50,80,200.2, 0);
		EmployeHorraire empHor = new EmployeHorraire("bilal","mak","02-08-2014",50.0,50.0,50.0);
		System.out.println(employe.toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(empFi.toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(empCom.toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(empHor.toString());
		
		
	}

}
