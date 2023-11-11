package pruebas_unitarias_con_patron_state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import entidades.Cancion;
import utilesYtendencias.EnAuge;
import utilesYtendencias.EnTendencia;
import utilesYtendencias.Iconos;
import utilesYtendencias.Normal;
import utilesYtendencias.tendencia;

class pruebas_unitarias {
	/*public Cancion(String titulo, String artista, String album, int anioAlbum,int anioCancion)*/
	//primer if mal, se arreglo sacando el reproducciones<1000
	//segundo if esta bien
	//tercer if dio mal
	private static Cancion c=new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002,2002);
	
	/*@Test
	public void pruebaMetodoVerificarTendenciasTercerIf() {
		
		c.sethorasDesdeUltimaReproduccion(12);
		c.setLikes(30000);
		c.setReproducciones(79000);
		
		boolean resultado= (c.getReproducciones()>50000 && c.getLikes()>20000) && (c.getReproducciones()<50000 && c.getLikes()<20000);
		boolean esperado=true;
	
		assertEquals(esperado, resultado);
	}*/
	@Test
	public void casoDePrueba1() {
		
		String resultado=c.reproducir();
		String esperado=/*icono:*/Iconos.MUSICAL_NOTE.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*nombre album:*/c.getAlbum()
				+"-"+/*titulo cancion:*/c.getTitulo();
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void casoDePrueba2() {
		
		c.setReproducciones(1500);
		
		String resultado=c.reproducir();
		
		assertEquals(/*icono:*/Iconos.ROCKET.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*titulo cancion:*/c.getTitulo()
				+"("+/*nombre album:*/c.getAlbum()
				+"-"+/*año Album:*/c.getAnioAlbum()+")"
					, resultado);
	}
	
	@Test
	public void casoDePrueba3() {
		
		c.setDislikes(5346);
		
		String resultado=c.reproducir();
		
		assertEquals(/*icono:*/Iconos.MUSICAL_NOTE.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*nombre album:*/c.getAlbum()
				+"-"+/*titulo cancion:*/c.getTitulo()
					, resultado);
	}
	
	@Test
	public void casoDePrueba4() {
		
		c.setLikes(34567);
		c.setReproducciones(50001);
		
		String resultado=c.reproducir();
		
		assertEquals(/*icono:*/Iconos.FIRE.getIcono()
				+" "+/*titulo cancion:*/c.getTitulo()
				+"-"+/*nombre artista:*/c.getArtista()
				+"("+/*nombre album:*/c.getAlbum()
				+"-"+/*año Album:*/c.getAnioAlbum()+")"
					, resultado);
	}
	
	@Test
	public void casoDePrueba5() {
		
		c.sethorasDesdeUltimaReproduccion(25);
		
		String resultado=c.reproducir();
		
		assertEquals(/*icono:*/Iconos.MUSICAL_NOTE.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*nombre album:*/c.getAlbum()
				+"-"+/*titulo cancion:*/c.getTitulo()
					, resultado);
	}

}
