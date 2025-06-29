
package MODELO;

public class Cita {
    private int codigocita;
    private String fecha;
    private String hora;
    private int codigopaciente;
    private int idespecialidad;
    private int codigomedico;
    private String motivo;



            
    public Cita() {}

    public Cita(int codigocita, String fecha, String hora, int codigopaciente, int idespecialidad, int codigomedico, String motivo) {
        this.codigocita = codigocita;
        this.fecha = fecha;
        this.hora = hora;
        this.codigopaciente = codigopaciente;
        
      
            
        this.idespecialidad = idespecialidad;
        this.codigomedico = codigomedico;
        this.motivo = motivo;
    }

    public int getCodigocita() { return codigocita; }
    public void setCodigocita(int codigocita) { this.codigocita = codigocita; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public int getCodigopaciente() { return codigopaciente; }
    public void setCodigopaciente(int codigopaciente) { this.codigopaciente = codigopaciente; }

    
   
    
    public int getIdespecialidad() { return idespecialidad; }
    public void setIdespecialidad(int idespecialidad) { this.idespecialidad = idespecialidad; }

    public int getCodigomedico() { return codigomedico; }
    public void setCodigomedico(int codigomedico) { this.codigomedico = codigomedico; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
