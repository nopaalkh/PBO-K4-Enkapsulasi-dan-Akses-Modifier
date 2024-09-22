/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_4_soal;

/**
 *
 * @author hp
 */
class Pekerja extends Manusia {
    // Atribut tambahan dengan akses modifier private
    private double gaji;

    // Constructor untuk inisialisasi semua atribut
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);  // Panggil constructor kelas induk
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               ", Usia: " + usia + 
               ", Pekerjaan: " + pekerjaan + 
               ", Gaji: Rp." + gaji;
    }
}
