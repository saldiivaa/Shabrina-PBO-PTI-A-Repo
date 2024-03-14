import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String NIM;
    public String programStudi;
    
    public Mahasiswa(String nama, String NIM, String programStudi) {
        this.nama = nama;
        this.NIM = NIM;
        this.programStudi = programStudi;
    }
    
    public void belajar(String materiBelajar) {
        System.out.println("\n" + nama + " terdeteksi sedang belajar " + materiBelajar);
    }
    
    public void magang(String jenisPekerjaan) {
        System.out.println("\n" + nama + " terdeteksi sedang magang sebagai " + jenisPekerjaan);
    }
    
    public void praktikum(String materiPraktikum) {
        System.out.println("\n" + nama + " terdeteksi sedang melakukan praktikum dengan materi " + materiPraktikum);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========== SURVEI KEGIATAN MAHASISWA ==========");
        System.out.print("Masukkan nama\t\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        String NIM = input.nextLine();
        System.out.print("Masukkan program studi\t: ");
        String programStudi = input.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama, NIM, programStudi);
        
        System.out.println("\nSelamat datang, " + mahasiswa.nama + "! KamU dari prodi " + mahasiswa.programStudi + " kan??\nYuk, jawab pertanyaan singkat di bawah ini!");
        boolean lanjutkanProgramIni = true;
        
        while (lanjutkanProgramIni) {
            System.out.println("\nApa kesibukan kamu saat ini?");
            System.out.println("(1) Belajar");
            System.out.println("(2) Magang");
            System.out.println("(3) Praktikum");
            System.out.println("(4) Lihat informasi mahasiswa");
            System.out.println("(5) Keluar");
            System.out.print("Pilihanmu : ");
            int opsi = input.nextInt();
            input.nextLine(); 
            
            switch (opsi) {
                case 1:
                    System.out.print("\nMasukkan materi yang ingin dipelajari: ");
                    String materiBelajar = input.nextLine();
                    mahasiswa.belajar(materiBelajar);
                    break;
                case 2:
                    System.out.print("\nMasukkan jenis pekerjaan magang\t: ");
                    String jenisPekerjaan = input.nextLine();
                    mahasiswa.magang(jenisPekerjaan);
                    break;
                case 3:
                    System.out.print("\nMasukkan materi praktikum\t: ");
                    String materiPraktikum = input.nextLine();
                    mahasiswa.praktikum(materiPraktikum);
                    break;
                case 4:
                    System.out.println("\nNama: " + mahasiswa.nama);
                    System.out.println("NIM: " + mahasiswa.NIM);
                    System.out.println("Program Studi: " + mahasiswa.programStudi);
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini. Have a nice day," + mahasiswa.nama + "!");
                    lanjutkanProgramIni = false;
                    break;
                default:
                    System.out.println("\nOpsi yang kamu pilih tidak valid.");
            }
        }
        
        input.close();
    }
}