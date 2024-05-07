public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() * berat;
    }

    @Override
    public String toString() {
        return "\nKue Pesanan\n" + super.toString() + String.format("\nBerat\t : %.2f kg", berat);
    } // super.toString() untuk memanggil metode toString() dari superclass Kue
}
