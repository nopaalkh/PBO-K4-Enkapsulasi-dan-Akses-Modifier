/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author hp
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);
        
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());
        
        mobil.setModel("Innova");
        mobil.setTahun(2021);
        
        System.out.println("Model Baru: " + mobil.getModel());
        System.out.println("Tahun Baru: " + mobil.getTahun());
        
    }
}
