
package MODELO;

public class Medico {
    private int codigomedico;
    private String nombrecompleto;
    private int idespecialidad;
    private String horarios_disponible;
    private String turno;
    private String telefono;
    private String email;

    public Medico() {}

    public Medico(int codigomedico, String nombrecompleto, int idespecialidad, String horarios_disponible, String turno, String telefono, String email) {
        this.codigomedico = codigomedico;
        this.nombrecompleto = nombrecompleto;
        this.idespecialidad = idespecialidad;
        this.horarios_disponible = horarios_disponible;
        this.turno = turno;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCodigomedico() { return codigomedico; }
    public void setCodigomedico(int codigomedico) { this.codigomedico = codigomedico; }

    public String getNombrecompleto() { return nombrecompleto; }
    public void setNombrecompleto(String nombrecompleto) { this.nombrecompleto = nombrecompleto; }

    public int getIdespecialidad() { return idespecialidad; }
    public void setIdespecialidad(int idespecialidad) { this.idespecialidad = idespecialidad; }

    public String getHorarios_disponible() { return horarios_disponible; }
    public void setHorarios_disponible(String horarios_disponible) { this.horarios_disponible = horarios_disponible; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}