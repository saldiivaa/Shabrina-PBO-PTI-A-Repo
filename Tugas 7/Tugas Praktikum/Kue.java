public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode abstrak untuk menghitung harga
    public abstract double hitungHarga();

    // Menyediakan representasi string dasar untuk semua jenis kue
    @Override
    public String toString() {
        return String.format("Nama\t : %s\nHarga\t : Rp %,.2f", nama, hitungHarga());
    } //representasi String dari objek Kue
}
