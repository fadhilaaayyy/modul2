/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202357201039;

import javax.swing.JOptionPane;/**
 *
 * @author hp
 */
public class Budi_luasbangun {
    public static double luaspersegipanjang(double panjang, double lebar){
    return panjang * lebar;
    }
    public static double luassegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
    public static double luaslingkaran(double jarijari){
        return Math.PI * Math.pow(jarijari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang: "));
        double lebarpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang: "));
        double luaspersegipanjang = luaspersegipanjang(panjangpersegipanjang, lebarpersegipanjang);
        JOptionPane.showMessageDialog(null, "Luas persegi panjang: " + luaspersegipanjang);
        System.out.println("Luas persegi panjang: " + luaspersegipanjang);
        
        double alassegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
        double tinggisegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga"));
        double luassegitiga = luassegitiga(alassegitiga, tinggisegitiga);
        JOptionPane.showMessageDialog(null, "Luas segitiga: " + luassegitiga);
        System.out.println("Luas segitiga: " + luassegitiga);
        
        double jarijarilingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari_jari lingkaran: "));
        double luaslingkaran = luaslingkaran(jarijarilingkaran);
        JOptionPane.showMessageDialog(null, "Luas LIngkaran: " + luaslingkaran);
        System.out.println("Luas Lingkaran: " + luaslingkaran);
    }
    
}
