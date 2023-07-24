package com.example.pharmacymanangementsystem;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

public class Change_Password extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    private JPasswordField confirm;
    private JLabel confirmed;
    private JTextField id;
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
    private JSeparator jSeparator1;
    private JPasswordField new_pass;
    private JPasswordField old_pass;
    private JLabel we_st;

    public Change_Password() {
        this.initComponents();
        this.con = Connect.connect();
        this.id.setText(Login.id.getText());
        this.confirmed.setVisible(false);
        this.we_st.setVisible(false);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jPanel3 = new JPanel();
        this.confirm = new JPasswordField();
        this.new_pass = new JPasswordField();
        this.jLabel3 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel4 = new JLabel();
        this.old_pass = new JPasswordField();
        this.id = new JTextField();
        this.jLabel2 = new JLabel();
        this.confirmed = new JLabel();
        this.we_st = new JLabel();
        this.jPanel4 = new JPanel();
        this.jButton2 = new JButton();
        this.jButton1 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.setDefaultCloseOperation(2);
        this.setTitle("Change_Password");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel5.setFont(new Font("Tahoma", 1, 24));
        this.jLabel5.setText("Change_Password_Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(88, 32767).addComponent(this.jLabel5).addGap(84, 84, 84)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jLabel5).addContainerGap(23, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder((Border)null, "Change Your Password", 0, 0, new Font("Tahoma", 1, 12), new Color(255, 255, 255)));
        this.confirm.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Change_Password.this.confirmKeyReleased(evt);
            }
        });
        this.new_pass.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Change_Password.this.new_passKeyReleased(evt);
            }
        });
        this.jLabel3.setText("New_Password : ");
        this.jLabel1.setText("User_Id : ");
        this.jLabel4.setText("Confirm_New_Password : ");
        this.id.setEditable(false);
        this.jLabel2.setText("Old_Password : ");
        this.confirmed.setFont(new Font("Tahoma", 1, 12));
        this.confirmed.setForeground(new Color(102, 204, 0));
        this.confirmed.setText("Confirmed");
        this.we_st.setFont(new Font("Tahoma", 1, 12));
        this.we_st.setText("very weak ");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel4)).addGap(26, 26, 26).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.new_pass, Alignment.LEADING, -1, 141, 32767).addComponent(this.id, Alignment.LEADING).addComponent(this.old_pass, Alignment.LEADING).addComponent(this.confirm)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.confirmed, -1, -1, 32767).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.we_st).addGap(0, 0, 32767)))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.id, -2, -1, -2)).addGap(21, 21, 21).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.old_pass, -2, -1, -2)).addGap(24, 24, 24).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.new_pass, -2, -1, -2).addComponent(this.we_st)).addGap(25, 25, 25).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.confirm, -2, -1, -2).addComponent(this.confirmed)).addContainerGap()));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jButton2.setFont(new Font("Tahoma", 1, 11));
        this.jButton2.setText("Cancel");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Change_Password.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton1.setFont(new Font("Tahoma", 1, 11));
        this.jButton1.setText("Update_Password");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Change_Password.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2, -2, 102, -2).addGap(21, 21, 21)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel4, Alignment.TRAILING, -1, -1, 32767).addComponent(this.jPanel3, Alignment.TRAILING, -1, -1, 32767).addComponent(this.jSeparator1)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 5, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addGap(0, 8, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(484, 395));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void confirmKeyReleased(KeyEvent evt) {
        if (this.confirm.getText().equals("")) {
            this.confirmed.setVisible(false);
        } else if (this.confirm.getText().equals(this.new_pass.getText())) {
            this.confirmed.setVisible(true);
            this.confirmed.setText("Confirmed");
            this.confirmed.setForeground(Color.GREEN);
        } else {
            this.confirmed.setVisible(true);
            this.confirmed.setText("Wrong Password");
            this.confirmed.setForeground(Color.RED);
        }

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (!this.old_pass.getText().equals("") && !this.new_pass.getText().equals("") && !this.confirm.getText().equals("")) {
            if (this.check_pass()) {
                String sql = "update users set PASSWORD = '" + this.new_pass.getText() + "' where ID='" + this.id.getText() + "' ";

                try {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Password has been updated Successfully", "Success O peration", 1);
                    this.clear();
                } catch (Exception var4) {
                    JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
                }
            } else {
                JOptionPane.showMessageDialog((Component)null, "Please Check Your Old_Password", "Wrong Password", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Inforamtion", "Missing Information", 2);
        }

    }

    private void new_passKeyReleased(KeyEvent evt) {
        if (this.new_pass.getText().length() == 0) {
            this.we_st.setVisible(false);
        } else if (this.new_pass.getText().length() < 6) {
            this.we_st.setVisible(true);
            this.we_st.setText("Very Weak");
            this.we_st.setForeground(Color.RED);
        } else {
            this.we_st.setVisible(true);
            this.we_st.setText("Very Good");
            this.we_st.setForeground(Color.GREEN);
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
            Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Change_Password()).setVisible(true);
            }
        });
    }

    private boolean check_pass() {
        boolean check = false;
        String sql = "select PASSWORD from users where ID='" + this.id.getText() + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res.next() && this.res.getString("PASSWORD").equals(this.old_pass.getText()) && this.new_pass.getText().length() >= 6) {
                check = true;
            }
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

        return check;
    }

    private void clear() {
        this.old_pass.setText("");
        this.new_pass.setText("");
        this.confirm.setText("");
        this.confirmed.setVisible(false);
        this.we_st.setVisible(false);
    }
}
