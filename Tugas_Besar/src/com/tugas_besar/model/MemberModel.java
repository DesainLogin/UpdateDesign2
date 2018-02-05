/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.model;

import com.tugas_besar.database.BeautySalon;
import com.tugas_besar.entity.Member;
import com.tugas_besar.error.MemberException;
import com.tugas_besar.event.MemberListener;
import com.tugas_besar.service.MemberDao;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class MemberModel {
    
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    private MemberListener listener;

    public MemberListener getListener() {
        return listener;
    }

    public void setListener(MemberListener listener) {
        this.listener = listener;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this);
        }
        
    }
    protected void fireOnInsert(Member member){
        if (listener!=null) {
            listener.onInsert(member);
        }
    }
    protected void fireOnUpdate(Member member){
        if (listener!=null) {
            listener.onUpdate(member);
        }
    }
    protected void fireOnDelete(){
        if (listener!=null) {
            listener.onDelete();
        }
    }
    public void insertMember() throws SQLException, MemberException{
        
        MemberDao dao = BeautySalon.getMemberDao();
        Member member =  new Member();
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setTelepon(telepon);
        member.setEmail(email);
        
        dao.insertMember(member);
        fireOnInsert(member);
    }
    public void updateMember() throws SQLException, MemberException{
        
        MemberDao dao = BeautySalon.getMemberDao();
        Member member =  new Member();
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setTelepon(telepon);
        member.setEmail(email);
        member.setId(id);
        
        dao.updateMember(member);
        fireOnInsert(member);
    }
    public void deleteMember() throws SQLException, MemberException{
        
        MemberDao dao = BeautySalon.getMemberDao();
        dao.deleteMember(id);
        fireOnDelete();
    }
    public void resetMember(){
        setId(0);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
    }
    
}
