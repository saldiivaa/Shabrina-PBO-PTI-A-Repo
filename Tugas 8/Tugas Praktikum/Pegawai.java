abstract class Pegawai {
    private String nama;
    private String noKTP;

    // Konstruktor
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk noKTP
    public String getNoKTP() {
        return noKTP;
    }

    // Metode abstrak untuk menghitung gaji
    public abstract double gaji();

    // Override metode toString untuk menampilkan informasi pegawai
    @Override
    public String toString() {
        return "Nama\t\t: " + nama + "\nNo. KTP\t\t: " + noKTP;
    }
}
