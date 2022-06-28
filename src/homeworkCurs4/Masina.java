package homeworkCurs4;

public class Masina extends Vehicul {

	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}
	
	
	

	@Override
	public void String nume() {
		return "masina";
	}
	@Override
	public void String motorizare() {
		return "motor";
	}
	
}
