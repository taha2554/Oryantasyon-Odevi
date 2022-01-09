package kalori;
import java.util.Scanner;
public class Kalori {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Cinsiyet Giriniz:");
        String cinsiyet=klavye.nextLine();
        System.out.println("Adım Sayısı Giriniz:");
        int adimSayisi=klavye.nextInt();
        int kalori;
        if (cinsiyet.equals("Kadın")){
            kalori=(adimSayisi*30)/500;}
        else {
            kalori=(adimSayisi*45)/500;}
        System.out.println("Yakılan kalori miktarı:" + kalori);
    }
}
