import java.util.Scanner;

public class Dosen {
    public String nama;
    public String NIDN;
    public int umur;
    public String bidangKeahlian;
    public String posisi;

    public Dosen(String nama, String NIDN, int umur, String bidangKeahlian, String posisi) {
        this.nama = nama;
        this.NIDN = NIDN;
        this.umur = umur;
        this.bidangKeahlian = bidangKeahlian;
        this.posisi = posisi;
    }

    public void mengajar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nApakah " + nama + " sedang mengajar? (ya/tidak)");
        System.out.print("Jawaban anda : ");
        String mengajar = scanner.nextLine();
        if (mengajar.equalsIgnoreCase("ya")) {
            System.out.println("Berapakah rating yang anda berikan atas pengajaran dosen? (1-10) ");
            System.out.print("Jawaban anda : ");
            int rating = scanner.nextInt();
            System.out.println("Terima kasih atas penilaian Anda.");
        } else {
            System.out.println("Tidak sedang mengajar.");
        }
    }

    public void meneliti(String bidangKeahlian) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nApakah " + nama + " sedang melakukan penelitian di bidang " + bidangKeahlian + "? (ya/tidak)");
        System.out.print("Jawaban anda : ");
        String meneliti = scanner.nextLine();
        if (meneliti.equalsIgnoreCase("ya")) {
            System.out.print("Apa judul penelitian yang sedang dikerjakan: ");
            String judulPenelitian = scanner.nextLine();
            System.out.println(nama + " terdeteksi sedang melakukan penelitian dengan judul " + judulPenelitian + ".");
        } else {
            System.out.println("Tidak sedang melakukan penelitian.");
        }
    }

    public void menyusunKurikulum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nApakah " + nama + " sedang menyusun kurikulum? (ya/tidak)");
        System.out.print("Jawaban anda : ");
        String menyusunKurikulum = scanner.nextLine();
        if (menyusunKurikulum.equalsIgnoreCase("ya")) {
            System.out.println(nama + " sedang menyusun kurikulum untuk program studi ini.");
        } else {
            System.out.println("Tidak sedang menyusun kurikulum.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================== SURVEI KINERJA DOSEN ====================");
        System.out.print("Masukkan nama dosen\t\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIDN dosen\t\t: ");
        String NIDN = scanner.nextLine();
        System.out.print("Masukkan umur dosen\t\t: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan bidang keahlian dosen\t: ");
        String bidangKeahlian = scanner.nextLine();
        System.out.print("Masukkan posisi dosen\t\t: ");
        String posisi = scanner.nextLine();

        Dosen dosen = new Dosen(nama, NIDN, umur, bidangKeahlian, posisi);
        boolean lanjutkanProgramIni = true;
        
        while (lanjutkanProgramIni) {
            System.out.println("\nSurvei tentang dosen " + dosen.nama + ", bidang " + dosen.bidangKeahlian + ":");
            System.out.println("(1) Apakah dosen sedang mengajar? Beri rating pengajaran dosen.");
            System.out.println("(2) Apakah dosen sedang meneliti? Apa penelitiannya?");
            System.out.println("(3) Apakah dosen sedang menyusun kurikulum?");
            System.out.println("(4) Keluar");
            System.out.print("Pilih opsi : ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    dosen.mengajar();
                    break;
                case 2:
                    dosen.meneliti(bidangKeahlian);
                    break;
                case 3:
                    dosen.menyusunKurikulum();
                    break;
                case 4:
                    System.out.println("====================     TERIMA KASIH     ====================");
                    lanjutkanProgramIni = false;
                    break;
                default:
                    System.out.println("Opsi yang anda masukkan tidak valid.");
            }
        } 

        scanner.close();
    }
}