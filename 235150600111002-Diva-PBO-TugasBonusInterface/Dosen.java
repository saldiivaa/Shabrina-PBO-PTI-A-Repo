public class Dosen extends Civitas implements PesertaKelas, Pengajar{
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println("Dosen mengikuti penelitian");
    }
    
    public void masukKelas(){
        System.out.println("Dosen masuk ke kelas");
    }

    public void mengajar(String matkul) {
        System.out.println("Dosen mengajar mata kuliah " + matkul);
    }

    public void mengasihTugas(){
        System.out.println("Dosen memberikan tugas");
    }

    public void menilaiTugas() {
        System.out.println("Dosen menilai tugas");
    }
}