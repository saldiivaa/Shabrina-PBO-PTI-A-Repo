public class Main {
    public static void main(String[] args) {
        System.out.println("===== INFORMASI GAJI PEGAWAI PT.MENCARI CINTA SEJATI =====");
        Pegawai[] daftarPegawai = new Pegawai[9];
        daftarPegawai[0] = new PegawaiTetap("Bayu", "33333333333333333333", 2000000.0);
        daftarPegawai[1] = new PegawaiHarian("Edo", "22222222222222222222", 8500.0, 40);
        daftarPegawai[2] = new Sales("Tika", "11111111111111111111", 50, 50000.0);
        daftarPegawai[3] = new PegawaiTetap("Diva", "33333333333333333333", 3000000.0);
        daftarPegawai[4] = new PegawaiHarian("Davis", "22222222222222222222", 10000.0, 40);
        daftarPegawai[5] = new Sales("Kiw", "11111111111111111111", 40, 50000.0);
        daftarPegawai[6] = new PegawaiTetap("HEHE", "33333333333333333333", 4000000.0);
        daftarPegawai[7] = new PegawaiHarian("Iyah", "22222222222222222222", 12000.0, 40);
        daftarPegawai[8] = new Sales("Yagitu", "11111111111111111111", 30, 50000.0);


        for (Pegawai pegawai : daftarPegawai) {
            System.out.println(pegawai.getClass().getSimpleName() + "\n" + pegawai + "\n");
        }

    }
}
