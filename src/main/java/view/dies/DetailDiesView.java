/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.dies;

import aplikasi.config.KoneksiDB;
import aplikasi.controller.TableViewController;
import aplikasi.entity.Dies;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import repository.RepoDies;
import services.ServiceDies;
import view.MainMenu;

/**
 *
 * @author soraya
 */
public class DetailDiesView extends javax.swing.JDialog {

    private final TableViewController tableController;
    private final RepoDies repoDies;
    private final MainMenu mainMenuController;
    private List<Dies> daftarDies = new ArrayList<Dies>();
    /**
     * Creates new form NewJDialog
     */
    public DetailDiesView(java.awt.Frame parent,MainMenu mainMenuController, boolean modal) {
        super(parent, modal);
        initComponents();
        this.tableController = new TableViewController(tableView);
        this.repoDies = new ServiceDies(KoneksiDB.getDataSource());
        this.mainMenuController = mainMenuController;
        refreshDataTable();
    }
    private void refreshDataTable() {
        try {
            tableController.clearData();
            this.daftarDies = repoDies.findAll();
            for (Dies m : daftarDies) {
                Object[] row = {m.getId_dies(), m.getNama(), m.getProses(), m.getCustomer()};
                tableController.getModel().addRow(row);
            }
            tableController.setContentTableAlignment( Arrays.asList(0, 2, 3));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak dapat mendapatkan data dies", getTitle(), JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DetailDiesView.class.getName()).log(Level.SEVERE, null, e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        txtReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Dies", "Nama Dies", "Proses", "Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewMouseClicked(evt);
            }
        });
        tableView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableViewKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableView);
        if (tableView.getColumnModel().getColumnCount() > 0) {
            tableView.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableView.getColumnModel().getColumn(0).setMaxWidth(50);
            tableView.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableView.getColumnModel().getColumn(2).setMaxWidth(100);
            tableView.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableView.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        txtCari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCariCaretUpdate(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        txtReset.setText("Reset");
        txtReset.setFocusable(false);
        txtReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtReset.setMaximumSize(new java.awt.Dimension(120, 35));
        txtReset.setMinimumSize(new java.awt.Dimension(120, 35));
        txtReset.setPreferredSize(new java.awt.Dimension(120, 35));
        txtReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariKeyReleased

    private void txtCariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCariCaretUpdate
    refreshDataTablesByName();
    }//GEN-LAST:event_txtCariCaretUpdate

    private void tableViewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableViewKeyPressed

    }//GEN-LAST:event_tableViewKeyPressed

    private void tableViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewMouseClicked
            if (evt.getClickCount() == 2){
            Dies dies = daftarDies.get(tableController.getRowSelected());
            mainMenuController.pilihDies(dies);
            this.dispose();
        }
    }//GEN-LAST:event_tableViewMouseClicked

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        txtCari.setText("");
        txtCari.requestFocus();
    }//GEN-LAST:event_txtResetActionPerformed
    
    public void refreshDataTablesByName() {
        try {
            tableController.clearData();
            this.daftarDies = repoDies.findByNama(txtCari.getText());
            for (Dies dies : daftarDies) {
                Object[] row = {dies.getId_dies(), dies.getNama(), dies.getProses(), dies.getCustomer()};
                tableController.getModel().addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailDiesView.class.getName()).log(Level.SEVERE, null, ex);
        }
//        tableController.setContentTableAlignment(Arrays.asList(0, 2, 3, 4, 5));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableView;
    private javax.swing.JTextField txtCari;
    private javax.swing.JButton txtReset;
    // End of variables declaration//GEN-END:variables
}
