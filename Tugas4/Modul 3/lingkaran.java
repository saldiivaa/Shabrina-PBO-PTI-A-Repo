public class lingkaran{ 
    int alas, tinggi; 
   public lingkaran(int alas){ 
          this.alas = alas; 
     } 
   public lingkaran(int alas, int tinggi){ 
        this.alas = alas; 
        this.tinggi = tinggi; 
     } 
     public void setAlas(int alas){ 
          this.alas = alas; 
     } 
     public void setTinggi(int tinggi){ 
        this.tinggi = tinggi; 
     } 
     public int getAlas(){ 
        return alas; 
     } 
     public int getTinggi(){ 
        return tinggi; 
     } 
     public double hitungLuas(){ 
        double hasil = (double)(getTinggi()*getAlas())/2; 
        return hasil; 
     } 

   //   public konstruktorBaru (int tinggi){

     //}
   public lingkaran(String alas, String tinggi) { 
      this.alas = ubahAlas(alas); 
      this.tinggi = ubahTinggi(tinggi); 
   } 
  
   private int ubahAlas(String alas) { 
      return Integer.parseInt(alas); 
   } 
  
  private int ubahTinggi(String tinggi) { 
      return Integer.parseInt(tinggi); 
  } 
     
   public void displayMessage(){ 
          System.out.println("Hitung Luas : "+hitungLuas()); 
     } 
   } 		
    


            