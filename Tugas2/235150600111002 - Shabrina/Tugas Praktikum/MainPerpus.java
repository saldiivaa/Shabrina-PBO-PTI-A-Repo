import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {      
        Perpustakaan perpus = new Perpustakaan(""); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM\t: ");
        int nim = scanner.nextInt();
        System.out.println("Selamat datang, " + nama + " di Perpustakaan Newbie");

        int opsi;
        do {
            tampilkanOpsi();
            System.out.print("Pilih menu : ");
            opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                System.out.println("Pilih : \n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
                    System.out.print("Silahkan pilih kategori buku : ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    perpus.tampilkanKategori(i);
                    break;
                case 2:
                    perpus.pinjamBukunya();
                    break;
                case 3:
                    perpus.kembalikanBukunya();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (opsi != 0);
    }

    private static void tampilkanOpsi() {
        System.out.println("\nMenu: ");
        System.out.println("(1) Tampilkan Buku Sesuai Kategori");
        System.out.println("(2) Pinjam Buku");
        System.out.println("(3) Kembalikan Buku");
        System.out.println("(0) Keluar");
    }
}
