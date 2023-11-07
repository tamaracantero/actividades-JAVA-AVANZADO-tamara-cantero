package clase1.actividad.tamaracantero;


public class Alumno {
    
    private String nombre;

    private String apellido;

    private int dni;

    private int idAlumno;

    public Alumno(String nombre, String apellido, int dni, int idAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.idAlumno = idAlumno;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    
}
