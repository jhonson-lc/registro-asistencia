package formularios;

import BD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroDocente extends javax.swing.JFrame {

    private String cedula, nombre, appaterno, apmaterno, direccion, telefono, sexo, contraseña, correo;

    public RegistroDocente() {
        initComponents();
        setTitle("Registro Docente");
        setResizable(false);
        setLocationRelativeTo(null);
        cedula = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidop = new javax.swing.JTextField();
        txt_apellidom = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        cbx_sexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Docente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 610, 30));

        jLabel2.setText("Cédula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 90, -1, -1));

        jLabel4.setText("Apellido paterno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setText("Apellido materno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 170, -1, -1));

        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 50, -1, -1));

        txt_cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 158, -1));

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 158, -1));

        txt_apellidop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidopKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 158, -1));

        txt_apellidom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidomKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 158, -1));

        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 158, -1));

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 169, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 90, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 90, 40));

        jLabel10.setText("Contraseña");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 169, -1));

        jLabel11.setText("Correo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 140, -1, -1));

        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 169, -1));

        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(cbx_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 610, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cedula = txt_cedula.getText().trim();
        nombre = txt_nombre.getText().trim();
        appaterno = txt_apellidop.getText().trim();
        apmaterno = txt_apellidom.getText().trim();
        direccion = txt_direccion.getText().trim();
        telefono = txt_telefono.getText().trim();
        sexo = (String) cbx_sexo.getSelectedItem();
        contraseña = txt_contraseña.getText().trim();
        correo = txt_correo.getText().trim();    

        if (cedula.equals("") || nombre.equals("") || appaterno.equals("") || apmaterno.equals("")
                || direccion.equals("") || telefono.equals("") || sexo.trim().equals("") || contraseña.equals("")
                || correo.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            try {
                Connection cn = ConexionBD.conectar();
                PreparedStatement ps = cn.prepareStatement("insert into docentes (ID, cedula, contraseña, nombre,"
                        + "apellido_paterno, apellido_materno, correo, sexo, direccion, telefono, jornada_manana,"
                        + "jornada_tarde) values (?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, 0);
                ps.setString(2, cedula);
                ps.setString(3, contraseña);
                ps.setString(4, nombre);
                ps.setString(5, appaterno);
                ps.setString(6, apmaterno);
                ps.setString(7, correo);
                ps.setString(8, sexo.trim());
                ps.setString(9, direccion);
                ps.setString(10, telefono);
                ps.setString(11, "");
                ps.setString(12, "");
                ps.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(this, "Registro Exitoso");
                this.dispose();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txt_cedula.setText(null);
        txt_nombre.setText(null);
        txt_apellidop.setText(null);
        txt_apellidom.setText(null);
        cbx_sexo.setSelectedIndex(0);
        txt_telefono.setText(null);
        txt_direccion.setText(null);
        txt_contraseña.setText(null);
        txt_correo.setText(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char valor = evt.getKeyChar();

        if (Character.isLetter(valor))
            evt.consume();
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char valor = evt.getKeyChar();

        if (Character.isDigit(valor))
            evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidopKeyTyped
        char valor = evt.getKeyChar();

        if (Character.isDigit(valor))
            evt.consume();
    }//GEN-LAST:event_txt_apellidopKeyTyped

    private void txt_apellidomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidomKeyTyped
        char valor = evt.getKeyChar();

        if (Character.isDigit(valor))
            evt.consume();
    }//GEN-LAST:event_txt_apellidomKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char valor = evt.getKeyChar();

        if (Character.isLetter(valor))
            evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbx_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellidom;
    private javax.swing.JTextField txt_apellidop;
    public static javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
