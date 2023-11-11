package utilesYtendencias;

import entidades.Cancion;

public class Normal extends tendencia{

	public Normal() {
		super("Normal");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarMensaje(Cancion c) {
		System.out.println(/*icono:*/Iconos.MUSICAL_NOTE.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*nombre album:*/c.getAlbum()
				+"-"+/*titulo cancion:*/c.getTitulo());
		return (/*icono:*/Iconos.MUSICAL_NOTE.getIcono()
				+" "+/*nombre artista:*/c.getArtista()
				+"-"+/*nombre album:*/c.getAlbum()
				+"-"+/*titulo cancion:*/c.getTitulo());
	}

	
}
