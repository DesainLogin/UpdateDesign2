/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.service;


import com.tugas_besar.entity.Pembayaran;
import com.tugas_besar.error.PembayaranException;

/**
 *
 * @author LENOVO
 */
public interface PembayaranDao {
     public void insertPembayaran (Pembayaran pembayaran) throws PembayaranException; 
}
