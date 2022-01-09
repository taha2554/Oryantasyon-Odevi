package ornek3;
import java.util.Scanner;
public class Ornek3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Öğrenci Numarasını Giriniz: ");
        String Ogrenci_No=klavye.nextLine();
        System.out.println("Vize Notunu Giriniz: ");
        double vize_notu=klavye.nextDouble();
        System.out.println("Final Notunu Giriniz: ");
        double final_notu=klavye.nextDouble();
        double ortalama;
        ortalama=vize_notu*0.4+final_notu*0.6;
        if (ortalama>=50){
            System.out.println("Öğrenci Numarası: " + Ogrenci_No + " " + "Başarılı" + " " + "Ortalama: " + ortalama);}
        else {
            System.out.println("Öğrenci Numarası: " + Ogrenci_No + " " + "Başarısız" + " " + "Ortalama: " + ortalama);}
    }
}
