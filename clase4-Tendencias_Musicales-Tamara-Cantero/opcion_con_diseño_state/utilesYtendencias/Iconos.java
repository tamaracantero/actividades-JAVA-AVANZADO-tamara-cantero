package utilesYtendencias;

public enum Iconos {
	MUSICAL_NOTE(new int[] {0xD83C, 0xDFB5}),
	ROCKET(new int[] {0xD83D, 0xDE80}),
	FIRE(new int[]{0xD83D, 0xDD25});
	
	private String icono;
	
	private Iconos(int[] icono) {
		this.icono=new String(icono,0,icono.length);
	}
	
	public String getIcono(){
		return this.icono;
	}
}
