import java.util.Scanner;
import java.sql.DriverAction;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah siswa : ");
        int siswa = scanner.nextInt();

        Student[] siswa1 = new Student[siswa];
        for (int i = 0; i < siswa1.length; i++) {
            siswa1[i] = new Student();
        }

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

         //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        //siswa  dengan  nama  anna  dirubah  informasi  alamat  dan umurnya melalui constructor 
        System.out.println("==================="); 
        anna = new Student("anna", "Batu", 18); 
        anna.displayMessage(); 
 	 
        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method 
        System.out.println("==================="); 
        chris.setAddress("Surabaya"); 
        chris.setAge(22); 
        chris.displayMessage(); 	 
 	 
        System.out.println("===================");
        Student diva = new Student();
        diva.setNama("Diva");
        diva.SetNilai(100, 100, 100);
        // diva.displayMessage();
        diva.displayMessage2();
        

        Student.jumlahObjek(); 
    }   
}