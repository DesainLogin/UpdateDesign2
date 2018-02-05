/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.controller;

import com.tugas_besar.model.MemberModel;
import com.tugas_besar.view.MemberView;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class MemberController {

    private MemberModel model;

    public void setModel(MemberModel model) {
        this.model = model;
    }

    public void resetMember(MemberView view) {
        model.resetMember();
    }

    public void insertMember(MemberView view) {

        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Lebih Dari 255 Karakter");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nomor Telepon Tidak Boleh Leboh Dari 12 digit");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email Tidak Valid");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);

            try {
                model.insertMember();
                JOptionPane.showMessageDialog(view, "Member Telah Berhasil Di Tambahkan");
                model.resetMember();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror Di Database Dengan Pesan", throwable.getMessage()});
            }
        }
    }

    public void updateMember(MemberView view) {

        if (view.getTableMember().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi Data Yang Akan Di Perbaharui");
            return;
        }

        Integer id = Integer.parseInt(view.getTxtId().getText());

        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama Tidak Boleh Lebih Dari 255 Karakter");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nomor Telepon Tidak Boleh Leboh Dari 12 digit");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email Tidak Valid");
        } else {
            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);

            try {
                model.updateMember();
                JOptionPane.showMessageDialog(view, "Member Telah Berhasil Di Perbaharui");
                model.resetMember();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror Di Database Dengan Pesan", throwable.getMessage()});
            }
        }

    }

    public void deleteMember(MemberView view) {
        if (view.getTableMember().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi Data Yang Akan Di Hapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Anda Yakin Akan Menghapus?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);

            try {
                model.deleteMember();
                JOptionPane.showMessageDialog(view, "Member Telah Berhasil Di Hapus");
                model.resetMember();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Eror Di Database Dengan Pesan", throwable.getMessage()});
            }
        }
    }

}
