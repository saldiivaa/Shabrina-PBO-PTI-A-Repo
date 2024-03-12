public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    public double waktu;
    public double rubahWaktu;
    public double kecepatanBaru;
    public double rumusJarak;
    public double gantiJarak;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
        rubahKecepatan(kecepatan);		
    }

    private void rubahKecepatan(double d){
        kecepatanBaru = (d * 1000) / 3600;
        System.out.println("Kecepatan anda dalam satuan m/s adalah " + kecepatanBaru + " m/s");
    } 

    public void setWaktu(double d){
        waktu = d;
        rubahSekon(waktu);
    }
    private void rubahSekon(double d){
        rubahWaktu = 3600 * d;
        System.out.println("Waktu anda dalam satuan detik adalah " + rubahWaktu + " detik");
    }

    public double hitungJarak(){
        rumusJarak = kecepatan * waktu;
        System.out.println("Kecepatan sementara anda adalah " + waktu);
        return rumusJarak;
    }

    public double gantiSatuanJarak(){
        gantiJarak = rumusJarak / 1000;
        return gantiJarak;
    }

    public void displayMessage(){			
        System.out.println("Mobil anda adalah bermerek "+manufaktur);			
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("Jarak yang dapat ditempuh adalah "+hitungJarak());
        System.out.println("Jarak anda setelah dikonversi ke km adalah "+gantiSatuanJarak());
    }			
}