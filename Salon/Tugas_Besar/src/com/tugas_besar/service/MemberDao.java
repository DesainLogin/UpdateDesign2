/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.service;

import com.tugas_besar.entity.Member;
import com.tugas_besar.error.MemberException;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface MemberDao {
    public void insertMember(Member member ) throws MemberException; 
    public void updateMember(Member member) throws MemberException;
    public void deleteMember(Integer id) throws MemberException;
    public Member getMember(Integer id) throws MemberException;
    public Member getMember(String email) throws MemberException;
    public List<Member> selectAllMember() throws MemberException;
}
