import java.util.Scanner;

class OnlineLearning {
    public String namaPengguna;
    public String NIMatauNIDN;
    public String mataKuliah;

    public OnlineLearning(String namaPengguna, String NIMatauNIDN, String mataKuliah) {
        this.namaPengguna = namaPengguna;
        this.NIMatauNIDN = NIMatauNIDN;
        this.mataKuliah = mataKuliah;
    }

    public void memberiPenugasan(String tugas) {
        System.out.println("Berhasil memberi penugasan " + tugas + " kepada mahasiswa mata kuliah " + mataKuliah + ".");
    }

    public void mengirimTugas(String tugas) {
        System.out.println("Anda berhasil mengirimkan tugas untuk mata kuliah " + mataKuliah);
    }

    public void mengunduhMateri(String materi) {
        System.out.println("Berhasil mengunduh materi perkuliahan " + materi);
    }

    public void menambahkanMateri(String materi) {
        System.out.println("Berhasil menambahkan materi " + materi + "kepada mahasiswa mata kuliah " +mataKuliah);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================== ONLINE LEARNING ====================\n");
        System.out.println("Selamat datang di Online Learning Newbie!\n");
        System.out.print("Masukkan nama pengguna\t\t\t : ");
        String namaPengguna = scanner.nextLine();
        System.out.print("Masukkan NIM/NIDN pengguna\t\t : ");
        String NIMatauNIDN = scanner.nextLine();
        System.out.print("Masukkan jenis pengguna (Mahasiswa/Dosen): ");
        String jenisPengguna = scanner.nextLine();
        System.out.print("Masukkan mata kuliah\t\t\t : ");
        String mataKuliah = scanner.nextLine();


        OnlineLearning kelas = new OnlineLearning(namaPengguna, NIMatauNIDN, mataKuliah);
        boolean lanjutkanProgramIni = true;
        while (lanjutkanProgramIni) {
            System.out.println("\nSelamat datang, " + kelas.namaPengguna + "!\nApa yang anda lakukan di kelas " + kelas.mataKuliah + " ini?\nSilahkan pilih menu di bawah.");
            System.out.println("Menu:");
            if (jenisPengguna.equalsIgnoreCase("Dosen")) {
                System.out.println("(1) Memberi Penugasan");
                System.out.println("(2) Menambah materi perkuliahan");
            } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
                System.out.println("(1) Mengunduh Materi");
                System.out.println("(2) Mengumpulkan Tugas");
            }
            System.out.println("(3) Keluar");
            System.out.print("Pilih menu : ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); 
            switch (opsi) {
                case 1:
                    if (jenisPengguna.equalsIgnoreCase("Dosen")) {
                        System.out.print("\nMasukkan tugas yang akan diberikan : ");
                        String tugas = scanner.nextLine();
                        kelas.memberiPenugasan(tugas);
                    } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
                        System.out.print("\nMasukkan materi yang ingin diunduh : ");
                        String materi = scanner.nextLine();
                        kelas.mengunduhMateri(materi);
                    }
                    break;
                case 2:
                    if (jenisPengguna.equalsIgnoreCase("Dosen")) {
                        System.out.print("\nMasukkan materi yang ingin ditambahkan : ");
                        String materi = scanner.nextLine();
                        kelas.menambahkanMateri(materi);
                    }else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
                        System.out.print("\nMasukkan tugas yang ingin dikumpulkan : ");
                        String tugas = scanner.nextLine();
                        kelas.mengirimTugas(tugas);
                    }
                    break;
                case 3:
                    System.out.println("====================  TERIMA KASIH   ====================\n");
                    lanjutkanProgramIni = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } 

        scanner.close();
    }
}
