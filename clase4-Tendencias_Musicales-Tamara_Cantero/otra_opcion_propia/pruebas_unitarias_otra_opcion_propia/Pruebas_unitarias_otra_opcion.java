package pruebas_unitarias_otra_opcion_propia;

import entidades.Iconos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidades.Cancion1;
import entidades.Iconos;

class Pruebas_unitarias_otra_opcion {
	private static Cancion1 c= new Cancion1("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002,2002);
	
	@Test
	public void comprobarNormalTest() {
		String esperado="Normal";
		String resultado="";
		if ((c.getT().equals("EnAuge") && c.getDislikes()>= 5000)
				|| (c.getT().equals("EnTendencia") && c.gethorasDesdeUltimaReproduccion() > 24)) {
			resultado="Normal";
		}
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void comprobarEnAugeTest() {
		String esperado="EnAuge";
		String resultado="";
		
		if ((c.getT().equals("Normal") && c.getReproducciones() > 1000) && (c.getReproducciones() < 50000 && c.getLikes() < 20000)) {

			resultado = "EnAuge";
		}
		
		assertEquals(esperado, resultado);		
		
	}
	@Test
	public void comprobarEnTendenciaTest() {
		
		String esperado="EnTendencia";
		String resultado="";
		
		if (c.getReproducciones() > 50000 && c.getLikes() > 20000) {

			resultado = "EnTendencia";
		
		}
		
		assertEquals(esperado, resultado);

	}
	

}
