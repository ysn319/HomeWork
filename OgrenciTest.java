package Homework;
public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci bir = new Ogrenci("Adnan", "Eczazcılık", 0.0, "628",  1973);
        Ogrenci iki = new Ogrenci("Gökhan", "Bilgisayar Müh", 4.0, "628", 1985);
        Ogrenci uc = new Ogrenci("Ayşe", "Makina Müh", 0.0, "628", 1985);
        Ogrenci dort = new Ogrenci("Elif", "Elektrik-Elektronik Müh", 1.98, "628", 2020);
        Ogrenci is= new Ogrenci();
        bir.check(bir.getGano());
        iki.check(iki.getGano());
        uc.check(uc.getGano());
        dort.check(dort.getGano());
        System.out.println("OGR-1 " + is.getAd() + " " + is.getBolum() + " " + bir.ogrenciNoOlustur() + " " +bir.getGano());
        System.out.println("OGR-2 " + iki.getAd() + " "+iki.getBolum() + " " + iki.ogrenciNoOlustur() + " " + iki.getGano());
        System.out.println("OGR-3 " + uc.getAd() + " " +uc.getBolum()+ " " + uc.ogrenciNoOlustur() + " " + uc.getGano());
        System.out.println("OGR-4 " + dort.getAd() + " " +dort.getBolum()+ " " + dort.ogrenciNoOlustur() + " " + dort.getGano());
        System.out.println("3.öğrencinin ödeyeceği harç: "+uc.harcHesapla(32,1.5));
        System.out.println("4.öğrencinin ödeyeceği harç: "+ dort.harcHesapla(64,1.5));
    }
}