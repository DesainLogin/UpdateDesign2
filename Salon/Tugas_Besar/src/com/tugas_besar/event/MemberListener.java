/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.event;

import com.tugas_besar.entity.Member;
import com.tugas_besar.model.MemberModel;

/**
 *
 * @author LENOVO
 */
public interface MemberListener {

    public void onChange(MemberModel model);

    public void onInsert(Member member);

    public void onDelete();

    public void onUpdate(Member member);

}
