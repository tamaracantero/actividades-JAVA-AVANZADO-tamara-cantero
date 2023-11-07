package actividades_clase3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class actividad_1 {

	public static void main(String[] args) {
		List<String> frases=Arrays.asList("hola","soy","una","frase");
		
		transformador(frases).forEach(frase->System.out.println(frase));
		
	}

	public static List<String> transformador(List<String> frases){
		return frases.stream().map(frase->frase.toUpperCase()).collect(Collectors.toList());
	}
}
