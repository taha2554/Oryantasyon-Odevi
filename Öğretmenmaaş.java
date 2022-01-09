package öğretmenmaaş;
import java.util.Scanner;
public class Öğretmenmaaş {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int TM=0;
        System.out.println("Maas Giriniz");
        int Maas=klavye.nextInt();
        for (int i=1; i<36; i++){
        TM=TM+Maas;
        System.out.println(i + " kişinin maaşı toplamı= " +TM);
        }
    } 
}
