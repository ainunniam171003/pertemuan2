/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author User
 */
public class MobilHijau {
   public static void main(String[] args) {
    MasterMobil MobilHijau = new MasterMobil();
    
    MobilHijau.MerkMobil = "Civic Turbo";
    MobilHijau.WarnaMobil = "Hijau";
    MobilHijau.TahunMobil = 2020;
    
    System.out.println("Merk Mobil: " + MobilHijau.MerkMobil );
    System.out.println("Warna Mobil: " + MobilHijau.WarnaMobil );
    System.out.println("Tahun Pembuatan Mobil:" + MobilHijau.TahunMobil );
   }  
}
