package homeworkCurs4;

public class VerificareMotorizare {
	
	
	
	public static void main(String[] args) {

		Masina masina = new Masina("Dacia", 5, 180, "Logan", "benzina");
		Bicicleta bicicleta = new Bicicleta("Bmx", 0, 20, "Turbo", null);
		
		System.out.println("Nivelul de poluare pentru masina " + masina.getBrand() + " este: " + 
		masina.getNivelPoluare() + " si viteza medie atinsa este de " + masina.getVitezaMedie() + " km/h.");
		
		masina.verificareMotorizare();
		
		bicicleta.verificareMotorizare();
		
		
		
		
			
			
	
	}

}
