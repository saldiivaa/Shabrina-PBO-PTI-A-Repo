import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String NIM;
    public String programStudi;

    //Constructor
    public Mahasiswa(String nama, String NIM, String programStudi) {
        this.nama = nama;
        this.NIM = NIM;
        this.programStudi = programStudi;
    }

    //Constructor overload 1
    public Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
        this.programStudi = "Belum ditentukan";
    }

    //constructor overload 2
    public Mahasiswa(String nama) {
        this.nama = nama;
        this.NIM = "Belum ditentukan";
        this.programStudi = "Belum ditentukan";
    }

    public void magang(String jenisPekerjaan) {
        System.out.println("\n" + nama + " terdeteksi sedang magang sebagai " + jenisPekerjaan);
    }

    public void praktikum(String materiPraktikum) {
        System.out.println("\n" + nama + " terdeteksi sedang melakukan praktikum dengan materi " + materiPraktikum);
    }
    
    //method overload 1
    public void belajar(String materiBelajar) {
        System.out.println("\n" + nama + " terdeteksi sedang belajar " + materiBelajar);
    }

    // method overload 2
    public void belajar(String materiBelajar, int durasi) {
        System.out.println("\n" + nama + " terdeteksi sedang belajar " + materiBelajar + " selama " + durasi + " jam");
    }

    //method overload 3
    public void belajar() {
        System.out.println("\n" + nama + " terdeteksi sedang belajar");
    }

    //method instans yang mengembalikan tipe data class itu sendiri
    public Mahasiswa getInfo() {
        return this;
    }
}
