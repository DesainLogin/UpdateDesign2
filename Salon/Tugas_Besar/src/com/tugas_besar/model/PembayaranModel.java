/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.model;

import com.tugas_besar.database.BeautySalon;
import com.tugas_besar.entity.Pembayaran;
import com.tugas_besar.error.PembayaranException;
import com.tugas_besar.event.PembayaranListener;
import com.tugas_besar.service.PembayaranDao;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class PembayaranModel {
    
    private int id;
    private String nama;
    private String namapelayanan;
    private double harga;
    
    private PembayaranListener listener;

    public PembayaranListener getListener() {
        return listener;
    }

    public void setListener(PembayaranListener listener) {
        this.listener = listener;
    }
    
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamapelayanan() {
        return namapelayanan;
    }

    public void setNamapelayanan(String namapelayanan) {
        this.namapelayanan = namapelayanan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    protected void fireOnInsert(Pembayaran pembayaran){
        if (listener!=null) {
            listener.onInsert(pembayaran);
        }
    }
   
    public void insertPembabayaran() throws SQLException, PembayaranException{
        
        PembayaranDao dao = BeautySalon.getPembayaranDao();
        Pembayaran pembayaran =  new Pembayaran();
        pembayaran.setNama(nama);
        pembayaran.setNamaPelayan(namapelayanan);
        pembayaran.setHarga(harga);
        
        dao.insertPembayaran(pembayaran);
        fireOnInsert(pembayaran);
    }
    
}
