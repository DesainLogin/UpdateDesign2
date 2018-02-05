/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.loading;

import com.tugas_besar.view.adminView;

/**
 *
 * @author LENOVO
 */
public class loading {
    
    public static void main(String[] args) {
        com.tugas_besar.loading.splash sp =  new com.tugas_besar.loading.splash();
        sp.setVisible(true);
        adminView adm = new adminView();
 
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                sp.loadingnum.setText(Integer.toString(i)+"%");
                sp.loadingbar.setValue(i);
                if (i==100) {
                    sp.setVisible(false);
                    adm.setVisible(true);
                    
                }
            }
        } catch (Exception e) {
        }
    }
}
