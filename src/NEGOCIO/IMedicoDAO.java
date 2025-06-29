
package NEGOCIO;

import java.util.List;
import MODELO.Medico;

public interface IMedicoDAO {
    void registrar(Medico m);
    List<Medico> listar();
}