/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202357201039;

public class methodx1 {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
        
    }
    
    public static void main(String[] args) {
        methodx1 mt = new methodx1();
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
}
