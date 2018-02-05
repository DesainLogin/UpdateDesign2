/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.view;

import com.tugas_besar.controller.MemberController;
import com.tugas_besar.entity.Member;
import com.tugas_besar.event.MemberListener;
import com.tugas_besar.model.MemberModel;
import com.tugas_besar.model.TabelMemberModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author LENOVO
 */
public class MemberView extends javax.swing.JPanel implements MemberListener, ListSelectionListener {

    private TabelMemberModel tabelmodel;
    private MemberModel model;
    private MemberController controller;

    public MemberView() {
        tabelmodel = new TabelMemberModel();

        model = new MemberModel();
        model.setListener(this);

        controller = new MemberController();
        controller.setModel(model);

        initComponents();

        tableMember.getSelectionModel().addListSelectionListener(this);

        tableMember.setModel(tabelmodel);
    }

    public JTable getTableMember() {
        return tableMember;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTelepon() {
        return txtTelepon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(672, 640));
        setPreferredSize(new java.awt.Dimension(740, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 74, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NAMA :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 126, 74, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ALAMAT :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 74, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" TELEPON :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("EMAIL :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 68, -1));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 130, 30));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 270, 30));

        txtAlamat.setBackground(new java.awt.Color(255, 255, 255));
        txtAlamat.setForeground(new java.awt.Color(0, 0, 0));
        add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 270, 30));

        txtTelepon.setBackground(new java.awt.Color(255, 255, 255));
        txtTelepon.setForeground(new java.awt.Color(0, 0, 0));
        add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 270, 30));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 270, 30));

        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Telepon", "Email"
            }
        ));
        jScrollPane1.setViewportView(tableMember);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 560, 240));

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        btnSimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        btnUbah.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        btnHapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tugas_besar/view/hair-icon-16541405.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        controller.resetMember(this);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insertMember(this);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        controller.updateMember(this);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deleteMember(this);
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMember;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(MemberModel model) {
        txtId.setText(model.getId() + "");
        txtNama.setText(model.getNama() + "");
        txtAlamat.setText(model.getAlamat() + "");
        txtTelepon.setText(model.getTelepon() + "");
        txtEmail.setText(model.getEmail() + "");
    }

    @Override
    public void onInsert(Member member) {
        tabelmodel.add(member);
    }

    @Override
    public void onDelete() {
        int index = tableMember.getSelectedRow();
        tabelmodel.remove(index);
    }

    @Override
    public void onUpdate(Member member) {
        int index = tableMember.getSelectedRow();
        tabelmodel.set(index, member);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            Member model = tabelmodel.get(tableMember.getSelectedRow());
            txtId.setText(model.getId() + "");
            txtNama.setText(model.getNama() + "");
            txtAlamat.setText(model.getAlamat() + "");
            txtTelepon.setText(model.getTelepon() + "");
            txtEmail.setText(model.getEmail() + "");
        } catch (IndexOutOfBoundsException exception) {
        }
    }
}