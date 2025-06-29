
package MODELO;

public class Paciente {
    private int codigopaciente;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String fechanacimiento;
    private String seguro;
    private String motivo;

    public Paciente() {}

    public Paciente(int codigopaciente, String nombres, String apellidos, String dni, String telefono, String fechanacimiento, String seguro, String motivo) {
        this.codigopaciente = codigopaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.seguro = seguro;
        this.motivo = motivo;
    }

    public int getCodigopaciente() { return codigopaciente; }
    public void setCodigopaciente(int codigopaciente) { this.codigopaciente = codigopaciente; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getFechanacimiento() { return fechanacimiento; }
    public void setFechanacimiento(String fechanacimiento) { this.fechanacimiento = fechanacimiento; }

    public String getSeguro() { return seguro; }
    public void setSeguro(String seguro) { this.seguro = seguro; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
