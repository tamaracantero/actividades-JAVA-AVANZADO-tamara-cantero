package actividades_clase3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class actividad_2 {

	public static void main(String[] args) {
		List<String> lista=Arrays.asList("hola","buenos","dias","unaFrase","otra","frase");
		System.out.println("palabras encontradas: ");
		System.out.println(recolectorDeStrings(lista, 4));

	}
	
	public static String recolectorDeStrings(List<String> palabras, int tamaño) {
		String palabrasJuntadas="";
    	palabrasJuntadas=palabras.stream().map(palabra->{ 
    			if(palabra.length()>tamaño) {
    				return palabra+", ";
    			}else {
    				return "";
    			}
    		}).collect(Collectors.joining());	
		return palabrasJuntadas;
	}
}
