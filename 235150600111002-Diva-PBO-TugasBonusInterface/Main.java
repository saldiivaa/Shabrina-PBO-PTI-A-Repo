import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Asprak asprak = new Asprak("Budi", 21, true, "A12345", 3.8, 2);
        Dosen dosen = new Dosen("Dr. Andi", 45, true, "D67890", 15000000);
        Mahasiswa mahasiswa = new Mahasiswa("Siti", 20, false, "M54321", 3.5, 1);
        Resepsionis resepsionis = new Resepsionis("Ayu", 30, false, 101, "Front Desk", 6000000);

        Civitas asprakUp = asprak;
        System.out.println("===================================");
        System.out.println("         INFORMASI ASPRAK          ");
        System.out.println("===================================");
        asprak.ngasihKomenDiGCR();
        asprak.mengajar("Pemrograman Java");
        asprak.mengasihTugas();
        asprak.menilaiTugas();

        Civitas dosenUp= dosen;
        System.out.println("\n===================================");
        System.out.println("         INFORMASI DOSEN           ");
        System.out.println("===================================");
        dosen.ikutPenelitian();
        dosen.masukKelas();
        dosen.mengajar("Sistem Basis Data");
        dosen.mengasihTugas();
        dosen.menilaiTugas();

        Civitas mahasiswaUp = mahasiswa;
        System.out.println("\n===================================");
        System.out.println("       INFORMASI MAHASISWA         ");
        System.out.println("===================================");
        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("BEM");
        mahasiswa.presentasi();
        mahasiswa.masukKelas();

        Civitas resepsionisUp = resepsionis;
        System.out.println("\n===================================");
        System.out.println("      INFORMASI RESEPSIONIS        ");
        System.out.println("===================================");
        resepsionis.melayani();
        resepsionis.melapor();

        System.out.println("\n===================================");
        System.out.println("       AKTIVITAS UPCASTED          ");
        System.out.println("===================================");
        asprakUp.makanDiKantin("Kantin Utama");
        dosenUp.mainGameCorner();
        mahasiswaUp.naikLift();
        resepsionisUp.makanDiKantin("Kantin Bawah");

       
        System.out.println("\n===================================");
        System.out.println("       AKTIVITAS DOWNCASTED        ");
        System.out.println("===================================");
        if (asprakUp instanceof Asprak) {
            Asprak downcastedAsprak = (Asprak) asprakUp;
            downcastedAsprak.ngasihKomenDiGCR();
        }

        if (dosenUp instanceof Dosen) {
            Dosen downcastedDosen = (Dosen) dosenUp;
            downcastedDosen.ikutPenelitian();
        }

        if (mahasiswaUp instanceof Mahasiswa) {
            Mahasiswa downcastedMahasiswa = (Mahasiswa) mahasiswaUp;
            downcastedMahasiswa.presentasi();
        }

        if (resepsionisUp instanceof Resepsionis) {
            Resepsionis downcastedResepsionis = (Resepsionis) resepsionisUp;
            downcastedResepsionis.melayani();
        }
    }
}