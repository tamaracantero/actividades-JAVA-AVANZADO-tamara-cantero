package clase1.actividad.tamaracantero;

public class Inscripcion implements Comparable<Inscripcion>{

    private Materia materia;

    private Alumno alumno;

    private int idInscripcion;
    
    private int nota;
    
    private final int aprobacion=6;

    public Inscripcion(Materia materia, Alumno alumno, int idInscripcion, int nota) {
        this.materia = materia;
        this.alumno = alumno;
        this.idInscripcion = idInscripcion;
        this.nota = nota;
    }

    public Inscripcion() {
    }

   

    public Alumno getAlumno() {
        return alumno;
    }

    public int getAprobacion() {
        return aprobacion;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setAalumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    
    public boolean aprobada() {
        return this.nota>=aprobacion;
    }

    @Override
    public int compareTo(Inscripcion o) {
        return (this.idInscripcion>o.idInscripcion)?1:((this.idInscripcion==o.idInscripcion)?-1:0);
    }
}
