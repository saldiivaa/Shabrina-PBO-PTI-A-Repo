class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    // Konstruktor
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }


    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }


    // Implementasi metode hitungGaji untuk PegawaiHarian
    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int jamNormal = 40;
            int jamLembur = totalJam - jamNormal;
            return (upahPerJam * jamNormal) + (upahPerJam * 1.5 * jamLembur);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah/jam\t: " + String.format("Rp %.2f", upahPerJam) + "\nTotal jam kerja : " + totalJam + " jam" + "\nPendapatan\t: " + String.format("Rp %.2f", gaji());
    }
}