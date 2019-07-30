package com.Pertemuan2;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama        :");
        String nama = input.nextLine();
        System.out.print("Kehadiran   :");
        int kehadiran = input.nextInt();
        System.out.print("Tugas       :");
        int tugas = input.nextInt();
        System.out.print("MID         :");
        int mid = input.nextInt();
        System.out.print("UAS         :");
        double uas = input.nextInt();

        double na;
        String grade, ket;

        na=(2*tugas + 3*mid + 5*uas) / 10;

        if (na >= 80 && na <= 100) {
            grade = "A";
            ket = "Dengan Pujian";
        } else if (na >= 70) {
            grade = "B";
            ket = "Memuaskan";
        } else if (na >= 60) {
            grade = "C";
            ket = "Cukup";
        } else if (na >= 50) {
            grade = "D";
            ket = "Buruk";
        } else {
            grade = "E";
            ket = "Sangat Buruk";
        }

        System.out.println(" ");
        System.out.println("Nama        : "+nama);
        System.out.println("Nilai Akhir : "+na);
        System.out.println("Grade       : "+grade);
        System.out.println("Keterangan  : "+ket);

    }
}