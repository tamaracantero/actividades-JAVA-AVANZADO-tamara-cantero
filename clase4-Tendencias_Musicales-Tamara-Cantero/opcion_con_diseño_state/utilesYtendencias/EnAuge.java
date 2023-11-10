package utilesYtendencias;

import entidades.Cancion;
public class EnAuge extends tendencia{

	public EnAuge() {
		super("EnAuge");
	}

	@Override
	public void mostrarMensaje(Cancion c) {
		System.out.println(/*icono:*/Iconos.ROCKET.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*titulo cancion:*/c.getTitulo()
				+"("+/*nombre album:*/c.getAlbum()
				+"-"+/*año Album:*/c.getAnioAlbum()+")");
	}

}
