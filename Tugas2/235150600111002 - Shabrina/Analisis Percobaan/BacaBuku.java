// Rumus
// Total kata dalam buku=jumlah halaman*kata per halaman
// Jumlah halaman=(total kata dalam buku)/(kata perhalaman perhari)

public class BacaBuku {
    private int jumHal;
    private int kataPerHal;
    private int totKata;
    private int kataPerHari;
    private int jumHari;

    public BacaBuku(int h, int k) {
        jumHal = h;
        kataPerHal = k;
    }

    public int lamaBukuHabis() {
        totKata = jumHal * kataPerHal;
        kataPerHari = 100;
        jumHari = totKata / kataPerHari;
        return jumHari;
    }

    public static void main(String[] args) {
        BacaBuku buku = new BacaBuku(100, 200);
        int lamaBukuHabis = buku.lamaBukuHabis();
        System.out.println("Waktu yang diperlukan mahasiswa A untuk menghabiskan 1 buku adalah " +lamaBukuHabis+ " hari.");
    }
}
