public class Main {
    public static void main(String[] args) {
        System.out.println("===== INFORMASI GAJI PEGAWAI PT.MENCARI CINTA SEJATI =====\n");
        Pegawai[] daftarPegawai = new Pegawai[9];
        daftarPegawai[0] = new PegawaiTetap("Bayu", "333333333333", 2000000.0);
        daftarPegawai[1] = new PegawaiHarian("Edo", "222222222222", 8500.0, 40);
        daftarPegawai[2] = new Sales("Tika", "111111111111", 50, 50000.0);
        daftarPegawai[3] = new PegawaiTetap("Diva", "333333333333", 3000000.0);
        daftarPegawai[4] = new PegawaiHarian("Davis", "222222222222", 10000.0, 40);
        daftarPegawai[5] = new Sales("Kiw", "111111111111", 40, 50000.0);
        daftarPegawai[6] = new PegawaiTetap("HEHE", "333333333333", 4000000.0);
        daftarPegawai[7] = new PegawaiHarian("Iyah", "222222222222", 12000.0, 40);
        daftarPegawai[8] = new Sales("Yagitu", "111111111111", 30, 50000.0);


        for (Pegawai pegawai : daftarPegawai) {
            System.out.println("\n" + pegawai + "\n");
        
        if (pegawai instanceof PegawaiTetap) {
            PegawaiTetap tetap = (PegawaiTetap) pegawai; //proses downcasting dari objek pegawai yang bertipe Pegawai menjadi PegawaiTetap
            System.out.println("===== OUTPUT DOWNCASTING =====");
            System.out.println("Nama Pegawai Tetap : " + tetap.getNama());
            System.out.println("Upah\t\t   : " + tetap.getUpah());
            System.out.println("=============================="+ "\n");
        } else if (pegawai instanceof PegawaiHarian) {
            System.out.println("===== OUTPUT DOWNCASTING =====");
            PegawaiHarian harian = (PegawaiHarian) pegawai; //proses downcasting dari objek pegawai yang bertipe Pegawai menjadi PegawaiHarian
            System.out.println("Nama Pegawai Harian : " + harian.getNama());
            System.out.println("Upah/jam\t    : " + harian.getUpahPerJam());
            System.out.println("Total jam kerja\t    : " + harian.getTotalJam());
            System.out.println("==============================" + "\n");
        } else if (pegawai instanceof Sales) {
            Sales sales = (Sales) pegawai; //proses downcasting dari objek pegawai yang bertipe Pegawai menjadi PegawaiTetapproses downcasting dari objek pegawai yang bertipe Pegawai menjadi Sales
            System.out.println("===== OUTPUT DOWNCASTING =====");
            System.out.println("Nama Sales\t: " + sales.getNama());
            System.out.println("Total Penjualan : " + sales.getPenjualan());
            System.out.println("Besaran Komisi  : " + String.format("Rp %.2f", sales.getKomisi()));
            System.out.println("==============================");
            }
        }


    }
}
