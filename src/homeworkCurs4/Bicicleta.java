package homeworkCurs4;

public class Bicicleta extends Vehicul{
	
	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie, String nume, String motorizare) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
		
	}
		
	
	@Override
	public void detaliiVehicul() {
		
		System.out.println(nume);
	}
	public void verificaMotorizare() {
		System.out.println(motorizare);
	}
}

