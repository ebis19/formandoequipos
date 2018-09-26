package formandoequipos;

import java.io.IOException;

public class mejorequipotest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String pathin="./Preparacion de Pruebas/Lote de pruebas/Entrada/";
		String pathout="./Ejecucion de Prueba/Salida Obtenida/";
		Mejorequipo e1 = new Mejorequipo( pathin+"00_enunciado");
		e1.buscarmejorequipo();
		System.out.println(e1);
		e1.escribir(pathout+"00_enunciado");
		Mejorequipo e2 = new Mejorequipo(pathin+"02_gana_cantidad_colaboradores");
		e2.buscarmejorequipo();
		System.out.println(e2);
		e2.escribir(pathout+"02_gana_cantidad_colaboradores");
		Mejorequipo e3 = new Mejorequipo(pathin+"01_gana_cantidad_respuestas");
		e3.buscarmejorequipo();
		System.out.println(e3);
		e3.escribir(pathout+"01_gana_cantidad_respuestas");
		Mejorequipo e4 = new Mejorequipo(pathin+"03_fatiga");
		e4.buscarmejorequipo();
		System.out.println(e4);
		e4.escribir(pathout+"03_fatiga");

	}

}
