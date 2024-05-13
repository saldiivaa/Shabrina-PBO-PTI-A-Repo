class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    // Konstruktor
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    public int getPenjualan() {
            return penjualan;
        }
    public double getKomisi() {
            return komisi;
        }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    

    // Implementasi metode hitungGaji untuk Sales
    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Penjualan : " + penjualan + "\nBesaran Komisi  : " + String.format("Rp %.2f", komisi) + "\nPendapatan\t: " + String.format("Rp %.2f", gaji());
    }
}
