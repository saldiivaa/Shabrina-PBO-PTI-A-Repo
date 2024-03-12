
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Perpustakaan {
    private String judulBuku;
    private String tahunBuku;
    private String penulisBuku;

    public void tampilkanKategori(int i) {
        System.out.print("Kategori : ");
        switch (i) {
            case 1:
                System.out.println("Teknologi");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Teknologi.txt");
                break;
            case 2:
                System.out.println("Filsafat");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Filsafat.txt");
                break;
            case 3:
                System.out.println("Sejarah");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Sejarah.txt");
                break;
            case 4:
                System.out.println("Agama");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Agama.txt");
                break;
            case 5:
                System.out.println("Psikologi");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Psikologi.txt");
                break;
            case 6:
                System.out.println("Politik");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Politik.txt");
                break;
            case 7:
                System.out.println("Fiksi");
                bacaFile("C:\\SHABRINA-PBO-PTI-A-Repo\\235150600111002 - Shabrina\\Tugas2\\Tugas Praktikum\\Fiksi.txt");
                break;
            default:
                System.out.println("Kategori tidak valid.");
                break;
        }
    }

    private void bacaFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String tiapBaris = scanner.nextLine();
                String[] part = tiapBaris.split(",");
                if (part.length >= 3) {
                    tampilkanBukunya(part[0], part[1], part[2]);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tersebut tidak ditemukan: " +e.getMessage());
        }
    }

    public void pinjamBukunya() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judul = input.nextLine();
        System.out.println("Buku "+judul+" berhasil dipinjam.");

    }

    public void kembalikanBukunya() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String judul = input.nextLine();
        System.out.println("Buku " +judul+" berhasil dikembalikan.");
        
    }


    private void tampilkanBukunya(String penulis, String tahun, String judulBuku) {
        System.out.println("Judul   \t: " + judulBuku);
        System.out.println("Penulis \t: " + penulis);
        System.out.println("Tahun terbit: " + tahun);
        System.out.println("");
    }
}
