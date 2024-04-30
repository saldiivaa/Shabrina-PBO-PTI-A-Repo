import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
            this.gaji = gaji;
    }
    public double getGaji() {
        return gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
            this.tahunMasuk = tahunMasuk;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
            this.jumlahAnak = jumlahAnak;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        long tahunKerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (tahunKerja >= 0 && tahunKerja < 5) {
            return 0.05 * gaji;
        } else if (tahunKerja >= 5 && tahunKerja < 10) {
            return 0.1 * gaji;
        } else if (tahunKerja >= 10) {
            return 0.15 * gaji;
        }
        return 0;
    }

    public double getTunjangan() {
        return super.getTunjangan() + (20.0 *jumlahAnak);
    }

    public double getPendapatan() {
        return getTunjangan() + getBonus()+ gaji;
    }

    public String toString() {
        return super.toString() +"\nTahun masuk \t: " + tahunMasuk + "\nJumlah anak \t: " + jumlahAnak +"\nGaji\t\t: " + gaji;
    }
}
