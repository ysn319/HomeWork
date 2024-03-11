package Homework;

public class Ogrenci {
        private String ad;
        private String bolum;
        private double gano;
        public int girisYili;
        public String ogrNo;
        public String bolumKodu="123";
        public String girisSirasi="001";

        public Ogrenci(String ad,String bolum){
                this.ad=ad;
                this.bolum=ad;

        }

        public Ogrenci(Ogrenci e){
            this.ad = e.ad;
            this.bolum = e.bolum;
            this.gano = e.gano;
            this.girisYili = e.girisYili;
            this.ogrNo = e.ogrNo;
            this.bolumKodu=e.bolumKodu;
            this.girisSirasi= e.girisSirasi;
        }

        public Ogrenci(String ad,String bolum,double gano,String ogrNo,int girisYili){
                this.ad=ad;
                this.bolum=bolum;
                this.gano=gano;
                this.girisYili=girisYili;
                this.ogrNo=ogrNo;

        }
       public Ogrenci(){

        }

        public String getAd(){
                return this.ad;
        }

        public String getBolum(){

                return this.bolum;
        }

        public double getGano(){
                return this.gano;
        }
        public void setGano(double gano){
                this.gano=gano;
        }

        public void check(double gano){
                if (gano>4){
                        throw  new IllegalArgumentException("Hatali girdiniz");
                }
        }

        public double harcHesapla(int dersayisi){
                return dersayisi;
        }

        public double harcHesapla(int price,double uzatYil){
                return uzatYil*price*harcHesapla(10);

        }

        public String ogrenciNoOlustur(){
                this.ogrNo=this.girisYili+this.bolumKodu+this.girisSirasi;
                if (this.ogrNo.length()==10){
                        return this.ogrNo;}
                return "0";
        }
}