package actividad_2_tamara_cantero;

import java.util.ArrayList;

public class Main_actividad2 {
/*TRANSFORMADOR
Implemente un método que reciba como parámetro una lista de strings y una interfaz
funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
nuevo listado de String transformados.*/	
	public static void main( String[] args ) {
		ArrayList<String> palabras=new ArrayList<>();
		palabras.add("hola");
		palabras.add("Buenos");
		palabras.add("dias");
		palabras.add("¿como");
		palabras.add("estas?");
		
		System.out.println("Lista Original: ");
	
		palabras.forEach(p->System.out.println(p));
		
		System.out.println("");
		
		Transformador t=(palabra)->palabra.toUpperCase();
		
		System.out.println("Lista Modificada: ");
		
		metodoTransformador(palabras,t).forEach(p->System.out.println(p));
		
		
		
	}
	
	public static ArrayList<String> metodoTransformador(ArrayList<String> palabras,Transformador t){
		for(int i=0;i<palabras.size();i++) {
			palabras.set(i, palabras.get(i).toUpperCase());
		}
		
		return palabras;
	}
	
}
