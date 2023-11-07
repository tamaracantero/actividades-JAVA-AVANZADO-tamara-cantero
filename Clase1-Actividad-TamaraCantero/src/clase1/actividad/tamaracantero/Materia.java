package clase1.actividad.tamaracantero;

import java.util.ArrayList;

public class Materia implements Comparable<Materia>{
    
    private String  nombre;
    private int idMateria;
    private boolean estado;
    private ArrayList<Materia> correlativas;
    
    public Materia(String nombre, int idMateria, boolean estado,ArrayList<Materia> correlativas) {
        this.nombre = nombre;
        this.idMateria = idMateria;
        this.estado = estado;
        this.correlativas=correlativas;
    }

    public Materia() {
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Materia o) {
        return (this.idMateria>o.idMateria)?1:((this.idMateria==o.idMateria)?-1:0);
    }
}
