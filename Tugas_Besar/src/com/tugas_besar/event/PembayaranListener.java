/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.event;

import com.tugas_besar.entity.Pembayaran;


/**
 *
 * @author LENOVO
 */
public interface PembayaranListener {

    public void onInsert(Pembayaran pembayaran);
}
