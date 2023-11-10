package utilesYtendencias;

import entidades.Cancion;

public class EnTendencia extends tendencia {

	public EnTendencia( ) {
		super("EnTendencia");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMensaje(Cancion c) {
		System.out.println(/*icono:*/Iconos.FIRE.getIcono()
				+" "+/*titulo cancion:*/c.getTitulo()
				+"-"+/*nombre artista:*/c.getArtista()
				+"("+/*nombre album:*/c.getAlbum()
				+"-"+/*año Album:*/c.getAnioAlbum()+")");
	}

}
