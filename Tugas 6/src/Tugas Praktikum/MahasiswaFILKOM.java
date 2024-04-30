public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }
    public void setNIM(String NIM) {
            this.NIM = NIM;
        }

    public String getNIM() {
        return NIM;
    }
    public void setIPK(double IPK) {
            this.IPK = IPK;
    }

    public double getIPK() {
        return IPK;
    }

    public String getStatus() {
        String prodi ="";
        switch (NIM.charAt(6)) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        String angkatan = "20" + NIM.substring(0, 2);
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (IPK >= 3.0 && IPK <= 3.5) {
            return 50.0;
        } else if (IPK > 3.5 && IPK <= 4.0) {
            return 75.0;
        }
        return 0.0;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNIM \t\t: " + NIM + "\nIPK \t\t: " + IPK + "\nStatus \t\t: " + getStatus();
    }
}
