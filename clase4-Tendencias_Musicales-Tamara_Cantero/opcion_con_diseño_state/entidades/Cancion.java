package entidades;

import utilesYtendencias.*;

public class Cancion {
	private String titulo;
	private String artista;
	private String album;
	private int anioAlbum;
	private int anioCancion;
	
	private int likes;
	private int dislikes;
	private int reproducciones;
	private int horasDesdeUltimaReproduccion;
	
	private tendencia t;
	
	public Cancion(String titulo, String artista, String album, int anioAlbum,int anioCancion) {
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anioAlbum = anioAlbum;
		this.anioCancion=anioCancion;
		this.likes = likes;
		this.dislikes = dislikes;
		this.reproducciones = reproducciones;
		this.horasDesdeUltimaReproduccion = horasDesdeUltimaReproduccion;
		t=new Normal();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public String getAlbum() {
		return album;
	}

	public int getAnioAlbum() {
		return anioAlbum;
	}

	public int getAnioCancion() {
		return anioCancion;
	}	

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	public int gethorasDesdeUltimaReproduccion() {
		return horasDesdeUltimaReproduccion;
	}

	public void sethorasDesdeUltimaReproduccion(int horasDesdeUltimaReproduccion) {
		this.horasDesdeUltimaReproduccion = horasDesdeUltimaReproduccion;
	}
	
	
	public tendencia getT() {
		return t;
	}

	public String reproducir() {
		t=t.verificarTendencia(this);
		return t.mostrarMensaje(this);
		
	}
}
