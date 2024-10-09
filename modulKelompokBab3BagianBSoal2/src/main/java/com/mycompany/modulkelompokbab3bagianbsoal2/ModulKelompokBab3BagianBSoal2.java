/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulkelompokbab3bagianbsoal2;
import javax.swing.*;

/**
 *
 * @author iMOp
 */
public class ModulKelompokBab3BagianBSoal2 {

    public static void main(String[] args) {
        String menu=JOptionPane.showInputDialog("Pilih Menu Makanan Berikut ini :\n" +
        "1. Sate Rp.10.000 \n 2. Soto Rp.20.000 \n 3. Tahu Campur Rp.15.000 \n 4. Rendang Rp.20.000");
        
        int a=Integer.parseInt(menu);
        
//        Variabel untuk menampung pesan
        String pesan = "";
        
//        Beberapa kondisi ketika user memilih menu
        switch (a) {
            case 1:
                pesan = "Anda memilih Sate. Harganya Rp.10.000";
                break;
            case 2:
                pesan = "Anda memilih Soto. Harganya Rp.20.000";
                break;
            case 3:
                pesan = "Anda memilih Tahu Campur. Harganya Rp.15.000";
                break;
            case 4:
                pesan = "Anda memilih Rendang. Harganya Rp.20.000";
                break;
            default:
                pesan = "Makanan yang ada pilih belum ada di daftar menu kami";
                break;
        }
        
        JOptionPane.showMessageDialog(null, pesan);
        
        /*  
        Program ini meminta pengguna memilih salah satu dari empat menu makanan yang tersedia, 
        lalu menampilkan pesan yang sesuai dengan pilihan tersebut. Jika input pengguna tidak 
        valid (tidak ada di daftar menu), program akan menampilkan pesan kesalahan. Pesan 
        ditampilkan menggunakan dialog grafis dari JOptionPane.
        */
    }
}
