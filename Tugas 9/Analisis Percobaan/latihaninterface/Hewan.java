package latihaninterface; 
public class Hewan implements MakhlukHidup {  
    @Override 
    public void makan() { 
        System.out.println("Makan pakai tangan dan mulut"); 
    } 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai 4 kaki"); 
    } 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya nggak jelas"); 
    }
    
    @Override
    public void berkembangbiak(){
        System.out.println("Bisa beranak dan bertelur");
    }
    
    public void tampilkanNama (){} 
     
    
    public void tampilkanUmur () {} 
} 
