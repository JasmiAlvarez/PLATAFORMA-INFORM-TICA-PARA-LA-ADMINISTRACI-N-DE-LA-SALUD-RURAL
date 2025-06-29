
package NEGOCIO;

import java.sql.*;
import java.util.*;
import MODELO.Especialidad;
import BDCONEXION.Conexion;

public class EspecialidadDAO {
    private Connection con;

    public EspecialidadDAO() {
        this.con = new Conexion().Conectar();
    }
public Vector<Especialidad> mostrarEspecialidades() {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Vector<Especialidad> lista = new Vector<>();
    Especialidad esp = null;

    try {
        String sql = "SELECT * FROM especialidad";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        // Opción por defecto
         esp = new Especialidad();
        esp.setIdespecialidad(0);

        lista.add(esp);

        while (rs.next()) {
            esp = new Especialidad();
            esp.setIdespecialidad(rs.getInt("idespecialidad"));
            esp.setNombre(rs.getString("nombre"));
            lista.add(esp);
        }

        rs.close();

    } catch (SQLException ex) {
        System.err.println(ex.toString());
    }

    return lista;
}}