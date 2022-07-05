package curs7;

public class TestTextFileProccesor {

	public static void main(String[] args) {
		
		TextFileProcessor obj = new TextFileProcessor();
		obj.writeTxtFile("Textul meu din fisier!\n");
		obj.addToTXTFile("Noul meu text!\n");
		obj.addToTXTFile("Alt text!");
		obj.readTxtFile();
		obj.deleteTxtFile();
	}

}
