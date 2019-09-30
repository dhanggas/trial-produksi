/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import aplikasi.config.KoneksiDB;
import aplikasi.controller.TableViewController;
import aplikasi.entity.Dies;
import aplikasi.entity.Mesin;
import aplikasi.entity.Trial;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import repository.RepoTrial;
import services.ServiceTrial;
import view.dies.DetailDiesView;
import view.mesin.DetailMesinView;

/**
 *
 * @author soraya
 */
public class MainMenu extends javax.swing.JFrame {


    private final TableViewController tableController;
    private final RepoTrial repoTrial;
    private Mesin mesin;
    private List<Trial> daftarAset = new ArrayList<>();

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.tableController = new TableViewController(tableView);
        this.repoTrial = new ServiceTrial(KoneksiDB.getDataSource());
        this.mesin = new Mesin();
        refreshDataTables();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOperator = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnSimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        btnPilihDies = new javax.swing.JButton();
        txtNamaDies = new javax.swing.JTextField();
        btnPilihMesin = new javax.swing.JButton();
        txtNamaMesin = new javax.swing.JTextField();
        txtProses = new javax.swing.JTextField();
        txtCustomer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMasterData = new javax.swing.JMenu();
        mniUsers = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniAset = new javax.swing.JMenuItem();
        mniKategoriAset = new javax.swing.JMenuItem();
        mniKepemilikan = new javax.swing.JMenuItem();
        mniLokasi = new javax.swing.JMenuItem();
        mniStatus = new javax.swing.JMenuItem();
        mnuTransaksi = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mniTentangAplikasi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("No Trial");

        jLabel3.setText("Mesin");

        jLabel4.setText("Dies");

        txtOperator.setToolTipText("Isi dengan nama aset  minimal 4 karakter dan maximal 50 karakter");

        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(100, 35));
        jToolBar1.setMinimumSize(new java.awt.Dimension(100, 35));
        jToolBar1.setPreferredSize(new java.awt.Dimension(100, 35));

        btnSimpan.setText("Simpan");
        btnSimpan.setFocusable(false);
        btnSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSimpan.setMaximumSize(new java.awt.Dimension(120, 35));
        btnSimpan.setMinimumSize(new java.awt.Dimension(120, 35));
        btnSimpan.setPreferredSize(new java.awt.Dimension(120, 35));
        btnSimpan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSimpan);

        btnReset.setText("Reset");
        btnReset.setFocusable(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setMaximumSize(new java.awt.Dimension(120, 35));
        btnReset.setMinimumSize(new java.awt.Dimension(120, 35));
        btnReset.setPreferredSize(new java.awt.Dimension(120, 35));
        btnReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReset);

        btnFilter.setText("Filter");
        btnFilter.setFocusable(false);
        btnFilter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFilter.setMaximumSize(new java.awt.Dimension(120, 35));
        btnFilter.setMinimumSize(new java.awt.Dimension(120, 35));
        btnFilter.setPreferredSize(new java.awt.Dimension(120, 35));
        btnFilter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFilter);

        jLabel8.setText("Tanggal");

        btnPilihDies.setText("Pilih");
        btnPilihDies.setFocusable(false);
        btnPilihDies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihDiesActionPerformed(evt);
            }
        });

        txtNamaDies.setEditable(false);
        txtNamaDies.setToolTipText("Isi dengan nama aset  minimal 4 karakter dan maximal 50 karakter");
        txtNamaDies.setFocusable(false);
        txtNamaDies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaDiesActionPerformed(evt);
            }
        });

        btnPilihMesin.setText("Pilih");
        btnPilihMesin.setFocusable(false);
        btnPilihMesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihMesinActionPerformed(evt);
            }
        });

        txtNamaMesin.setEditable(false);
        txtNamaMesin.setToolTipText("Isi dengan nama aset  minimal 4 karakter dan maximal 50 karakter");
        txtNamaMesin.setFocusable(false);

        txtProses.setEditable(false);
        txtProses.setToolTipText("Isi dengan nama aset  minimal 4 karakter dan maximal 50 karakter");
        txtProses.setFocusable(false);

        txtCustomer.setEditable(false);
        txtCustomer.setToolTipText("Isi dengan nama aset  minimal 4 karakter dan maximal 50 karakter");
        txtCustomer.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPilihDies, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamaDies, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtProses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(txtCustomer, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilihMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtOperator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihDies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaDies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Table"));

        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Trial", "Tanggal", "Produk", "Proses", "Masin", "Ka. Shiftl", "Operator", "Mulai", "Selesai", "Terpakai"
            }
        ));
        jScrollPane1.setViewportView(tableView);
        if (tableView.getColumnModel().getColumnCount() > 0) {
            tableView.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableView.getColumnModel().getColumn(0).setMaxWidth(100);
            tableView.getColumnModel().getColumn(2).setPreferredWidth(200);
            tableView.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setMinimumSize(new java.awt.Dimension(320, 35));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(320, 35));

        mnuMasterData.setText("Master Data");

        mniUsers.setText("User");
        mniUsers.setEnabled(false);
        mniUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsersActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniUsers);
        mnuMasterData.add(jSeparator5);

        mniAset.setText("Aset");
        mniAset.setEnabled(false);
        mniAset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAsetActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniAset);

        mniKategoriAset.setText("Kategori");
        mniKategoriAset.setEnabled(false);
        mniKategoriAset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKategoriAsetActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniKategoriAset);

        mniKepemilikan.setText("Kepemilikan");
        mniKepemilikan.setEnabled(false);
        mniKepemilikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKepemilikanActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniKepemilikan);

        mniLokasi.setText("Lokasi");
        mniLokasi.setEnabled(false);
        mniLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLokasiActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniLokasi);

        mniStatus.setText("Status");
        mniStatus.setEnabled(false);
        mniStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStatusActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniStatus);

        jMenuBar1.add(mnuMasterData);

        mnuTransaksi.setText("Transaksi");
        jMenuBar1.add(mnuTransaksi);

        jMenu1.setText("Tentang");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mniTentangAplikasi.setText("Tentang Aplikasi");
        mniTentangAplikasi.setEnabled(false);
        mniTentangAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTentangAplikasiActionPerformed(evt);
            }
        });
        jMenu1.add(mniTentangAplikasi);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsersActionPerformed
    }//GEN-LAST:event_mniUsersActionPerformed

    public void pilihMesin(Mesin mesin) {
//        txtIdMesin.setText(mesin.getId_mesin().toString());
        setField(mesin);
//      this.peminjaman = pinjam;
    }
    
    private void mniAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAsetActionPerformed
//        try {
//            DaftarAsetView view = new DaftarAsetView(this, p);
//            setInnerLayout(view);
//        } catch (Exception e) {
//            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, e);
//        }
    }//GEN-LAST:event_mniAsetActionPerformed

    private void mniKategoriAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKategoriAsetActionPerformed
//        try {
//            DaftarKategoriView view = new DaftarKategoriView(this);
//            setInnerLayout(view);
//        } catch (Exception e) {
//            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, e);
//        }
    }//GEN-LAST:event_mniKategoriAsetActionPerformed

    private void mniKepemilikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKepemilikanActionPerformed
//        try {
//            DaftarKepemilikanView view = new DaftarKepemilikanView(this);
//            setInnerLayout(view);
//        } catch (Exception e) {
//            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, e);
//        }
    }//GEN-LAST:event_mniKepemilikanActionPerformed

    private void mniLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLokasiActionPerformed
//        try {
//            DaftarLokasiView view = new DaftarLokasiView(this);
//            setInnerLayout(view);
//        } catch (Exception e) {
//            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, e);
//        }
    }//GEN-LAST:event_mniLokasiActionPerformed

    private void mniStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStatusActionPerformed
    }//GEN-LAST:event_mniStatusActionPerformed

    private void mniTentangAplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTentangAplikasiActionPerformed
    }//GEN-LAST:event_mniTentangAplikasiActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
//        this.dispose();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
//        if (tableController.isSelected()) {
//            Aset aset = daftarAset.get(tableController.getRowSelected());
//            PeminjamanDetail pd = new PeminjamanDetail();
//            pd.setAset(aset);
//            pd.setQty((Integer) txtJumlah.getValue());
//            pd.setPeminjaman(peminjaman);
//            dataPeminjamanVIewController.tambahAsetBelanjaan(pd);
//            //            this.dispose();
//        } else {
//            JOptionPane.showMessageDialog(this, "Data barang belum dipilih", getTitle(), JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnPilihDiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihDiesActionPerformed
        DetailDiesView view = new DetailDiesView(this,this, true);
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        view.setVisible(true);
    }//GEN-LAST:event_btnPilihDiesActionPerformed

    private void btnPilihMesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihMesinActionPerformed
        DetailMesinView view = new DetailMesinView(this,this, true);
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        view.setVisible(true);
    }//GEN-LAST:event_btnPilihMesinActionPerformed

    private void txtNamaDiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaDiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaDiesActionPerformed
    public void refreshDataTables() {
        try {
            tableController.clearData();    
            this.daftarAset = repoTrial.findAll();
            for (Trial trial : daftarAset) {
                Object[] row = {trial.getId_trial(), trial.getTanggal(), trial.getDies().getNama(), trial.getDies().getProses(),
                    trial.getMesin().getNama(), trial.getKepala().getNama(), trial.getOperator().getNama(), trial.getMulai(), trial.getSelesai()};
                tableController.getModel().addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Tidak dapat mendapatkan data trial", getTitle(), JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPilihDies;
    private javax.swing.JButton btnPilihMesin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniAset;
    private javax.swing.JMenuItem mniKategoriAset;
    private javax.swing.JMenuItem mniKepemilikan;
    private javax.swing.JMenuItem mniLokasi;
    private javax.swing.JMenuItem mniStatus;
    private javax.swing.JMenuItem mniTentangAplikasi;
    private javax.swing.JMenuItem mniUsers;
    private javax.swing.JMenu mnuMasterData;
    private javax.swing.JMenu mnuTransaksi;
    private javax.swing.JTable tableView;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtNamaDies;
    private javax.swing.JTextField txtNamaMesin;
    private javax.swing.JTextField txtOperator;
    private javax.swing.JTextField txtProses;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables

    private void setField(Mesin mesin) {
        txtNamaMesin.setText(mesin.getNama());
    }
    public void pilihDies(Dies dies) {
//        txtIdDies.setText(dies.getId_dies().toString());
        txtNamaDies.setText(dies.getNama());
        txtProses.setText(dies.getProses());
        txtCustomer.setText(dies.getCustomer());
    }
}
