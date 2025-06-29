
package UTILITARIOS;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class ColorDetalleEstadoJTable extends DefaultTableCellRenderer {
    
    private final Color CELESTE_OSCURO = new Color(0, 123, 167);
    private final Color VERDE = new Color(46, 204, 113);
    private final Color ANARANJADO = new Color(243, 156, 18);
    private final Color BLANCO = Color.WHITE;
    private final Color NEGRO = Color.BLACK;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Fuente y alineación
        setHorizontalAlignment(CENTER);
        c.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        // Fondo blanco por defecto para las filas
        if (!isSelected) {
            c.setBackground(BLANCO);
            c.setForeground(NEGRO);
        }

   
        if (column == 6 && value != null) {
            String estado = value.toString().toUpperCase();
            switch (estado) {
                case "PENDIENTE":
                    c.setBackground(VERDE);
                    c.setForeground(BLANCO);
                    break;
                case "ATENDIDO":
                    c.setBackground(ANARANJADO);
                    c.setForeground(BLANCO);
                    break;
                default:
                    c.setBackground(CELESTE_OSCURO);
                    c.setForeground(BLANCO);
                    break;
            }
        }

    
        if (isSelected) {
            c.setBackground(new Color(33, 150, 243));
            c.setForeground(BLANCO);
        }

        return c;
    }


    public static void personalizarEncabezado(JTable tabla) {
        JTableHeader header = tabla.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 14));
        header.setBackground(new Color(0, 123, 167)); 
       
        header.setForeground(Color.WHITE);
    }
}