/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.main;

import com.tugas_besar.database.BeautySalon;
import com.tugas_besar.entity.Member;
import com.tugas_besar.error.MemberException;
import com.tugas_besar.service.MemberDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Tugas_Besar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, MemberException{
        // TODO code application logic here\
        MemberDao dao =  BeautySalon.getMemberDao();
        
        dao.deleteMember(1);
    }
}
