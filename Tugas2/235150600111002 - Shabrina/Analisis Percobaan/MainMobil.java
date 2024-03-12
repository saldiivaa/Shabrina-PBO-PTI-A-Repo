import java.util.Scanner;

public class MainMobil {

public static void main(String[] args) {
    // //instan objek bernama m1 
 	// Mobil m1 = new Mobil(); 
    //     m1.setKecepatan(50); 
    //     m1.setManufaktur("Toyota"); 
    //     m1.setNoPlat("AB 1231 UA"); 
    //     m1.setWarna("Merah"); 
    //     m1.displayMessage(); 
    //     System.out.println("================"); 
 	// //instan objek baru bernama m2 
 	// Mobil m2 = new Mobil(); 
    //     m2.setKecepatan(100); 
    //     m2.setManufaktur("Mitsubishi"); 
    //     m2.setNoPlat("N 1134 AG"); 
    //     m2.setWarna("Pink"); 
    //     m2.displayMessage(); 
    // 	System.out.println("================"); 
    //   	//merubah warna dari objek m1 
    //   	System.out.println("mobil pada objek m1 di rubah menjadi warna hijau"); 
    //   	m1.setWarna("Hijau"); 
    //   	//menampilkan hasil perubahan 
    //   	m1.displayMessage(); 

    Scanner scanner = new Scanner(System.in);
    
    Mobil m1 = new Mobil();
    System.out.println("=============== SELAMAT DATANG ===============\n");
    System.out.println("Silahkan isi data dibawah ini.\n");

        System.out.print("Masukkan manufaktur mobil anda\t:");
            String manufaktur = scanner.nextLine();
            m1.setManufaktur(manufaktur);

        System.out.print("Masukkan plat nomor mobil anda\t:");
            String noplat = scanner.nextLine();
            m1.setNoPlat(noplat);

        System.out.print("Masukkan warna mobil anda\t:");
            String warna = scanner.nextLine();
            m1.setWarna(warna);

        System.out.print("Masukkan kecepatan mobil anda\t:");
            int kecepatan = scanner.nextInt();
            scanner.nextLine();
            m1.setKecepatan(kecepatan);

        System.out.print("Masukkan waktu tempuh anda\t:");
            double waktuTempuh = scanner.nextDouble();
            m1.setWaktu(waktuTempuh);

        System.out.println("\n==============================================\n");

            m1.displayMessage();

        System.out.println("\n===============  TERIMA KASIH  ===============");
    }
 }