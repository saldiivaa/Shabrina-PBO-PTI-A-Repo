public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        return "\nKue Jadi\n" + super.toString() + String.format("\nJumlah\t : %.2f", jumlah);
    } // super.toString() untuk memanggil metode toString() dari superclass Kue
}
