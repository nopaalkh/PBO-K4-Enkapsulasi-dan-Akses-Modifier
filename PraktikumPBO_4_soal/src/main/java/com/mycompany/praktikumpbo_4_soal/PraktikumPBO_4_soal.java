/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_4_soal;

/**
 *
 * @author hp
 */
public class PraktikumPBO_4_soal {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja pekerja = new Pekerja("Yanto", 34, "Desainer", 5200000);

        // Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan setter
        pekerja.setNama("Kirman");
        System.out.println("\nSetelah mengubah nama:");
        System.out.println(pekerja.toString());

        // Coba akses langsung atribut usia
        System.out.println("Usia: " + pekerja.usia);  // Berhasil karena protected
    }
}
