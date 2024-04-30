public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, NIK, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
    public double getTunjangan() {
        return super.getTunjangan() + 0.1 * getGaji();
    }
    public String toString() {
        return super.toString() +
            "\nDepartemen \t: " + departemen;
    }
}
