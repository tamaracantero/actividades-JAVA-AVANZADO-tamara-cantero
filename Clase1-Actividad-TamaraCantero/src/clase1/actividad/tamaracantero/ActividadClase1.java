package clase1.actividad.tamaracantero;

import java.util.ArrayList;


public class ActividadClase1 {

    private static ArrayList<Materia> materiasProgramacion1 = new ArrayList<>();
    public static void main(String[] args) {
        //se crean materias

        //AED=algoritmos y estructura de datos

    	//PDP=paradigmas de programacion
    	
        //DDS=diseño de sistemas
         

        Materia AED = new Materia("Algoritmos y estructura de datos", 1, true,new ArrayList<>());
        Materia PDP = new Materia("Paradigmas de programacion", 2, true, new ArrayList<>());
        Materia DDS = new Materia("Diseño de sistemas", 3, true, new ArrayList<>());

        //se crean los ARRAYLISTs de CORRELATIVAS CORRESPONDIENTES
        //AED no posee
        //PDP
         
        ArrayList<Materia> correlativasDePDP = new ArrayList<>();
        correlativasDePDP.add(AED);
        //agrega las correlativas de sus materias correlativas, ya que tambien son sus correlativas
        //aunque en este caso AED no posee correlativas
        for (Materia materia : correlativasDePDP) {
            if (!(materia.getCorrelativas().isEmpty())) {
                correlativasDePDP.addAll(materia.getCorrelativas());
            }
        }
        PDP.setCorrelativas(correlativasDePDP);
        
        //DDS
        ArrayList<Materia> correlativasDeDDS = new ArrayList<>();
        correlativasDeDDS.add(PDP);
      //agrega las correlativas de sus materias correlativas, ya que tambien son sus correlativas
        for (Materia materia : correlativasDeDDS) {
            if (!(materia.getCorrelativas().isEmpty())) {
                correlativasDePDP.addAll(materia.getCorrelativas());
            }
        }
        DDS.setCorrelativas(correlativasDeDDS);
        
        //se listan las materias disponibles
        materiasProgramacion1.add(AED);
        materiasProgramacion1.add(PDP);
        materiasProgramacion1.add(DDS);

        // ingresa el alumno a la escuela
         
        Alumno alumno1 = new Alumno("Tamara", "Cantero", 12345678, 12);
        System.out.println("se reagistro el alumno "+alumno1.getNombre()+ alumno1.getApellido());
    
        System.out.println("se crea el legajo del alumno");
        ArrayList<Inscripcion> legajoInscripciones1 = new ArrayList<>();

        System.out.println("se intenta agregar la materia "+materiasProgramacion1.get(2).getNombre()+" al legajo");
     
        // recibe la materia a inscribirse,las inscripciones registradas, el alumno y devuelve pasos a seguir
        Inscripcion i=inscribirse(materiasProgramacion1.get(2), legajoInscripciones1, alumno1);
        
        //se inscribe en la materia correcta
        System.out.println("Se inscribe en la materia correcta: "+materiasProgramacion1.get(0).getNombre());
        
        legajoInscripciones1.add(i);
        legajoInscripciones1.get(i.getIdInscripcion()-1).setNota(5);
        
        System.out.println("nota examen: "+legajoInscripciones1.get(0).getNota()+", materia: "+legajoInscripciones1.get(0).getMateria().getNombre());
        
        
        System.out.println("Se intenta inscribir en la siguiente materia: "+materiasProgramacion1.get(1).getNombre());
        
        i=inscribirse(materiasProgramacion1.get(1), legajoInscripciones1, alumno1);
        
        System.out.println("nombre materia a aprobar: "+i.getMateria().getNombre());
        legajoInscripciones1.get(i.getIdInscripcion()-1).setNota(7);
        System.out.println("luego del segundo examen nota:"+legajoInscripciones1.get(i.getIdInscripcion()-1).getNota()+", materia: "+legajoInscripciones1.get(i.getIdInscripcion()-1).getMateria().getNombre());
        
            System.out.println("Se intenta inscribir en la siguiente materia: "+materiasProgramacion1.get(1).getNombre()+", de nuevo");
    
        i=inscribirse(materiasProgramacion1.get(1), legajoInscripciones1, alumno1);
        
        System.out.println("nombre materia a aprobar: "+i.getMateria().getNombre());
        
        
        legajoInscripciones1.add(i);
        legajoInscripciones1.get(1).setNota(8);
        System.out.println("luego del tercer examen nota:"+legajoInscripciones1.get(1).getNota()+", materia: "+legajoInscripciones1.get(1).getMateria().getNombre());
            System.out.println("Se intenta inscribir en la siguiente materia: "+ materiasProgramacion1.get(2).getNombre());
    
        i=inscribirse(materiasProgramacion1.get(2), legajoInscripciones1, alumno1);
        
        System.out.println("nombre materia a aprobar: "+i.getMateria().getNombre());
        
        
        legajoInscripciones1.add(i);
        legajoInscripciones1.get(2).setNota(10);
        System.out.println("nota cuarto examen: "+legajoInscripciones1.get(2).getNota()+", materia: "+legajoInscripciones1.get(2).getMateria().getNombre());
        if(legajoInscripciones1.get(2).aprobada()){
            System.out.println("FELICIDADES HA APROBADO TODAS LAS MATERIAS");
        }else {
            System.out.println("LO SENTIMOS, HAS REPROBADO LA ULTIMA MATERIA");
        }
    }

    /**
     * recibe la materia a inscribirse,las inscripciones registradas, el alumno y devuelve pasos a seguir
    */
        
    private static Inscripcion inscribirse(Materia peticion, ArrayList<Inscripcion> aprobaciones, Alumno a) {
        //inscripcion a devolver
    	Inscripcion i=null;
    	//bandera para evaluar la posibilidad de inscripcion
        boolean flag = false;
        //materia correcta a inscribir
        Materia necesariaActual = new Materia();
        if (!peticion.getCorrelativas().isEmpty()) {
            /**
             * RECORRE LAS CORRELATIVAS NECESARIAS
             */
            for (Materia materia : peticion.getCorrelativas()) {
                if (!aprobaciones.isEmpty()) {
                    /**
                     * REVISA SI ENTRE LAS INSCRIPCIONES DEL ALUMNO SE
                     * ENCUENTRAN Y SI ESTAN APROBADAS
                     */
                    for (Inscripcion inscripcion : aprobaciones) {
                        if (inscripcion.getMateria().getIdMateria() == materia.getIdMateria()) {
                            if (inscripcion.aprobada()) {
                                flag = true;
                            } else {
                                flag = false;
                                necesariaActual = inscripcion.getMateria();
                                break;
                            }
                        }
                    }
                }else{
                    System.out.println("usted no posee notas registradas, inscribase inicialmente en "
                        + materiasProgramacion1.get(0).getNombre() + " para llegar a la materia "
                        + peticion.getNombre());
                        return new Inscripcion(materiasProgramacion1.get(0), a, 1, 0);
                }
                if (!flag) {
                    break;
                }
            }
        } else {
            System.out.println("Usted puede inscribirse en la materia " + peticion.getNombre());
            i = new Inscripcion(peticion, a, aprobaciones.size()+1, 0);
            return i;
        }
        if (flag) {
            System.out.println("Usted puede inscribirse en la materia " + peticion.getNombre());
            i = new Inscripcion(peticion, a, aprobaciones.size()+1, 0);
        }else{
            System.out.println("Usted no puede inscribirse en la materia " + peticion.getNombre()+" porque no aprobo la "
                    + "materia correlativa anterior");
            System.out.println("Primero debe aprobar "+necesariaActual.getNombre());
            i = obtenerInscripcionXMateria(necesariaActual, aprobaciones);
        }
        return i;
    }
    
    public static Inscripcion obtenerInscripcionXMateria(Materia materia,ArrayList<Inscripcion> inscripciones) {
    	for(Inscripcion i:inscripciones) {
    		if(i.getMateria().getIdMateria()==materia.getIdMateria()) {
    			
    			return i;
    		}
    		
    	}
    	return new Inscripcion();
    }
}
