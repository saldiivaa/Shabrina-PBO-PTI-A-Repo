public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int mtk;
    private int inggris;
    private int ipa;
    private boolean remedial;

    private static int objekSiswa = 0;
    
    public Student(){
    name = "";
    address = "";
    age = 0;

    objekSiswa++;

    }

    public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;

    objekSiswa++;
    }

    public void setName(String n){
       name = n;
    }

    public void setAddress(String a){
    address = a;
    }

    public void setAge(int ag){
    age = ag;
    }

    public void setMath(int math){
    mathGrade = math;
    }

    public void setEnglish(int english){
    englishGrade = english;
    }

    public void setScience(int science){
    scienceGrade = science;
    }

    public void setNama(String nama){
       System.out.println("mahasiswa bernama " + nama);
       objekSiswa++;
    }

    public void SetNilai(int math, int english, int science){
      //  this.mtk = math;
      //  this.inggris = english;
      //  this.ipa = science;
       System.out.println("memiliki nilai matematika " + math);
       System.out.println("memiliki nilai inggris " + english);
       System.out.println("memiliki nilai ipa " + science);

    }

    private double getAverage(){
       double result = 0;
       result = (mathGrade+scienceGrade+englishGrade)/3;
       return result;
    }

    public boolean statusAkhir() {
       average = getAverage();
       remedial = (average <= 61);
       return !remedial;
   }

   public static void jumlahObjek() {
      System.out.println("Jumlah objek siswa adalah " + objekSiswa);
   }

    public void displayMessage(){
       System.out.println("Siswa dengan nama "+name);
       System.out.println("beramalat di "+address);
       System.out.println("berumur "+age);
       System.out.println("mempunyai nilai rata rata"+getAverage());
       System.out.println("siswa " +(statusAkhir() ? "lolos" :"remidi" + " ujian"));
    }

    public void displayMessage2(){
       System.out.println("memiliki nilai mtk " + mtk + ", memiliki nilai inggris " + inggris + ", dan nilai ipa " + ipa);
    }
}