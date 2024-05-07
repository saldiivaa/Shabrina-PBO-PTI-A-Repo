public class PekerjaProduksi extends Employee {
    private int jumlahProduksi;
    private double upahBarang;

    public PekerjaProduksi(String name, String noKTP, int jumlahProduksi, double upahBarang, String tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setJumlahProduksi(jumlahProduksi);
        setUpahBarang(upahBarang);
    }

    public void setJumlahProduksi (int piecesProduced) {
        this.jumlahProduksi = piecesProduced;
    }

    public int getJumlahProduksi () {
        return jumlahProduksi;
    }
    
    public void setUpahBarang (double upahBarang) {
        this.upahBarang = upahBarang;
    }

    public double getUpahBarang () {
        return upahBarang;
    }

    public double earnings() {
        return getJumlahProduksi() * getUpahBarang() + getBirthdayBonus();
    }

    
    public String toString() {
        return String.format("Pekerja: " + super.toString() +"\nJumlah Produksi: "+ getJumlahProduksi()+ "\nUpah Barang: " + getUpahBarang());
    }
}
