abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }
    
    public abstract double gaji();

    // Override metode toString untuk menampilkan informasi pegawai
    @Override
    public String toString() {
        return "Nama\t\t: " + nama + "\nNo. KTP\t\t: " + noKTP;
    }
}
