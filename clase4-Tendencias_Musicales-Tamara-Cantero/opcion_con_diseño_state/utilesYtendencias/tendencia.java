package utilesYtendencias;

import entidades.Cancion;
public abstract class tendencia {
	protected final String nombre;
	
	
	public tendencia(String nombre) {
		this.nombre = nombre;
	}
	
	
	public abstract void mostrarMensaje(Cancion c);
	
	
	public tendencia verificarTendencia(Cancion c) {
		String nameTend=c.getT().nombre;//nameTend: nombre de la tendencia
		tendencia t;
		
		if(c.getReproducciones()<1000 
		|| (nameTend.equals("EnAuge") && c.getDislikes()>=5000) 
		|| (nameTend.equals("EnTendencia") && c.gethorasDesdeUltimaReproduccion()>24)) {
	
			t=new Normal();
			return t;
		
		}else if((nameTend.equals("Normal")&& c.getReproducciones()>1000) && (c.getReproducciones()<50000 && c.getLikes()<20000)){
		
			t=new EnAuge();
			return t;
		
		}else if(c.getReproducciones()>50000 && c.getLikes()>20000){
		
			t=new EnTendencia();
			return t;
		
		}else {
			return c.getT();
		}
	}
}
