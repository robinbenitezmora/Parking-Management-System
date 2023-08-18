import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.Format;
import java.text.Normalizer.Form;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormLogin extends javax.swing.JFrame {

        public FormLogin() {
                initComponents();
                setLocationRelativeTo(null);
                this.getContentPane().setBackground(java.awt.Color.decode("#1FAB89"));
        }

        private void initComponents() {

                JPanel jPanel1 = new javax.swing.JPanel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JLabel jLabel2 = new javax.swing.JLabel();
                JTextField txtUsername = new javax.swing.JTextField();
                JPasswordField txtPassword = new javax.swing.JPasswordField();
                JButton btnLogin = new javax.swing.JButton();
                JButton btnRegister = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(31, 171, 137));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Username");

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Password");

                txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                btnLogin.setBackground(new java.awt.Color(255, 255, 255));
                btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnLogin.setForeground(new java.awt.Color(31, 171, 137));
                btnLogin.setText("Login");
                btnLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                actionPerformed(evt);
                        }
                });

                btnRegister.setBackground(new java.awt.Color(255, 255, 255));
                btnRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnRegister.setForeground(new java.awt.Color(31, 171, 137));
                btnRegister.setText("Register");
                btnRegister.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                actionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1).addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(btnLogin)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                30, Short.MAX_VALUE)
                                                                                .addComponent(btnRegister))
                                                                .addComponent(txtUsername)
                                                                .addComponent(txtPassword))
                                                .addContainerGap(30, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1).addComponent(txtUsername,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(txtPassword,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnLogin).addComponent(btnRegister))
                                                .addContainerGap(30, Short.MAX_VALUE)));
        }
}

class FormRegister extends javax.swing.JFrame {

        public FormRegister() {
                initComponents();
                setLocationRelativeTo(null);
                this.getContentPane().setBackground(java.awt.Color.decode("#1FAB89"));
        }

        private void initComponents() {

                JPanel jPanel1 = new javax.swing.JPanel();
                JLabel jLabel1 = new javax.swing.JLabel();
                JLabel jLabel2 = new javax.swing.JLabel();
                JTextField txtUsername = new javax.swing.JTextField();
                JPasswordField txtPassword = new javax.swing.JPasswordField();
                JButton btnRegister = new javax.swing.JButton();
                JButton btnLogin = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(31, 171, 137));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Username");

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Password");

                txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                btnRegister.setBackground(new java.awt.Color(255, 255, 255));
                btnRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnRegister.setForeground(new java.awt.Color(31, 171, 137));
                btnRegister.setText("Register");
                btnRegister.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                actionPerformed(evt);
                        }
                });

                btnLogin.setBackground(new java.awt.Color(255, 255, 255));
                btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnLogin.setForeground(new java.awt.Color(31, 171, 137));
                btnLogin.setText("Login");
                btnLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                actionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1).addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(btnRegister)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                30, Short.MAX_VALUE)
                                                                                .addComponent(btnLogin))
                                                                .addComponent(txtUsername)
                                                                .addComponent(txtPassword))
                                                .addContainerGap(30, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1).addComponent(txtUsername,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2).addComponent(txtPassword,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnRegister).addComponent(btnLogin))
                                                .addContainerGap(30, Short.MAX_VALUE)));
        };

}

        private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
                AbstractButton txtUsername;
                String username = txtUsername.getText();
                AbstractButton txtPassword;
                String password = txtPassword.getText();

                if (username.equals("") || password.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please input username and password");
                } else {
                        try {
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_toko",
                                                "root", "");
                                Statement stmt = (Statement) con.createStatement();
                                ResultSet rs = ((java.sql.Statement) stmt)
                                                .executeQuery("SELECT * FROM tb_user WHERE username = '" + username
                                                                + "' AND password = '" + password + "'");

                                if (rs.next()) {
                                        JOptionPane.showMessageDialog(null, "Login Success");
                                        new Format().setVisible(true);
                                        this.dispose();
                                } else {
                                        JOptionPane.showMessageDialog(null, "Username or Password is wrong");
                                }
                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Connection Error");
                        }
                }
        }

private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        AbstractButton txtUsername;
        String username = txtUsername.getText();
        AbstractButton txtPassword;
        String password = txtPassword.getText();

        if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please input username and password");
        } else {
                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_toko", "root", "");
                        Statement stmt = (Statement) con.createStatement();
                        ((java.sql.Statement) stmt).executeUpdate("INSERT INTO tb_user(username, password) VALUES('" + username + "','"
                                        + password + "')");
                        JOptionPane.showMessageDialog(null, "Register Success");
                        new FormLogin().setVisible(true);
                        this.dispose();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Connection Error");
                }
                finally {
                        this.dispose();
                }
        }
}``
`
