import java.util.*;

class Penulis {
    private String namaPenulis;

    public Penulis(String s) {
        this.namaPenulis = s;
    }

    public String setNama() {
        return namaPenulis;
    }
}

class Buku {
    private String judulBuku;
    private Penulis penulisBuku;
    private String kategoriBuku;

    public Buku(String j, Penulis p, String k) {
        judulBuku = j;
        penulisBuku = p;
        kategoriBuku = k;
    }

    public String setJudul() {
        return judulBuku;
    }

    public Penulis setPenulis() {
        return penulisBuku;
    }

    public String setKategori() {
        return kategoriBuku;
    }
}

class Perpustakaan {
    private static String nama;
    private static List<Buku> listBuku;

    public Perpustakaan(String s) {
        Perpustakaan.nama = s;
        listBuku = new ArrayList<>();
        inisialisasiListBuku();
    }

    private void tambahkanBuku(Buku b) {
        listBuku.add(b);
    }

    private void inisialisasiListBuku() {
        tambahkanTeknologi();
        tambahkanFilsafat();
        tambahkanSejarah();
        tambahkanAgama();
        tambahkanPsikologi();
        tambahkanPolitik();
        tambahkanFiksi();
    }

    private void tambahkanTeknologi() {
        Penulis penulis1 = new Penulis("Penulis Teknologi 1");
        Penulis penulis2 = new Penulis("Penulis Teknologi 2");
        Penulis penulis3 = new Penulis("Penulis Teknologi 3");
        Penulis penulis4 = new Penulis("Penulis Teknologi 4");
        Penulis penulis5 = new Penulis("Penulis Teknologi 5");

        tambahkanBuku(new Buku("TEKNOLOGI 1", penulis1, "Teknologi"));
        tambahkanBuku(new Buku("TEKNOLOGI 2", penulis2, "Teknologi"));
        tambahkanBuku(new Buku("TEKNOLOGI 3", penulis3, "Teknologi"));
        tambahkanBuku(new Buku("TEKNOLOGI 4", penulis4, "Teknologi"));
        tambahkanBuku(new Buku("TEKNOLOGI 5", penulis5, "Teknologi"));
    }

    private void tambahkanFilsafat() {
        Penulis penulis1 = new Penulis("Penulis Filsafat 1");
        Penulis penulis2 = new Penulis("Penulis Filsafat 2");
        Penulis penulis3 = new Penulis("Penulis Filsafat 3");
        Penulis penulis4 = new Penulis("Penulis Filsafat 4");
        Penulis penulis5 = new Penulis("Penulis Filsafat 5");

        tambahkanBuku(new Buku("FILSAFAT A", penulis1, "Filsafat"));
        tambahkanBuku(new Buku("FILSAFAT B", penulis2, "Filsafat"));
        tambahkanBuku(new Buku("FILSAFAT C", penulis3, "Filsafat"));
        tambahkanBuku(new Buku("FILSAFAT D", penulis4, "Filsafat"));
        tambahkanBuku(new Buku("FILSAFAT E", penulis5, "Filsafat"));
    }

    private void tambahkanSejarah() {
        Penulis penulis1 = new Penulis("Penulis Sejarah 1");
        Penulis penulis2 = new Penulis("Penulis Sejarah 2");
        Penulis penulis3 = new Penulis("Penulis Sejarah 3");
        Penulis penulis4 = new Penulis("Penulis Sejarah 4");
        Penulis penulis5 = new Penulis("Penulis Sejarah 5");

        tambahkanBuku(new Buku("SEJARAH SATU", penulis1, "Sejarah"));
        tambahkanBuku(new Buku("SEJARAH DUA", penulis2, "Sejarah"));
        tambahkanBuku(new Buku("SEJARAH TIGA", penulis3, "Sejarah"));
        tambahkanBuku(new Buku("SEJARAH EMPAT", penulis4, "Sejarah"));
        tambahkanBuku(new Buku("SEJARAH LIMA", penulis5, "Sejarah"));
    }

    private void tambahkanAgama() {
        Penulis penulis1 = new Penulis("Penulis Agama 1");
        Penulis penulis2 = new Penulis("Penulis Agama 2");
        Penulis penulis3 = new Penulis("Penulis Agama 3");
        Penulis penulis4 = new Penulis("Penulis Agama 4");
        Penulis penulis5 = new Penulis("Penulis Agama 5");

        tambahkanBuku(new Buku("AGAMA ISLAM", penulis1, "Agama"));
        tambahkanBuku(new Buku("AGAMA KRISTEM", penulis2, "Agama"));
        tambahkanBuku(new Buku("AGAMA HINDU", penulis3, "Agama"));
        tambahkanBuku(new Buku("AGAMA KONGHUCU", penulis4, "Agama"));
        tambahkanBuku(new Buku("ATHEIS", penulis5, "Agama"));
    }

    private void tambahkanPsikologi() {
        Penulis penulis1 = new Penulis("Penulis Psikologi 1");
        Penulis penulis2 = new Penulis("Penulis Psikologi 2");
        Penulis penulis3 = new Penulis("Penulis Psikologi 3");
        Penulis penulis4 = new Penulis("Penulis Psikologi 4");
        Penulis penulis5 = new Penulis("Penulis Psikologi 5");

        tambahkanBuku(new Buku("WARAS", penulis1, "Psikologi"));
        tambahkanBuku(new Buku("SETENGAH WARAS", penulis2, "Psikologi"));
        tambahkanBuku(new Buku("AGAK GILA", penulis3, "Psikologi"));
        tambahkanBuku(new Buku("GILA BANGET", penulis4, "Psikologi"));
        tambahkanBuku(new Buku("GILA INI MAH", penulis5, "Psikologi"));
    }

    private void tambahkanPolitik() {
        Penulis penulis1 = new Penulis("Penulis Politik 1");
        Penulis penulis2 = new Penulis("Penulis Politik 2");
        Penulis penulis3 = new Penulis("Penulis Politik 3");
        Penulis penulis4 = new Penulis("Penulis Politik 4");
        Penulis penulis5 = new Penulis("Penulis Politik 5");

        tambahkanBuku(new Buku("POLITIK GOLKAR", penulis1, "Politik"));
        tambahkanBuku(new Buku("POLITIK NASDEM", penulis2, "Politik"));
        tambahkanBuku(new Buku("POLITIK PDIP", penulis3, "Politik"));
        tambahkanBuku(new Buku("POLITIK PKS", penulis4, "Politik"));
        tambahkanBuku(new Buku("POLITIK PERINDO", penulis5, "Politik"));
    }

    private void tambahkanFiksi() {
        Penulis penulis1 = new Penulis("Penulis Fiksi 1");
        Penulis penulis2 = new Penulis("Penulis Fiksi 2");
        Penulis penulis3 = new Penulis("Penulis Fiksi 3");
        Penulis penulis4 = new Penulis("Penulis Fiksi 4");
        Penulis penulis5 = new Penulis("Penulis Fiksi 5");

        tambahkanBuku(new Buku("FIKSI 1", penulis1, "Fiksi"));
        tambahkanBuku(new Buku("FIKSI 2", penulis2, "Fiksi"));
        tambahkanBuku(new Buku("FIKSI 3", penulis3, "Fiksi"));
        tambahkanBuku(new Buku("FIKSI 4", penulis4, "Fiksi"));
        tambahkanBuku(new Buku("FIKSI 5", penulis5, "Fiksi"));
    }

    public static void displayListBuku() {
        System.out.println("Daftar buku yang tersedia sekarang :");
        for (Buku buku : listBuku) {
            System.out.println("Judul buku\t: " + buku.setJudul());
            System.out.println("Penulis buku \t: " + buku.setPenulis().setNama());
            System.out.println("Kategori buku\t: " + buku.setKategori());
            System.out.println();
        }
    }

    public static void displayKategori(String k) {
        System.out.println("Daftar Buku dalam Kategori " + k + ":");
        int count = 0;
        for (Buku buku : listBuku) {
            if (buku.setKategori().equalsIgnoreCase(k)) {
                System.out.println("Judul buku\t: " + buku.setJudul());
                System.out.println("Penulis buku\t: " + buku.setPenulis().setNama());
                System.out.println();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mohon maaf, buku yang anda input tidak termasuk ke dalam kategori " + k);
        }
    }

    public static void bukuDicari(String j) {
        boolean found = false;
        System.out.println("\nBerikut informasi buku '" + j + "':");
        for (Buku buku : listBuku) {
            if (buku.setJudul().equalsIgnoreCase(j)) {
                System.out.println("Judul buku\t: " + buku.setJudul());
                System.out.println("Penulis buku\t: " + buku.setPenulis().setNama());
                System.out.println("Kategori buku\t: " + buku.setKategori());
                System.out.println();
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Mohon maaf, buku dengan judul yang anda input '" + j + "' tidak ditemukan.");
        }
    }
}

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaanSumberMakmur = new Perpustakaan("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        int pilihanmu;
        do {
            System.out.println("\nWelcome to the club, " + nama + "! Becanda, ini perpustakaan :D");
            System.out.println("Pilih menu berikut :");
            System.out.println("(1) Tampilkan buku");
            System.out.println("(2) Tampilkan buku sesuai kategori");
            System.out.println("(3) Cari buku");
            System.out.println("(4) Keluar");
            System.out.print("Pilihanmu : ");
            pilihanmu = scanner.nextInt();
            switch (pilihanmu) {
                case 1:
                    Perpustakaan.displayListBuku();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Masukkan kategori buku: ");
                    String kategoriBuku = scanner.nextLine();
                    Perpustakaan.displayKategori(kategoriBuku);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judulBuku = scanner.nextLine();
                    Perpustakaan.bukuDicari(judulBuku);
                    break;
                case 4:
                    System.out.println("Tengs.");
                    break;
                default:
                    System.out.println("Mohon, maaf pilihan kamu valid. COBA MASUKIN MENU YANG BENER ELAH");
            }
        } while (pilihanmu != 4);
    }
}