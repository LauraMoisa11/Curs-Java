package homeworkCurs4;

public class VerificareMotorizare {
	
	
	
	public static void main(String[] args) {

		Masina masina = new Masina("Dacia", 5, 180, "Logan", "benzina");
		Bicicleta bicicleta = new Bicicleta("Bmx", 0, 20, "Turbo", "pedale");
		
		
		masina.verificareMotorizare();
		
		bicicleta.verificareMotorizare();
		
		masina.detaliiVehicul();
		
		
		//blic static void verificaMotorizare(Vehicul obj) {
			//stem.out.println(obj.nume + obj.motorizare);
		//
		
			
			
	
	}
	public void verificareMotorizare() {
		System.out.println("generica");
	}

}
