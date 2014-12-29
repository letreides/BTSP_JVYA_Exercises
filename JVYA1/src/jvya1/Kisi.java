package jvya1;

public class Kisi {
    private long kn;              
    private String ad, soyad;   
    private int yas; 
    public Kisi(long kn, String ad, String soyad, int yas) { 
        this.kn=kn; 
        this.ad=ad; 
        this.soyad=soyad; 
        this.yas=yas; 
    } 
            public long getKn() { 
             return kn; 
            }
            public String getSoyad(){
             return soyad;
            }
            public String getAd(){
             return ad;
            }
            public String getTamIsim(){
             return soyad+", "+ad;
            }
            public int getYas(){
             return yas;
            }
        
            public void setAd(String s){
             if(s.length()==0) throw new RuntimeException("Hata:Ad Bos");
             ad=s;       
            }
            
            public void setSoyad(String s){
             if(s.length()==0) throw new RuntimeException("Hata:Soyad Bos");
             soyad=s;
            }
            
            public void setYas(int n){
             if(n<0) throw new RuntimeException("Yas 0dan kucuk olamaz");
             yas=n;
            }
}
