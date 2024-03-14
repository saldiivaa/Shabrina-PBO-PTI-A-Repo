import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {      
        Perpustakaan perpus = new Perpustakaan(""); 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan kelas\t: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan NIM\t: ");
        int nim = input.nextInt();
        System.out.println("Selamat datang, " + nama + " di Perpustakaan Newbie");

        int pilihanMenu;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu : ");
            pilihanMenu = input.nextInt();
            input.nextLine();

            switch (pilihanMenu) {
                case 1:
                System.out.println("Pilih : \n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
                    System.out.print("Silahkan pilih kategori buku : ");
                    int i = input.nextInt();
                    input.nextLine();
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
        } while (pilihanMenu != 0);
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu: ");
        System.out.println("(1) Tampilkan Buku Sesuai Kategori");
        System.out.println("(2) Pinjam Buku");
        System.out.println("(3) Kembalikan Buku");
        System.out.println("(0) Keluar");
    }
}
