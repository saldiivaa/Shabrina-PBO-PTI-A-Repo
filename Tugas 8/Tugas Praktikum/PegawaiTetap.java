class PegawaiTetap extends Pegawai {
    private double upah;

    // Konstruktor
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    // Implementasi metode hitungGaji untuk PegawaiTetap
    @Override
    public double gaji() {
        return upah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah\t\t: " + String.format("Rp %.2f", upah) + "\nPendapatan\t: " + String.format("Rp %.2f", gaji());
    }
}