import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== SURVEI KEGIATAN MAHASISWA ==========");
        System.out.print("Masukkan nama\t\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        String NIM = scanner.nextLine();
        System.out.print("Masukkan program studi\t: ");
        String programStudi = scanner.nextLine();

        Mahasiswa mahasiswa1 = new Mahasiswa(nama, NIM, programStudi);
        Mahasiswa mahasiswa2 = new Mahasiswa(nama, NIM);
        Mahasiswa mahasiswa3 = new Mahasiswa(nama);

        System.out.println("\nSelamat datang, " + mahasiswa1.nama + "! Kamu dari prodi " + mahasiswa1.programStudi + " kan??\nYuk, jawab pertanyaan singkat di bawah ini!");
        boolean lanjutkanProgramIni = true;

        while (lanjutkanProgramIni) {
            System.out.println("\nApa kesibukan kamu saat ini?");
            System.out.println("(1) Belajar");
            System.out.println("(2) Magang");
            System.out.println("(3) Praktikum");
            System.out.println("(4) Lihat informasi mahasiswa");
            System.out.println("(5) Keluar");
            System.out.print("Pilihanmu : ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    System.out.print("\nMasukkan materi yang ingin dipelajari: ");
                    String materiBelajar = scanner.nextLine();
                    mahasiswa1.belajar(materiBelajar);
                    break;
                case 2:
                    System.out.print("\nMasukkan jenis pekerjaan magang\t: ");
                    String jenisPekerjaan = scanner.nextLine();
                    mahasiswa1.magang(jenisPekerjaan);
                    break;
                case 3:
                    System.out.print("\nMasukkan materi praktikum\t: ");
                    String materiPraktikum = scanner.nextLine();
                    mahasiswa1.praktikum(materiPraktikum);
                    break;
                case 4:
                Mahasiswa infoMahasiswa = mahasiswa1.getInfo();
                System.out.println("\nInfo Mahasiswa:");
                System.out.println("Nama\t\t: " + infoMahasiswa.nama);
                System.out.println("NIM\t\t: " + infoMahasiswa.NIM);
                System.out.println("Program Studi\t: " + infoMahasiswa.programStudi);
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini. Have a nice day," + mahasiswa1.nama + "!");
                    lanjutkanProgramIni = false;
                    break;
                default:
                    System.out.println("\nOpsi yang kamu pilih tidak valid.");
            }
        }

        scanner.close();
    }
}
