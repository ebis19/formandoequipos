package formandoequipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Archivodefatiga {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File("fatiga.in"));
		out.println("500");
		out.println("5000");
		for (int i = 0; i < 5000; i++) {
			for (int j = 0; j < 500; j++) {
				out.print("a");
			}
			out.print("\n");
		}
		
		System.out.println("Escribiendo el archivo . . .");
		out.close();

	}

}
