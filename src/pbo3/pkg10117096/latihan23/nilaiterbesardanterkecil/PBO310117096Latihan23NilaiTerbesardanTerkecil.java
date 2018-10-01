/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk nilai terbesar dan terkecil
 * 
 */
public class PBO310117096Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write your code here
        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int n, jml, max, min, nilai[];
        float rata, jumlah = 0;
        String petugas;
        
        System.out.println("===Program Nilai Terbesar dan Terkecil Mahasiswa===");
         //Input petugas
        System.out.print("Masukkan Nama Petugas : ");
        petugas = input.nextLine();
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();
 
        //Inisialisasi array
        nilai = new int[n];
 
        //Input nilai
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
 
        
        
        
        min=nilai[0];
        max=nilai[0];
        int i;
        //menghitung nilai max dan nilai min
        for (i=0; i<= n-1; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("========Hasil Nilai Mahasiswa===========");
        
        System.out.println("Nilai Maksimum = "+max);
        System.out.println("Nilai Minimum = "+min);
        System.out.println("Petugas :" +petugas);
        
 
       
        
        
    }
    
}
