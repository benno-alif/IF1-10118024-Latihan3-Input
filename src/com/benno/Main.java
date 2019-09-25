package com.benno;
import java.util.Scanner;

    /*
    NAMA        : BENNO ALIF ANGGARA
    KELAS       : IF1
    NIM         : 10118024
    Deskripsi   : Memasukkan nilai dari keyboard
     */

public class Main {

    public static void main(String[] args) {
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Nama anda adalah " + name);
    }
}
