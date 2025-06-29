
package NEGOCIO;

import MODELO.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    void registrar(Usuario u);
    Usuario buscarPorEmail(String email);
    Usuario login(String email, String contraseña);
    List<Usuario> listar();
}