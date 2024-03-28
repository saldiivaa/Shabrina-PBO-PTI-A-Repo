
import java.util.Scanner;

public class MainSwalayanTiny {
    public static void main(String[] args) {
        SwalayanTiny[] akunPelanggan = new SwalayanTiny[3];
        akunPelanggan[0] = new SwalayanTiny("3820041210", "Diva", "101204", 2000000);
        akunPelanggan[1] = new SwalayanTiny("5620050220", "Firza", "200205", 3000000);
        akunPelanggan[2] = new SwalayanTiny("7420050606", "Yessi", "060605", 4000000);

        Scanner scanner = new Scanner(System.in);
        int index = -1;

        System.out.println("========== Selamat Datang di Sistem Transaksi Swalayan Tiny ==========");
        while (true) {
            System.out.print("\nMasukkan nomor pelanggan: ");
            String nomorPelanggan = scanner.nextLine();

            for (int i=0; i<akunPelanggan.length; i++) {
                if (akunPelanggan[i].getNomorPelanggan().equals(nomorPelanggan)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Nomor pelanggan tidak valid. Silakan coba lagi!");
            } else {
                break;
            }
        }

        SwalayanTiny pelanggan = akunPelanggan[index];
        boolean keluarProgram = false;
        while (!keluarProgram) {
            System.out.println("\nSelamat bertransaksi " + pelanggan.getNamaPelanggan() + " !");
            System.out.println("Menu Transaksi:");
            System.out.println("(1) Top Up");
            System.out.println("(2) Pembelian");
            System.out.println("(3) Keluar");
            System.out.print("\nPilih menu: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); 

            switch (opsi) {
                case 1:
                    System.out.print("\nMasukkan PIN\t\t: ");
                    String pinTopUp = scanner.nextLine();
                    System.out.print("Masukkan jumlah top up  : ");
                    double jumlahTopUp = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (pelanggan.topUp(pinTopUp, jumlahTopUp)) {
                        System.out.println("Top up berhasil! Saldo Anda sekarang adalah " + pelanggan.getSaldo());
                    } else {
                        System.out.println("Top up gagal.");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukkan PIN\t\t : ");
                    String pinPembelian = scanner.nextLine();
                    System.out.print("Masukkan jumlah pembelian : ");
                    double jumlahPembelian = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (pelanggan.pembelian(pinPembelian, jumlahPembelian)) {
                        System.out.println("Pembelian berhasil. Saldo Anda sekarang adalah " + pelanggan.getSaldo());
                    } else {
                        System.out.println("Pembelian gagal.");
                    }
                    break;
                case 3:
                    System.out.println("\nTerima kasih telah menggunakan sistem transaksi kami.");
                    keluarProgram = true;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }

        scanner.close();
    }
}

