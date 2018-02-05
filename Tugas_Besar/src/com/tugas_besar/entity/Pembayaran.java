/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.entity;

import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Pembayaran {
    private Integer id;
    private String nama;
    private String namaPelayan;
    private Double harga;
    
    public Pembayaran(){
        
    }

    public Pembayaran(String nama, String namaPelayan, Double harga) {
        this.nama = nama;
        this.namaPelayan = namaPelayan;
        this.harga = harga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaPelayan() {
        return namaPelayan;
    }

    public void setNamaPelayan(String namaPelayan) {
        this.namaPelayan = namaPelayan;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nama);
        hash = 97 * hash + Objects.hashCode(this.namaPelayan);
        hash = 97 * hash + Objects.hashCode(this.harga);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pembayaran other = (Pembayaran) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.namaPelayan, other.namaPelayan)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.harga, other.harga)) {
            return false;
        }
        return true;
    }
    
    
    
}
