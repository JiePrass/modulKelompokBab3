/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulkelomokbab3bagianbsoal3;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author iMOp
 */
public class ModulKelomokBab3BagianBSoal3 {

    public static void main(String[] args) {
//        Input NIM
        String inputNim = JOptionPane.showInputDialog("Masukkan NIM Anda:");
        int nim = Integer.parseInt(inputNim);

        int nilai = 0;
//        Cek apakah nim genap atau ganjil
        if (nim % 2 != 0) {
            String inputNilai = JOptionPane.showInputDialog("Masukkan nilai Anda:");
            nilai = Integer.parseInt(inputNilai);
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nilai Anda: ");
            nilai = scanner.nextInt();
        }

//         Menentukan grade
        String grade = "";
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Menampilkan output
        if (nim % 2 != 0) {
            JOptionPane.showMessageDialog(null, "NIM: " + nim + "\nNilai: " + nilai + "\nGrade: " + grade);
        } else {
            System.out.println("NIM: " + nim + "\nNilai: " + nilai + "\nGrade: " + grade);
        }
    }
}
