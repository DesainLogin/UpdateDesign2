/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.model;

import com.tugas_besar.entity.Member;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LENOVO
 */
public class TabelMemberModel extends AbstractTableModel {

    private List<Member> list = new ArrayList<Member>();

    public void setList(List<Member> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public boolean add(Member e) {
        try {
            return list.add(e);
        } finally {
              fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
       
    }

    public Member get(int index) {
        return list.get(index);
    }

    public Member set(int index, Member element) {
        try {
        return list.set(index, element);    
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Member remove(int index) {
        try {
            
        return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NAMA";
            case 2:
                return "ALAMAT";
            case 3:
                return "TELEPON";
            case 4:
                return "EMAIL";
                default:return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getTelepon();
            case 4:
                return list.get(rowIndex).getEmail();
            default:
                return null;
        }
    }

}
