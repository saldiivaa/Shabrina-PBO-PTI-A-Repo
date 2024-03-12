import java.util.Scanner;

public class LoginSIAM {

    static String[][] informasiMahasiswa = {
        {"235150600111001", "akucantikbanget123"},
        {"235150600111002", "pacarnyaZaynMalik"},
        {"235150600111003", "LoGakBahayaTa"}
};
    static boolean login = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!login) {
                System.out.println("SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK MAHASISWA :D");
                System.out.println(" (1) Login");
                System.out.println(" (2) Lupa Kata Sandi");
                System.out.println(" (3) Keluar");
            } else {
                System.out.println(" (1) Logout");
            }

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (!login) {
                        login(scanner);
                    } else {
                        logout();
                    }
                    break;
                case 2:
                    lupaKataSandi(scanner);
                    break;
                case 3:
                    if (login) {
                        logout();
                    }
                    System.out.println("Terima kasih sudah menggunakan Sistem Informasi kami, Manies ;p.");
                    return;
                default:
                    System.out.println("Menu yang kamu masukin engga valid tuh.");
            }
        }
    }

    static void login(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa\t: ");
        String nimMahasiswa = scanner.nextLine();
        System.out.print("Masukkan kata sandi\t: ");
        String kataSandi = scanner.nextLine();

        for (String[] info : informasiMahasiswa) {
            if (info[0].equals(nimMahasiswa) && info[1].equals(kataSandi)) {
                System.out.println("Login berhasil, YEY!");
                login = true;
                return;
            }
        }
        System.out.println("Nama atau kata sandi kamu salah :(");
        System.out.println("Apakah kamu ingin mengganti kata sandi? yay or nay");
        String yayornay = scanner.nextLine();
        if (yayornay.equalsIgnoreCase("yay")) {
            lupaKataSandi(scanner);
        }
    }

    static void logout() {
        System.out.println("Logout berhasil, HORE!");
        login = false;
    }

    static void lupaKataSandi(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa\t: ");
        String nimPengguna = scanner.nextLine();

        boolean nimValid = false;
        for (String[] info : informasiMahasiswa) {
            if (info[0].equals(nimPengguna)) {
                System.out.print("Masukkan kata sandi baru\t: ");
                String sandiBaru = scanner.nextLine();
                info[1] = sandiBaru;
                System.out.println("Kata sandi berhasil diubah. Jangan sampai salah lagi yah, Bro!");
                nimValid = true;
                break;
            }
        }
        if (!nimValid) {
        System.out.println("Yah, NIM kamu salah, nih.");
        }
    }
}
