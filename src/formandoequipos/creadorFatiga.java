package formandoequipos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class creadorFatiga {

	
	public static void  escribirarchivodeFatiga() throws IOException{
		
		PrintWriter out = new PrintWriter(new File("fatiga.in"));
		out.println("500\n");
		out.println("5000\n");
		for (int i = 0; i < 5000; i++) {
			for (int j = 0; j < 500; j++) {
				out.println("a");
			}
			out.println("\n");
		}
		
		System.out.println("Escribiendo el archivo . . .");
		out.close();
		
	}
}
