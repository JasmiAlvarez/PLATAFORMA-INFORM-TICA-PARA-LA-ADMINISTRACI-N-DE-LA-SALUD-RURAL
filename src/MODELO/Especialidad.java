
package MODELO;



public class Especialidad {



    private int idespecialidad;
    private String nombre;


  public Especialidad() {
    }

    public Especialidad(int idespecialidad, String nombre) {
        this.idespecialidad = idespecialidad;
        this.nombre = nombre;
    }

    public int getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(int idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre; 
    
} }