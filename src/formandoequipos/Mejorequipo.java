package formandoequipos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mejorequipo {

	String [] respuestas;
	int preguntas;
	String mejoresp="";
	int mejorAfinidad=0;
	

	public  Mejorequipo(String archivo) throws IOException{
		Scanner in = new Scanner(new File(archivo+".in"));
		this.preguntas = in.nextInt();
		this.respuestas = new String[in.nextInt()];
		this.respuestas[0]= in.next();
		for (int i = 1; i < respuestas.length; i++) {
			this.respuestas[i]= in.next();
		}
		in.close();
		
	}
	public void buscarmejorequipo(){
		
		String resp="";
		int afinidad;
		int colaboradores;
		int i,j,k; 
		for (i = 0; i < this.preguntas ; i++) {
			for (j = 0; j < this.preguntas ; j++) {
				resp=this.respuestas[i].substring(0,j+1);
				colaboradores = 1;
				for (k=i+1;k < this.respuestas.length;k++) {
					if(resp.equals(this.respuestas[k].substring(0,j+1))){
						colaboradores++;
					}
				}
				afinidad=resp.length()*resp.length()*colaboradores;
				if(afinidad>mejorAfinidad && colaboradores>=2) {
					this.mejorAfinidad=afinidad;
					this.mejoresp=resp;
				}
			}
		}
	}
	@Override
	public String toString(){
		return mejorAfinidad+"\n"+mejoresp;
		
	}
	public void  escribir(String archivo) throws IOException{
		PrintWriter out = new PrintWriter(new File(archivo+".out"));
		out.print(this);
		System.out.println("Escribiendo el archivo . . .");
		out.close();
		
	}

}
