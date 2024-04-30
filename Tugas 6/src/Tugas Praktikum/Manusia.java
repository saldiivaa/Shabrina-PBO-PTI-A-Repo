public class Manusia {
    private String nama;
    private boolean jenisKelamin; 
    private String NIK;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
            this.nama = nama;
        
    }

    public String getNama() {
        return nama;
    }

    public void setjenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    } 
    
    public boolean jenisKelamin() {
        return jenisKelamin;
    }

    public void setNIK(String NIK) {
            this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setMenikah(boolean menikah) {
            this.menikah = menikah;
    }

    public boolean menikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (!menikah) {
            return 15.0;
        } else {
            if (jenisKelamin) {
                return 25.0;
            } else {
                return 20.0;
            }
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return String.format("Nama \t\t: %s\nNIK\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t: %.1f", 
            nama, NIK, (jenisKelamin ? "Laki-laki" : "Perempuan"), getPendapatan());
    }
}
