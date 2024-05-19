package latihaninterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Manusia manusia = new Manusia();
        // manusia.makan();
        // manusia.tampilkanNama();
        // manusia.tampilkanUmur(); 

        // Manusia manusia = new Manusia("diva", 19);
        // MakhlukHidup m = manusia;
        // m.makan();  
        // Manusia daifa = new Manusia("daifa", 9);
        // daifa.tampilkanNama();
        // daifa.tampilkanUmur();
        // daifa.makan();
        // daifa.berjalan();
        // daifa.bersuara();

        // Hewan hewan = new Hewan();
        // hewan.makan();

        // MakhlukHidup mh = new MakhlukHidup();

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Masukkan nama: ");
        // String nama = scanner.nextLine();

        // System.out.print("Masukkan umur: ");
        // int umur = scanner.nextInt();
        
        Manusia manusia = new Manusia();
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.berkembangbiak();

        Hewan h = new Hewan();
        h.berjalan();
        h.bersuara();
        h.makan();
        h.berkembangbiak();

    }
    

}
