
package NEGOCIO;

import java.sql.*;
import java.util.*;
import MODELO.Cita;
import MODELO.Paciente;
import MODELO.Medico;

import BDCONEXION.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CitaDAO implements ICitaDAO {
    
    private Connection con;
    private String sql;

    public CitaDAO() {
        this.con = new Conexion().Conectar();
    }

    @Override
    public void registrar(Cita c) {
        String sql = "INSERT INTO agendar_cita(fecha, hora, codigopaciente, idespecialidad, codigomedico, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getFecha());
            ps.setString(2, c.getHora());
            ps.setInt(3, c.getCodigopaciente());
            ps.setInt(4, c.getIdespecialidad());
            ps.setInt(5, c.getCodigomedico());
            ps.setString(6, c.getMotivo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
public Paciente buscarPacientePorDni(String dniBuscado) {
    Paciente paciente = null;
    String sql = "SELECT codigopaciente, nombres, apellidos, dni, telefono, fechanacimiento, seguro, motivo FROM paciente WHERE dni = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, dniBuscado);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            paciente = new Paciente(
                rs.getInt("codigopaciente"),
                rs.getString("nombres"),
                rs.getString("apellidos"),
                rs.getString("dni"),                
                rs.getString("telefono"),
                rs.getString("fechanacimiento"),
                rs.getString("seguro"),
                rs.getString("motivo")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return paciente;
}
   
    public List<Medico> buscarMedicosPorEspecialidad(String nombreEspecialidad) {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT m.codigomedico, m.nombrecompleto FROM medico m JOIN especialidad e ON m.idespecialidad = e.idespecialidad WHERE e.nombre = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreEspecialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Medico m = new Medico();
                m.setCodigomedico(rs.getInt("codigomedico"));
                m.setNombrecompleto(rs.getString("nombrecompleto"));
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    
}

 public DefaultTableModel mostrarCitas() {
        DefaultTableModel modelo;

        String[] titulos = {"Código", "Fecha", "Hora", "Paciente", "Especialidad", "Médico", "Estado"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT ac.codigocita, ac.fecha, ac.hora, p.nombres AS paciente, e.nombre AS especialidad, m.nombrecompleto AS medico, ac.estado " +
              "FROM agendar_cita ac " +
              "JOIN paciente p ON ac.codigopaciente = p.codigopaciente " +
              "JOIN especialidad e ON ac.idespecialidad = e.idespecialidad " +
              "JOIN medico m ON ac.codigomedico = m.codigomedico " +
              "ORDER BY ac.fecha, ac.hora";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registro[0] = rs.getString("codigocita");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("hora");
                registro[3] = rs.getString("paciente");
                registro[4] = rs.getString("especialidad");
                registro[5] = rs.getString("medico");
                registro[6] = rs.getString("estado");

                modelo.addRow(registro);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return modelo;
    }



public void actualizarEstadoCita(int codigocita, String nuevoEstado) {
    String sql = "UPDATE agendar_cita SET estado = ? WHERE codigocita = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, nuevoEstado);
        ps.setInt(2, codigocita);
        ps.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar estado: " + e.getMessage());
    }
}

    
}
