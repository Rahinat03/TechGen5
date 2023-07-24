package com.example.pharmacymanangementsystem;



import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

public class Login extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    static String NAME;
    public static JTextField id;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JSeparator jSeparator1;
    private JPasswordField pass;

    public Login() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/Untitled.png")));
        this.initComponents();
        this.con = Connect.connect();
        (new changestyle()).chabgelock();
        SwingUtilities.updateComponentTreeUI(this);
        this.login_Hold();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        id = new JTextField();
        this.pass = new JPasswordField();
        this.jSeparator1 = new JSeparator();
        this.jPanel4 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jPanel5 = new JPanel();
        this.jLabel5 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setTitle("Login");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(10, 0, 60));
        this.jLabel1.setFont(new Font("Times New Roman", 3, 30));
        this.jLabel1.setForeground(new Color(255, 255, 0));
        this.jLabel1.setText("Login Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(247).addComponent(this.jLabel1, -2, 181, -2).addContainerGap(228, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(19).addComponent(this.jLabel1, -1, 45, 32767).addContainerGap()));
        this.jPanel2.setLayout(jPanel2Layout);
        this.jLabel2.setIcon(new ImageIcon(Login.class.getResource("/img/login.png")));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder((Border)null, "Login Information", 0, 0, new Font("Tahoma", 1, 12), new Color(255, 255, 255)));
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setForeground(new Color(255, 255, 255));
        this.jLabel3.setText("User_ID : ");
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setText("User_Password : ");
        id.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Login.this.idMouseClicked(evt);
            }
        });
        id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Login.this.idKeyReleased(evt);
            }
        });
        this.pass.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Login.this.passMouseClicked(evt);
            }
        });
        this.pass.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Login.this.passKeyReleased(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel4)).addGap(19, 19, 19).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.pass).addComponent(id)).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(id, -2, -1, -2)).addGap(25, 25, 25).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.pass, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setText("Login");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setText("Cancel");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap(138, 32767).addComponent(this.jButton1, -2, 78, -2).addGap(27).addComponent(this.jButton2, -2, 73, -2).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.jButton1)).addContainerGap(21, 32767)));
        this.jPanel4.setLayout(jPanel4Layout);
        this.jPanel5.setBackground(new Color(51, 51, 51));
        this.jPanel5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jLabel5.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel5.setText("Note : Password should be at least 6 Characters ");
        this.jLabel5.setForeground(new Color(200, 100, 0));
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel5).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel5).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, 656, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2, -2, 290, -2).addGap(18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jSeparator1).addComponent(this.jPanel4, -1, 328, 32767).addComponent(this.jPanel5, -1, 328, 32767).addComponent(this.jPanel3, -1, 328, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addGap(8).addComponent(this.jPanel5, -2, -1, -2).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2, -1, 270, 32767)))));
        this.jPanel1.setLayout(jPanel1Layout);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(662, 380));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
        this.setDefaultCloseOperation(3);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (!id.getText().equals("") && !this.pass.getText().equals("")) {
            String sql = "select ID,NAME,PASSWORD from users where ID='" + id.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.res = this.pre.executeQuery();
                if (this.res.next()) {
                    NAME = this.res.getString("NAME");
                    if (this.res.getString("PASSWORD").equals(this.pass.getText())) {
                        Pharmacy pharmacy = new Pharmacy();
                        if (id.getText().equals("1")) {
                            this.dispose();
                            pharmacy.setVisible(true);
                        } else {
                            this.dispose();
                            pharmacy.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Wrong Password", "Failed Access", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Wrong ID", "Failed Access", 2);
                }
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Login Information", "Missing Information", 2);
        }

    }

    private void passKeyReleased(KeyEvent evt) {
        if (this.pass.getForeground().equals(Color.GRAY)) {
            char passs = this.pass.getText().charAt(0);
            this.pass.setText("");
            this.pass.setText(String.valueOf(passs));
            this.pass.setForeground(Color.BLACK);
            this.pass.setEchoChar('*');
        }

    }

    private void passMouseClicked(MouseEvent evt) {
        if (this.pass.getForeground().equals(Color.GRAY)) {
            this.pass.setText("");
            this.pass.setForeground(Color.BLACK);
            this.pass.setEchoChar('*');
        }

    }

    private void idKeyReleased(KeyEvent evt) {
        if (id.getForeground().equals(Color.GRAY)) {
            char idd = id.getText().charAt(0);
            id.setText("");
            id.setText(String.valueOf(idd));
            id.setForeground(Color.BLACK);
        }

    }

    private void idMouseClicked(MouseEvent evt) {
        if (id.getForeground().equals(Color.GRAY)) {
            id.setText("");
            id.setForeground(Color.BLACK);
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var4;
            int var3 = (var4 = UIManager.getInstalledLookAndFeels()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                UIManager.LookAndFeelInfo info = var4[var2];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Login()).setVisible(true);
            }
        });
    }

    private void login_Hold() {
        this.pass.setEchoChar('\u0000');
        this.pass.setText("Enter Your Password : ");
        this.pass.setForeground(Color.GRAY);
        id.setText("Enter Your ID : ");
        id.setForeground(Color.GRAY);
    }
}
