/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.impl;

import com.tugas_besar.entity.Pembayaran;
import com.tugas_besar.error.MemberException;
import com.tugas_besar.error.PembayaranException;
import com.tugas_besar.service.PembayaranDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author LENOVO
 */
public class PembayaranDaoImpl implements PembayaranDao{
     
    private Connection connection;

    public PembayaranDaoImpl(Connection connection) {
        this.connection = connection;
    }
     private final String insertPembayaran = "INSERT INTO PEMBAYARAN"
            + "(NAMA, NAMA PELAYANAN, HARGA) VALUES"
            + "(?,?,?)";
    
    @Override
    public void insertPembayaran(Pembayaran pembayaran) throws PembayaranException {
            PreparedStatement statement = null;
            try {
                    statement = connection.prepareStatement(insertPembayaran);
                    statement.setString(1,pembayaran.getNama());
                    statement.setString(2,pembayaran.getNamaPelayan());
                    statement.setDouble(3,pembayaran.getHarga());
                    
       ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                pembayaran.setId(result.getInt(1));
            }

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new PembayaranException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
    }
    }
}
    
     
     
