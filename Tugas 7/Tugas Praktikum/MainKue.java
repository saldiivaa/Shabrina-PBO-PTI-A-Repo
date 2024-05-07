import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainKue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] kue = new Kue[25]; // menginisialisasi array

        // for (int i = 0; i < kues.length; i++) {
        // if (i % 3 == 0) {
        // kues[i] = new KuePesanan("Kue Pesanan " + i, 10 + i, 1 + i * 0.5);
        // } else if (i % 3 == 1) {
        // kues[i] = new KueJadi("Kue Jadi " + i, 10 + i, 1 + i);
        // } else {
        // kues[i] = new KueBasi("Kue Basi " + i, 10 + i, i % 4 + 1);
        // }
        // }

        String[] namaPesanan = { "Cookies", "Kue Bolu", "Kue Pandan", "Kue Cokelat", "Kue Keju",
                "Kue Strawberry", "Kue Vanila", "Kue Oreo", "Kue Cokelat Keju", "Kue Pisang" };
        String[] namaJadi = { "Kue Lapis", "Kue Donat", "Kue Sus", "Kue Pie", "Kue Tart",
                "Kue Wortel", "Bento Cake", "Coklat Roll", "Banana Roll", "Kue Lapis Legit" };
        String[] namaBasi = { "Kue Kering", "Kue Cubit", "Kue Talam", "Kue Muffin", "Cheese Roll" };

        for (int i = 0; i < kue.length; i++) {
            double hargaDasar = 10 + i * 0.5; //rumus harga
            if (i < 10) {
                kue[i] = new KuePesanan(namaPesanan[i % namaPesanan.length], hargaDasar * 100, 1.0 + i * 0.1);
            } else if (i >= 10 && i < 20) {
                kue[i] = new KueJadi(namaJadi[(i - 10) % namaJadi.length], hargaDasar * 100, 1 + (i - 10) / 2);
            } else {
                kue[i] = new KueBasi(namaBasi[i - 20], hargaDasar * 100, (i % 4) + 1);
            }
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("(1) Tampilkan semua kue");
            System.out.println("(2) Hitung total harga semua kue");
            System.out.println("(3) Hitung total harga dan total berat dari Kue Pesanan");
            System.out.println("(4) Hitung total harga dan total jumlah dari Kue Jadi");
            System.out.println("(5) Tampilkan kue dengan harga tertinggi");
            System.out.println("(6) Hitung total harga dan total lama hari Kue Basi");
            System.out.println("(7) Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // for (Kue kue : kues) {
                    // System.out.println(kue);
                    // }
                    // break;

                    //inisialisasi list untuk tiap kategori kue
                    List<Kue> pesananList = new ArrayList<>();
                    List<Kue> jadiList = new ArrayList<>();
                    List<Kue> basiList = new ArrayList<>();

                    // loop for-each yang melalui setiap objek Kue dalam array kue
                    // instanceof untuk menentukan list mana yang harus diisi oleh objek
                    for (Kue kuee : kue) {
                        if (kuee instanceof KuePesanan) {
                            pesananList.add(kuee);
                        } else if (kuee instanceof KueJadi) {
                            jadiList.add(kuee);
                        } else if (kuee instanceof KueBasi) {
                            basiList.add(kuee);
                        }
                    }

                    System.out.println("\n===== LIST KUE PESANAN TOKO KWENAK =====");
                    pesananList.forEach(System.out::println);
                    System.out.println("\n====== LIST KUE JADI TOKO KWENAK ======");
                    jadiList.forEach(System.out::println);
                    System.out.println("\n==== LIST KUE BASI TOKO KWENAK T_T ====");
                    basiList.forEach(System.out::println);
                    break;
                case 2:

                    double totalHarga = 0;
                    for (Kue kuee : kue) {
                        totalHarga += kuee.hitungHarga();
                    }
                    System.out.printf("\nTotal harga semua kue: Rp %,.2f\n", totalHarga);
                    break;
                case 3:

                    double totalHargaPesanan = 0;
                    double totalBeratPesanan = 0;
                    for (Kue kuee : kue) {
                        if (kuee instanceof KuePesanan) {
                            KuePesanan kp = (KuePesanan) kuee;
                            totalHargaPesanan += kp.hitungHarga();
                            totalBeratPesanan += kp.getBerat();
                        }
                    }
                    System.out.printf(
                            "\nTotal harga Kue Pesanan: Rp %,.2f" + "\nTotal berat dari Kue Pesanan: %.2f kg\n",
                            totalHargaPesanan, totalBeratPesanan);
                    break;
                case 4:

                    double totalHargaJadi = 0;
                    double totalJumlahJadi = 0;
                    for (Kue kuee : kue) {
                        if (kuee instanceof KueJadi) {
                            KueJadi kj = (KueJadi) kuee;
                            totalHargaJadi += kj.hitungHarga();
                            totalJumlahJadi += kj.getJumlah();
                        }
                    }
                    System.out.printf("\nTotal harga Kue Jadi: Rp %,.2f" + "\nJumlah dari Kue Jadi: %.2f\n",
                            totalHargaJadi, totalJumlahJadi);
                    break;
                case 5:

                    double hargaTerbesar = 0;
                    Kue kueDenganHargaTerbesar = null;
                    for (Kue kuee : kue) {
                        double harga = kuee.hitungHarga();
                        if (harga > hargaTerbesar) {
                            hargaTerbesar = harga;
                            kueDenganHargaTerbesar = kuee;
                        }
                    }
                    System.out.printf("\nKue dengan harga tertinggi %s\n", kueDenganHargaTerbesar);
                    break;
                case 6:
                    double totalHargaBasi = 0;
                    int totalLamaHari = 0;
                    for (Kue kuee : kue) {
                        if (kuee instanceof KueBasi) {
                            KueBasi basi = (KueBasi) kuee;
                            totalHargaBasi += basi.hitungHarga();
                            totalLamaHari += basi.getLamaHari();
                        }
                    }
                    System.out.printf("\nTotal harga dari Kue Basi: Rp %,.2f", totalHargaBasi);
                    System.out.print("\nTotal lama hari dari Kue Basi: " + totalLamaHari + " hari\n");
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
