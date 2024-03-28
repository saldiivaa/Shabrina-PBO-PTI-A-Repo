public class SwalayanTiny {
    private String nomorPelanggan;
    private String namaPelanggan;
    private String kodePelanggan;
    private String PIN;
    private double saldo;
    private double cashback = 0;
    private int kesalahanAutentikasi;

    public SwalayanTiny(String nomorPelanggan, String namaPelanggan, String PIN, double saldo) {
        this.nomorPelanggan = nomorPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.PIN = PIN;
        this.saldo = saldo;
        this.kodePelanggan = nomorPelanggan.substring(0, 2);
        this.kesalahanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public boolean pembelian(String PIN, double jumlahPembelian) {
        if (PIN.equals(this.PIN)) {

            if (saldo-jumlahPembelian >= 10000) {
                if (jumlahPembelian > 1000000) {
                    if (kodePelanggan.equals("38")) {
                        cashback = jumlahPembelian * 0.05;
                        System.out.println("\nPembelian melebihi target yang ditentukan.\nSelamat! Anda mendapatkan cashback sebesar 5%.");
                    } else if (kodePelanggan.equals("56")) {
                        cashback = jumlahPembelian * 0.07;
                        System.out.println("\nPembelian melebihi target yang ditentukan.\nSelamat! Anda mendapatkan cashback sebesar 7%.");
                    } else if (kodePelanggan.equals("74")) {
                        cashback = jumlahPembelian * 0.10;
                        System.out.println("\nPembelian melebihi target yang ditentukan.\nSelamat! Anda mendapatkan cashback sebesar 10%.");
                    }
                } else {
                    if (kodePelanggan.equals("38")) {
                        cashback = jumlahPembelian * 0;
                        System.out.println("\nNominal pembelian belum mencapai target yang ditentukan.\nMohon, maaf. Anda tidak mendapatkan cashback.");
                    } else if (kodePelanggan.equals("56")) {
                        cashback = jumlahPembelian * 0.02;
                        System.out.println("\nSelamat, Anda adalah member gold!\nAnda mendapatkan cashback sebesar 2%.");
                    } else if (kodePelanggan.equals("74")) {
                        cashback = jumlahPembelian * 0.05;
                        System.out.println("\nSelamat, Anda adalah member platinum!\nAnda mendapatkan cashback sebesar 5%.");
                    }
                }
                saldo += cashback; 
                saldo -= jumlahPembelian;
                if (cashback>0) {
                    System.out.println("\nSaldo Anda bertambah sebesar " + cashback + " ,diperoleh dari cashback.");
                }
                return true;
            } else {
                System.out.println("\nMohon maaf, saldo tidak mencukupi untuk melakukan transaksi.");
                return false;
            }
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("\nMohon maaf, akun Anda diblokir karena kesalahan autentikasi berulang lebih dari 3 kali.");
            }
            return false;
        }
    }

    public boolean topUp(String PIN, double jumlahTopUp) {
        if (PIN.equals(this.PIN)) {
            saldo += jumlahTopUp;
            return true;
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Mohon maaf, akun Anda diblokir karena kesalahan autentikasi berulang lebih dari 3 kali.");
            }
            return false;
        }
    }
}
