
package NEGOCIO;

import java.sql.*;
import java.util.*;
import MODELO.Medico;
import BDCONEXION.Conexion;

public class MedicoDAO implements IMedicoDAO {
    private Connection con;

    public MedicoDAO() {
        this.con = new Conexion().Conectar();
    }

    @Override
    
    
    
    
    public void registrar(Medico m) {
        String sql = "INSERT INTO medico(nombrecompleto, idespecialidad, horarios_disponible, turno, telefono, email) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getNombrecompleto());
            ps.setInt(2, m.getIdespecialidad());
            ps.setString(3, m.getHorarios_disponible());
            ps.setString(4, m.getTurno());
            ps.setString(5, m.getTelefono());
            ps.setString(6, m.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    @Override
    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medico";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Medico m = new Medico(
                    rs.getInt("codigomedico"),
                    rs.getString("nombrecompleto"),
                    rs.getInt("idespecialidad"),
                    rs.getString("horarios_disponible"),
                    rs.getString("turno"),
                    rs.getString("telefono"),
                    rs.getString("email")
                );
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}