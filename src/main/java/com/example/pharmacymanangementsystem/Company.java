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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Company extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    private JTextArea address;
    private JTable company_list;
    public JButton delete;
    private JButton jButton4;
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
    private JPanel jPanel6;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextField name;
    private JTextField phone;
    public JButton save;
    public JButton update;

    public Company() {
        this.initComponents();
        this.con = Connect.connect();
        this.companylist();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.address = new JTextArea();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.phone = new JTextField();
        this.jLabel2 = new JLabel();
        this.name = new JTextField();
        this.jPanel4 = new JPanel();
        this.jButton4 = new JButton();
        this.save = new JButton();
        this.delete = new JButton();
        this.update = new JButton();
        this.jPanel5 = new JPanel();
        this.jScrollPane2 = new JScrollPane();
        this.company_list = new JTable();
        this.jPanel6 = new JPanel();
        this.jLabel5 = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Company");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Company_Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(327, 327, 327).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(22, 32767).addComponent(this.jLabel1).addGap(20, 20, 20)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder((Border)null, "Company Information", 0, 0, new Font("Tahoma", 1, 12)));
        this.address.setColumns(20);
        this.address.setRows(5);
        this.jScrollPane1.setViewportView(this.address);
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Compnay_Address : ");
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Compnay_Phone : ");
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Compnay_Name : ");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel4)).addGap(86, 86, 86).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.phone, Alignment.LEADING).addComponent(this.jScrollPane1).addComponent(this.name)).addContainerGap(17, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.name, -2, -1, -2)).addGap(27, 27, 27).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, -2, 85, -2).addComponent(this.jLabel3)).addGap(31, 31, 31).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.phone, -2, -1, -2)).addContainerGap()));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jButton4.setFont(new Font("Tahoma", 1, 11));
        this.jButton4.setText("Clear");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Company.this.jButton4ActionPerformed(evt);
            }
        });
        this.save.setFont(new Font("Tahoma", 1, 11));
        this.save.setText("Save_Info");
        this.save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Company.this.saveActionPerformed(evt);
            }
        });
        this.delete.setFont(new Font("Tahoma", 1, 11));
        this.delete.setText("Delete_Info");
        this.delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Company.this.deleteActionPerformed(evt);
            }
        });
        this.update.setFont(new Font("Tahoma", 1, 11));
        this.update.setText("Update_Info");
        this.update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Company.this.updateActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.save).addGap(9, 9, 9).addComponent(this.update).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.delete).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton4, -2, 81, -2).addContainerGap(-1, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.save).addComponent(this.update).addComponent(this.delete).addComponent(this.jButton4)).addContainerGap()));
        this.jPanel5.setBackground(new Color(51, 51, 51));
        this.jPanel5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.company_list.setFont(new Font("Tahoma", 1, 12));
        this.company_list.setModel(new DefaultTableModel(new Object[][]{new Object[3], new Object[3], new Object[3], new Object[3]}, new String[]{"        Name", "        Address", "        Phone"}) {
            boolean[] canEdit = new boolean[3];

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane2.setViewportView(this.company_list);
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -2, 0, 32767).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -2, 0, 32767).addContainerGap()));
        this.jPanel6.setBackground(new Color(51, 51, 51));
        this.jPanel6.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jLabel5.setText("Note : You must save Your Companys Information that You Want to Deal With");
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel5).addGap(0, 20, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel5).addContainerGap(-1, 32767)));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel5, -1, -1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel4, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel6, -1, -1, 32767))).addGap(18, 18, 18)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel3, -2, -1, -2).addComponent(this.jPanel5, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPanel4, -1, -1, 32767).addComponent(this.jPanel6, -1, -1, 32767)).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(868, 421));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.clear();
    }

    private void saveActionPerformed(ActionEvent evt) {
        if (!this.name.getText().equals("") && !this.address.getText().equals("") && !this.phone.getText().equals("")) {
            String sql = "insert into company (NAME,ADDRESS,PHONE) values ('" + this.name.getText() + "' ,'" + this.address.getText() + "' ,'" + this.phone.getText() + "' )";

            try {
                int suring = JOptionPane.showConfirmDialog((Component)null, "Are You Sure from this Information\nName : " + this.name.getText() + "\n" + "Address : " + this.address.getText() + "\n" + "Phone : " + this.phone.getText() + "\n\n Note : Company_Name Will not be updated");
                if (suring == 0) {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Company_Information has been Saved Successfully", "Success Operation", 1);
                    this.companylist();
                    this.clear();
                }
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Company Information", "Missing Information", 2);
        }

    }

    private void updateActionPerformed(ActionEvent evt) {
        if (!this.name.getText().equals("") && !this.address.getText().equals("") && !this.phone.getText().equals("")) {
            String sql = "update company set ADDRESS='" + this.address.getText() + "' ,PHONE='" + this.phone.getText() + "' where NAME='" + this.name.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.pre.execute();
                JOptionPane.showMessageDialog((Component)null, "Company_Information has been Saved Successfully", "Success Operation", 1);
                this.companylist();
                this.clear();
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Company Information", "Missing Information", 2);
        }

    }

    private void deleteActionPerformed(ActionEvent evt) {
        if (this.name.getText().equals("")) {
            JOptionPane.showMessageDialog((Component)null, "Enter Company_Name You Want to Delete", "Missing Information", 2);
        } else {
            String sql = "delete from company where NAME='" + this.name.getText() + "' ";
            int suring = JOptionPane.showConfirmDialog((Component)null, "Are You Sure from Deleteing This Information");

            try {
                if (suring == 0) {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Company_Information has been Deleted Successfully", "Success Operation", 1);
                    this.companylist();
                    this.clear();
                }
            } catch (Exception var5) {
                JOptionPane.showMessageDialog((Component)null, var5.getMessage(), "Error", 2);
            }
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
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Company()).setVisible(true);
            }
        });
    }

    private void clear() {
        this.name.setText("");
        this.address.setText("");
        this.phone.setText("");
    }

    private void companylist() {
        String sql = "select * from company";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.company_list.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}
