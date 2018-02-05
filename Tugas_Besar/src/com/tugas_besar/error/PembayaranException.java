/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.error;

/**
 *
 * @author LENOVO
 */
public class PembayaranException extends Exception {

    /**
     * Creates a new instance of <code>PembayaranException</code> without detail
     * message.
     */
    public PembayaranException() {
    }

    /**
     * Constructs an instance of <code>PembayaranException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PembayaranException(String msg) {
        super(msg);
    }
}
