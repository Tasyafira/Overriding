package overriding;

import java.util.Scanner;

public class Overriding {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);//scanner
        //Membuat objel
        Class1 Ortu = new Class1();
        System.out.println("");
        System.out.println("Menghitung Volume dan Luas Permukaan");
        System.out.println("------------------------------------");
        
        //membuat objek
        Class2 pertama = new Class2();
        System.out.println("Tabung");
        System.out.print("Masukkan sisi kubus\t: ");//input sisi kubus
        pertama.sisi = Input.nextInt();
        pertama.Volume();//pemanggilan method Volume pada class2
        pertama.LuasPermukaan();//pemanggilan method LuasPermukaan pada class2
        
        
        System.out.println("\n"); // Enter /
        
        
        //membuat objek
        Class3 kedua = new Class3();
        System.out.println("Balok");
        System.out.print("Masukkan panjang balok\t: ");//input panjang balok
        kedua.panjang = Input.nextInt();
        System.out.print("Masukkan lebar balok\t: ");//input lebar balok
        kedua.luas = Input.nextInt();
        System.out.print("Masukkan tinggi balok\t: ");//input tinggi balok
        kedua.tinggi = Input.nextInt();
        kedua.Volume();//pemanggilan method Volume pada class3
        kedua.LuasPermukaan();//pemanggilan method LuasPermukaan3
    }
    
}
