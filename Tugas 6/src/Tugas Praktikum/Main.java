public class Main {
    public static void main(String[] args) {
        Manusia pengangguran = new Manusia("Alah Gatau", "111", true, true);
        System.out.println(pengangguran);

        MahasiswaFILKOM Diva = new MahasiswaFILKOM("235150600111002", 4.0, "Shabrina Salsabila Diva", "111", false, false);
        System.out.println("\n" + Diva);

        Pekerja kangCripto = new Pekerja(10000, 2024, 1, 1, 0, "Burhan", "111", true, true);
        System.out.println("\n" + kangCripto);

        Manager bapak = new Manager("HRD", 100000000, 2017, 1, 1, 3, "Rahasia", "111", true, true);
        System.out.println("\n" + bapak);
    }
}
