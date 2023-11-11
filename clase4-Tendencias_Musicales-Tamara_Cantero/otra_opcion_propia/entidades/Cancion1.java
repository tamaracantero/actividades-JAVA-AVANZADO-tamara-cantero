package entidades;

public class Cancion1 {
	private String titulo;
	private String artista;
	private String album;
	private int anioAlbum;
	private int anioCancion;

	private int likes;
	private int dislikes;
	private int reproducciones;
	private int horasDesdeUltimaReproduccion;

	private String t;

	public Cancion1(String titulo, String artista, String album, int anioAlbum, int anioCancion) {
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anioAlbum = anioAlbum;
		this.anioCancion = anioCancion;
		t = "Normal";
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

	public String getT() {
		return t;
	}

	public void reproducir() {
		if (this.reproducciones < 1000 || (this.t.equals("EnAuge") && dislikes >= 5000)
				|| (t.equals("EnTendencia") && horasDesdeUltimaReproduccion > 24)) {

			t = "Normal";
			System.out.println(/* icono: */Iconos.MUSICAL_NOTE.getIcono() + " " + /* nombre artista: */artista + "-"
					+ /* nombre album: */album + "-" + /* titulo cancion: */titulo);

		} else if ((t.equals("Normal") && reproducciones > 1000) && (reproducciones < 50000 && likes < 20000)) {

			t = "EnAuge";
			System.out.println(/* icono: */Iconos.ROCKET.getIcono() + " " + /* nombre artista: */artista + "-"
					+ /* titulo cancion: */titulo + "(" + /* nombre album: */album + "-" + /* año Album: */anioAlbum
					+ ")");

		} else if (reproducciones > 50000 && likes > 20000) {

			t = "EnTendencia";
			System.out.println(/* icono: */Iconos.FIRE.getIcono() + " " + /* titulo cancion: */titulo + "-"
					+ /* nombre artista: */artista + "(" + /* nombre album: */album + "-" + /* año Album: */anioAlbum
					+ ")");

		} else {
			t = t;
		}
	}
}
