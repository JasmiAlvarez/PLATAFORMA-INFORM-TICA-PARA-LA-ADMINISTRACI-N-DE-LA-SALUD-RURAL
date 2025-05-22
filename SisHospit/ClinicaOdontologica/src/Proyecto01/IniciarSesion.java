package Proyecto01;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {
   
   
   public static String NombUsuario, user; // Global, para usarlo en otros formularios
   
   public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);  // centrar ventana
}
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelarInicio1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIAR SESION");
        setMinimumSize(new java.awt.Dimension(200, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnIniciarSesion.setText("Registros de Pacientes");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCancelarInicio1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnCancelarInicio1.setText("Registro Médico");
        btnCancelarInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInicio1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\glend\\Downloads\\LogoSample_ByTailorBrands.jpg")); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDOS AL HOSPITAL");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\glend\\Downloads\\usuarios (2).png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\glend\\Downloads\\alt-administrador.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\glend\\Downloads\\angulo-pequeno-derecho.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarSesion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelarInicio1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(btnIniciarSesion))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        cConnection cn = new cConnection(); // invoca a la clase que conecta

        Statement  st = null;
        ResultSet  rs = null;
        String query;

        int band = 0; //bandera para verificación

        user = txtUser.getText();
        String passw = txtPassw.getText();

        if("".equals(txtUser.getText()))
        JOptionPane.showMessageDialog(null, "Ingrese nombre de usuario");
        else
        if("".equals(txtPassw.getText()))
        JOptionPane.showMessageDialog(null, "Ingrese contraseña");
        else
        {   query = "SELECT * FROM USUARIO WHERE nombre = '"+user+"' AND contraseña = '"+passw+"'";

            try{
                st = cn.ObtenerConexion().createStatement();
                rs = st.executeQuery(query);

                while(rs.next()){
                    if(rs.getString(1) == null)
                    band = 0;  // no coincide user o passw
                    else
                    band = 1;
                }
            }
            catch (SQLException ex){
                JOptionPane.showConfirmDialog(null, "ERROR DE ACCESO"+ex);
            }

            if (band == 1)
            {
                NombUsuario = txtUser.getText();

                this.setVisible(false);

                try {
                    final FormSplash sp = new FormSplash();

                    sp.setVisible(true);

                    final MainForm vp = new MainForm();

                    Thread hilos = new Thread()
                    {   @Override
                        public void run(){

                            for(int i = 0; i<=100; i++)
                            {
                                sp.lblPorcentaje.setText(i+"%");  // En modo diseño, lblPorcentaje cambiar Propiedades Code a Publico

                                if(i==10)
                                sp.lblEstado.setText("Cargando Modulos...");  // En modo diseño, lblEstado cambiar Propiedades Code a Publico
                                else
                                if(i==50)
                                sp.lblEstado.setText("Conectando con la Base de datos...");
                                else
                                if(i==90)
                                sp.lblEstado.setText("Iniciando Aplicación...");
                                else
                                if(i==100)
                                {   sp.setVisible(false);
                                    vp.setVisible(true);
                                }

                                sp.pgBarraCarga.setValue(i);  //Coloca porcentaje en la barra // En modo diseño, pgBarraCarga cambiar Propiedades Code a Publico

                                try {
                                    Thread.sleep(30);  //Velocidad de Carga
                                }
                                catch (InterruptedException ex) {
                                }
                            }
                        }
                    };

                    hilos.start();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Fatal ERROR, Carga erronea de los modulos");
                }
            }
            else
            {   JOptionPane.showMessageDialog(null,"ERROR. Vuelva a Ingresar");
                this.setVisible(rootPaneCheckingEnabled);   // muestra la ventana actual
                this.txtUser.setText("");
                this.txtPassw.setText("");
                this.txtUser.requestFocus();
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnCancelarInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarInicio1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

public static void main(String args[]) {
  
     java.awt.EventQueue.invokeLater(new Runnable() {

     public void run() {
                new IniciarSesion().setVisible(true);
            }
     });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarInicio1;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


