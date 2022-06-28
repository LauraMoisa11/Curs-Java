package homeworkCurs4;

public class Masina extends Vehicul {

	public Masina(String brand, int nivelPoluare, int vitezaMedie, String nume, String motorizare) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
		
	}
	

	@Override
	public void detaliiVehicul() {
		
		System.out.println();
	}
	public void verificaMotorizare() {
		System.out.println();
	}
	
}
