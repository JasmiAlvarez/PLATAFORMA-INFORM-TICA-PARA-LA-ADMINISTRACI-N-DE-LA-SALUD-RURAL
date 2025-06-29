


package NEGOCIO;
import java.sql.*;
import java.util.*;
import MODELO.*;
import BDCONEXION.Conexion;

public class UsuarioDAO implements IUsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = new Conexion().Conectar();
    }

    @Override
    public void registrar(Usuario u) {
        String sql = "INSERT INTO usuario(nombre, email, contraseña, tipo_usuario) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getContraseña());
            ps.setString(4, u.getTipoUsuario());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        String sql = "SELECT * FROM usuario WHERE email = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("idusuario"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("contraseña"),
                    rs.getString("tipo_usuario")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Usuario login(String email, String contraseña) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND contraseña = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("idusuario"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("contraseña"),
                    rs.getString("tipo_usuario")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Usuario(
                    rs.getInt("idusuario"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("contraseña"),
                    rs.getString("tipo_usuario")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
