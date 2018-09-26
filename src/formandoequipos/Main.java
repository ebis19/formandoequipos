package formandoequipos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Mejorequipo e1 = new Mejorequipo("equipo");
		e1.buscarmejorequipo();
		System.out.println(e1);
		e1.escribir("equipo");
	}

}
