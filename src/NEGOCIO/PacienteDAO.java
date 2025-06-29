
package NEGOCIO;


import java.sql.*;
import java.util.*;
import MODELO.Paciente;
import BDCONEXION.Conexion;

public class PacienteDAO implements IPacienteDAO {
    private Connection con;

    public PacienteDAO() {
        this.con = new Conexion().Conectar();
    }

    @Override
    public void registrar(Paciente p) {
        String sql = "INSERT INTO paciente(nombres, apellidos, dni, telefono, fechanacimiento, seguro, motivo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getDni());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getFechanacimiento());
            ps.setString(6, p.getSeguro());
            ps.setString(7, p.getMotivo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean existeDni(String dni) {
    String sql = "SELECT 1 FROM paciente WHERE dni = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, dni);
        try (ResultSet rs = ps.executeQuery()) {
            return rs.next(); 
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    
    
    @Override
    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Paciente p = new Paciente(
                    rs.getInt("codigopaciente"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("dni"),
                    rs.getString("telefono"),
                    rs.getString("fechanacimiento"),
                    rs.getString("seguro"),
                    rs.getString("motivo")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}