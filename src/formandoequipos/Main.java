package formandoequipos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Mejorequipo e1 = new Mejorequipo("00_enunciado");
		e1.buscarmejorequipo();
		System.out.println(e1);
		e1.escribir("00_enunciado");
		Mejorequipo e2 = new Mejorequipo("01_gana_cantidad_colaboradores");
		e2.buscarmejorequipo();
		System.out.println(e2);
		e2.escribir("01_gana_cantidad_colaboradores");
		Mejorequipo e3 = new Mejorequipo("02_gana_cantidad_respuestas");
		e3.buscarmejorequipo();
		System.out.println(e3);
		e3.escribir("02_gana_cantidad_respuestas");
		Mejorequipo e4 = new Mejorequipo("03_fatiga");
		e4.buscarmejorequipo();
		System.out.println(e4);
		e4.escribir("03_fatiga");
	}

}
