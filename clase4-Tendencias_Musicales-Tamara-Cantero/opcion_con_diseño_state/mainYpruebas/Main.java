package mainYpruebas;

import utilesYtendencias.*;
import entidades.Cancion1;
public class Main {

	public static void main(String[] args) {
		/*public Cancion(String titulo, String artista, String album, int anioAlbum,int anioCancion)*/
		Cancion1 c=new Cancion1("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002,2002);
		
		System.out.println("caso de prueba 1:");
		c.reproducir();
		
		System.out.println("caso de prueba 2:");
		c.setReproducciones(1500);
		c.reproducir();
		
		System.out.println("caso de prueba 3:");
		c.setDislikes(5346);
		c.reproducir();
		
		System.out.println("caso de prueba 4:");
		c.setLikes(34567);
		c.setReproducciones(72585);
		c.reproducir();
		
		System.out.println("caso de prueba 5:");
		c.sethorasDesdeUltimaReproduccion(27);
		c.reproducir();
		

	}

}
