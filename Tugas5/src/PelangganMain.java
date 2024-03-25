package Tugas5.src;

import java.util.Scanner;

public class PelangganMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input informasi pelanggan
        System.out.println("Masukkan informasi pelanggan:");
        System.out.print("Nomor Pelanggan: ");
        String nomorPelanggan = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline character
        System.out.print("Jenis Rekening (38/56/74): ");
        String jenisRekening = scanner.nextLine();
        System.out.print("PIN: ");
        String pin = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(nomorPelanggan, nama, saldo, jenisRekening, pin);

        // Transaksi interaktif
        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nMenu Transaksi:");
            System.out.println("1. Top Up");
            System.out.println("2. Beli");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan PIN: ");
                    String pinTopUp = scanner.nextLine();
                    System.out.print("Masukkan jumlah top up: ");
                    double jumlahTopUp = scanner.nextDouble();
                    scanner.nextLine(); // Membuang newline character
                    if (pelanggan.topUp(pinTopUp, jumlahTopUp)) {
                        System.out.println("Top up berhasil. Saldo sekarang: " + pelanggan.getSaldo());
                    } else {
                        System.out.println("Top up gagal.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan PIN: ");
                    String pinBeli = scanner.nextLine();
                    System.out.print("Masukkan jumlah pembelian: ");
                    double jumlahBeli = scanner.nextDouble();
                    scanner.nextLine(); // Membuang newline character
                    if (pelanggan.beli(pinBeli, jumlahBeli)) {
                        System.out.println("Pembelian berhasil. Saldo sekarang: " + pelanggan.getSaldo());
                    } else {
                        System.out.println("Pembelian gagal.");
                    }
                    break;
                case 3:
                    selesai = true;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }

        scanner.close();
    }
}
