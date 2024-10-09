/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulkelompokbab3bagianbsoal4;
import java.io.*;

/**
 *
 * @author iMOp
 */
public class ModulKelompokBab3BagianBSoal4 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String a = "";
        double pensil = 0, pulpen = 0, buku = 0;
        int jml_item_brg = 0;
        int jml_buku = 0;

        System.out.println("* Data Barang Dagangan *");
        System.out.println("1. Pensil 2B = @Rp. 12.000");
        System.out.println("2. Pulpen = @Rp. 15.000");
        System.out.println("3. Buku Tulis = @Rp. 25.000");
        System.out.println("Silahkan Pesan");

        try {
            // Input untuk Pensil 2B
            System.out.println("Beli Pensil 2B? Y atau N");
            a = dataIn.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                a = dataIn.readLine();
                pensil = Double.parseDouble(a) * 12000;
                jml_item_brg++;
            } else {
                System.out.println("Tidak Beli Pensil 2B");
            }

            // Input untuk Pulpen
            System.out.println("Beli Pulpen? Y atau N");
            a = dataIn.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                a = dataIn.readLine();
                pulpen = Double.parseDouble(a) * 15000;
                jml_item_brg++;
            } else {
                System.out.println("Tidak Beli Pulpen");
            }

            // Input untuk Buku Tulis
            System.out.println("Beli Buku Tulis? Y atau N");
            a = dataIn.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya: ");
                a = dataIn.readLine();
                jml_buku = Integer.parseInt(a); // Menyimpan jumlah buku untuk keperluan diskon
                buku = jml_buku * 25000;
                jml_item_brg++;
            } else {
                System.out.println("Tidak Beli Buku Tulis");
            }

            // Harga total sebelum diskon
            double total_harga = pensil + pulpen + buku;

            // Perhitungan Diskon
            // Diskon total > 1.000.000 sebesar 1%
            if (total_harga > 1000000) {
                total_harga -= total_harga * 0.01;
                System.out.println("Mendapatkan diskon 1% karena total lebih dari Rp 1.000.000");
            }

            // Diskon untuk pembelian Buku Tulis 3 lusin (36 buku)
            if (jml_buku >= 36) {
                double diskon_buku = buku * 0.02; // 2% diskon buku
                total_harga -= diskon_buku;
                System.out.println("Mendapatkan diskon 2% untuk Buku Tulis karena membeli minimal 3 lusin.");
            }

            // Potongan harga Rp 500 untuk pembelian minimal 3 item barang
            if (jml_item_brg >= 3) {
                total_harga -= 500;
                System.out.println("Mendapatkan potongan harga Rp 500 karena membeli minimal 3 item barang.");
            }

            // Menampilkan harga total setelah diskon
            System.out.println("Total Harga Barang Dibeli: Rp " + total_harga);

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
