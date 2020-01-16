/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dandimiqbal.latihanmvc.controller;

import javax.swing.JOptionPane;
import edu.dandimiqbal.latihanmvc.model.PelangganModel;
import edu.dandimiqbal.latihanmvc.view.PelangganView;

/**
 *
 * Nama  : Dandi Muhammad Iqbal
 * Kelas : IF11K
 * NIM   : 10118911
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();
        
        if(nama.equals("") && email.equals("") && telepon.equals("")) {
        
        } else{
            
            model.resetForm();
        }
        
    }
    
    public void simpanform(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();
        
        if(nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Eama Masih Kosong");
        } else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
        
    }
    
}
