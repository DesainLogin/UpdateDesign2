/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.tugas_besar.impl.MemberDaoImpl;
import com.tugas_besar.service.MemberDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BeautySalon {
    
    private static Connection connection;
    private static MemberDao memberDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource =  new MysqlDataSource();    
            dataSource.setURL("jdbc:mysql://localhost:3306/bsalon");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection =  dataSource.getConnection();
        }
        
        return connection;
    }
    public static MemberDao getMemberDao() throws SQLException{
        
        if (memberDao==null) {
            memberDao =  new MemberDaoImpl(getConnection());
        }
        
        return memberDao;
    }
}
