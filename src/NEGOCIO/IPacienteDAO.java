
package NEGOCIO;


import java.util.List;
import MODELO.Paciente;

public interface IPacienteDAO {
    void registrar(Paciente paciente);
    List<Paciente> listar();
}