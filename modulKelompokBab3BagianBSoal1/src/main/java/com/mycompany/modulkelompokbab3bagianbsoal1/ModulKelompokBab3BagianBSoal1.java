/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulkelompokbab3bagianbsoal1;
import java.io.*;
/**
 *
 * @author iMOp
 */
public class ModulKelompokBab3BagianBSoal1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            
        int nim;
        String nama, alamat;
        char gender;
        
        try {
            // Input NIM
            System.out.print("Masukkan NIM: ");
            String inputNim = dataIn.readLine();
            nim = Integer.parseInt(inputNim);
            // Input Nama
            System.out.print("Masukkan Nama: ");
            nama = dataIn.readLine();

            // Input Gender
            System.out.print("Masukkan Gender (L/P): ");
            gender = dataIn.readLine().charAt(0);

            // Input Alamat
            System.out.print("Masukkan Alamat: ");
            alamat = dataIn.readLine(); 

            // Menampilkan hasil input
            System.out.println("\nData yang diinput:");
            System.out.println("NIM    : " + nim);
            System.out.println("Nama   : " + nama);
            System.out.println("Gender : " + gender);
            System.out.println("Alamat : " + alamat);

        } catch (IOException e) {
            System.out.println("Error dalam pembacaan input!");
        } catch (NumberFormatException e) {
            System.out.println("Input untuk NIM harus berupa angka!");
        }
        
//        Deklarasi Variabel:
//        int nim; – Variabel untuk menyimpan NIM sebagai integer.
//        String nama, alamat; – Variabel untuk menyimpan nama dan alamat sebagai string.
//        char gender; – Variabel untuk menyimpan gender sebagai karakter.

//        Input dengan BufferedReader:
//        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); – 
//        Menciptakan objek BufferedReader untuk membaca input dari pengguna.

//        Pengambilan Input:
//        NIM: Dibaca sebagai String lalu dikonversi menjadi int menggunakan Integer.parseInt().
//        Nama: Dibaca langsung sebagai String.
//        Gender: Dibaca sebagai String lalu diambil karakter pertama menggunakan charAt(0).
//        Alamat: Dibaca langsung sebagai String.

//        Penanganan Kesalahan:
//        IOException – Menangani kesalahan dalam pembacaan input.
//        NumberFormatException – Menangani kesalahan jika input NIM bukan angka.

//        Output:
//        Menampilkan hasil input yang sudah dimasukkan pengguna.
    }
}
