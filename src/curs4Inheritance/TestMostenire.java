package curs4Inheritance;

public class TestMostenire {

	public static void main(String[] args) {
		
		//Angajat --> Tester --> TesterAutomat
		
		TesterAutomat tester = new TesterAutomat();

		tester.setLimbajProgramare("Java"); // clasa TesterAutomat
		tester.setSenioritate("Junior"); //--> Clasa Tester
		tester.setDepartament("QA"); //-->Clasa Tester
		tester.setNume("Matei"); //-->Clasa Angajat
		tester.setEmail("matei@matei.com"); //-->Clasa Angajat
		
		
		System.out.println("Numele testerului este : " + tester.getNume() 
		+ ", face parte din departamentul " + tester.getDepartament() 
		+ ", este de nivel de senioritate " + " si scrie teste automate folosind "
		+ tester.getLimbajProgramare() );
		
	}

}
