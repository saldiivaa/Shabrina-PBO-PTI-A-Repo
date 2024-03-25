package Tugas5.src;

import java.util.Scanner;

public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String jenisRekening;
    private String pin;
    private int kesalahanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, String jenisRekening, String pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = pin;
        this.kesalahanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public boolean topUp(String pin, double jumlah) {
        if (pin.equals(this.pin)) {
            saldo += jumlah;
            return true;
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Akun diblokir karena kesalahan autentikasi yang berulang.");
            }
            return false;
        }
    }

    public boolean beli(String pin, double jumlah) {
        if (pin.equals(this.pin)) {
            if (saldo - jumlah >= 10000) {
                if (jumlah > 1000000) {
                    if (jenisRekening.equals("38")) {
                        saldo += jumlah * 0.05;
                    } else if (jenisRekening.equals("56")) {
                        saldo += jumlah * 0.02;
                    } else if (jenisRekening.equals("74")) {
                        saldo += jumlah * 0.05;
                    }
                } else {
                    if (jenisRekening.equals("38")) {
                        saldo += jumlah * 0.02;
                    } else if (jenisRekening.equals("56")) {
                        saldo += jumlah * 0.07;
                    } else if (jenisRekening.equals("74")) {
                        saldo += jumlah * 0.10;
                    }
                }
                saldo -= jumlah;
                return true;
            } else {
                System.out.println("Saldo tidak mencukupi untuk melakukan transaksi.");
                return false;
            }
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Akun diblokir karena kesalahan autentikasi yang berulang.");
            }
            return false;
        }
    }
}