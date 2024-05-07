import java.util.Calendar;

public abstract class Employee {
    private String name;
    private String noKTP;
    private String tanggalLahir;//menambahkan atribut tanggal lahir

    //menambahkan method mtator tanggal lahir
    public void setTanggalLahir (String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    //menambahkan method accessor tanggal lahir
    public String getTanggalLahir () {
        return tanggalLahir;
    }

    public Employee(String name, String noKTP, String tanggalLahir) {
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }
    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format("" + getName() + "\nNo. KTP: " + getNoKTP()) + "\nTanggal Lahir: " + getTanggalLahir();
    }

    public abstract double earnings();// pendapatan

    protected double getBirthdayBonus() {
        Calendar now = Calendar.getInstance(); //mengakses kalender
        //mengambil nilai bulan dari objek kalender. dimulai dengan januari =0
        int currentMonth = now.get(Calendar.MONTH) + 1;
        //mengambil bulan ulang tahun karyawan
        int birthMonth = Integer.parseInt(getTanggalLahir().split("-")[1]);
        return currentMonth == birthMonth ? 100000 : 0;
    }
}
