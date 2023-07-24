package com.example.pharmacymanangementsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Move_Drug extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    String Barcode = "";
    private JTextField barcode;
    private JTable drug_place;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    public JComboBox<String> new_place;
    public JComboBox<String> new_section;
    private JTextField place;

    public Move_Drug() {
        this.initComponents();
        this.con = Connect.connect();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.barcode = new JTextField();
        this.jLabel2 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.drug_place = new JTable();
        this.jSeparator1 = new JSeparator();
        this.jPanel4 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jButton1 = new JButton();
        this.new_section = new JComboBox();
        this.new_place = new JComboBox();
        this.place = new JTextField();
        this.setDefaultCloseOperation(2);
        this.setTitle("Move_Drug Form");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Move_Drug");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(266, 266, 266)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1).addContainerGap(23, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.barcode.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Move_Drug.this.barcodeKeyReleased(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Drug_Barcode : ");
        this.drug_place.setFont(new Font("Tahoma", 1, 12));
        this.drug_place.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"           Name", "           Type  ", "           Barcode", "           Place"}) {
            boolean[] canEdit = new boolean[]{false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.drug_place.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Move_Drug.this.drug_placeMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.drug_place);
        if (this.drug_place.getColumnModel().getColumnCount() > 0) {
            this.drug_place.getColumnModel().getColumn(2).setResizable(false);
        }

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(26, 26, 26).addComponent(this.barcode, -2, 182, -2).addGap(0, 0, 32767)).addComponent(this.jScrollPane1, Alignment.TRAILING, -1, 637, 32767)).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.barcode, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, 230, -2).addContainerGap()));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setText("New_Place : ");
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Old_Place : ");
        this.jButton1.setText("Update");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Move_Drug.this.jButton1ActionPerformed(evt);
            }
        });
        this.new_section.setModel(new DefaultComboBoxModel(new String[]{"Section : ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}));
        this.new_place.setModel(new DefaultComboBoxModel(new String[]{"Place : ", "Up", "Down", "Right", "Left"}));
        this.place.setEditable(false);
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel4).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.place, -2, 168, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel5).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.new_section, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.new_place, -2, -1, -2).addContainerGap()).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(277, 32767).addComponent(this.jButton1, -2, 99, -2).addGap(281, 281, 281)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jLabel5).addComponent(this.new_section, -2, -1, -2).addComponent(this.new_place, -2, -1, -2).addComponent(this.place, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton1, -2, 31, -2).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addComponent(this.jSeparator1).addComponent(this.jPanel4, -1, -1, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED, 10, 32767).addComponent(this.jPanel4, -2, -1, -2).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(695, 536));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (this.new_section.getSelectedIndex() != 0 && this.new_place.getSelectedIndex() != 0) {
            if (this.Barcode.equals("")) {
                JOptionPane.showMessageDialog((Component)null, "Please Enter drug_barcode that you want to change Place", "Missing Information", 2);
            } else {
                String sql = "update drugs set PLACE='" + this.new_section.getSelectedItem() + "-" + this.new_place.getSelectedItem() + "' where BARCODE='" + this.Barcode + "' ";

                try {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Drug_Place has been changed Successfully", "Success Operation", 1);
                    this.clear();
                    this.refresh();
                } catch (Exception var4) {
                    JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
                }
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Select The Place That you want to change to", "Missing Information", 2);
        }

    }

    private void barcodeKeyReleased(KeyEvent evt) {
        String sql = "select NAME,TYPE,BARCODE,PLACE from drugs where BARCODE REGEXP '" + this.barcode.getText() + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.drug_place.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, "Wrong Input\n\nSearch By English only", "Error", 2);
        }

    }

    private void drug_placeMouseClicked(MouseEvent evt) {
        int row = this.drug_place.getSelectedRow();
        String t = this.drug_place.getModel().getValueAt(row, 2).toString();
        String sql = "select BARCODE,PLACE from drugs where BARCODE='" + t + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res.next()) {
                this.Barcode = this.res.getString("BARCODE");
                String sec = this.res.getString("PLACE").split("-")[0];
                String pla = this.res.getString("PLACE").split("-")[1];
                this.place.setText("Section : " + sec + ", Place : " + pla);
            }
        } catch (Exception var7) {
            JOptionPane.showMessageDialog((Component)null, var7.getMessage(), "Error", 2);
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Move_Drug.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Move_Drug.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Move_Drug.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Move_Drug()).setVisible(true);
            }
        });
    }

    private void clear() {
        this.place.setText("");
        this.new_section.setSelectedIndex(0);
        this.new_place.setSelectedIndex(0);
    }

    private void refresh() {
        String sql = "select NAME,TYPE,BARCODE,PLACE from drugs";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.drug_place.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}
