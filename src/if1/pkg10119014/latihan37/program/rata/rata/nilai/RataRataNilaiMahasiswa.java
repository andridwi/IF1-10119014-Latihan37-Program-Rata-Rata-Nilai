/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan37.program.rata.rata.nilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class RataRataNilaiMahasiswa {
    
private static Scanner scanner = new Scanner (System.in);
private static int i,jumlahMhs;
private static float jumlah, nilaiMhs, ratarata;

private static int inputJumlahMahasiswa(){
    System.out.print("Masukan Banyaknya Mahasiswa : ");
    jumlahMhs = scanner.nextInt();
    return jumlahMhs;
}

public static double hitungRataRata() {
    inputJumlahMahasiswa();
    jumlah = 0;
    i=1;
    while (i <= jumlahMhs){
        System.out.print("Nilai Mahasiswa ke-"+i+": ");
        nilaiMhs = scanner.nextFloat();
        jumlah += nilaiMhs;
        i++;
    }
    ratarata = jumlah / jumlahMhs;
    return ratarata;
    }
}
