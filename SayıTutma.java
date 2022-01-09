package sayıtutma;
import java.util.Scanner;
public class SayıTutma {
    public static void main(String[] args) {
        int sayi, kere=0, tahmin;
        sayi=(int)(Math.random()*10)+1;
        do{
            Scanner oku=new Scanner(System.in);
            kere++;
            System.out.print("Tahmininiz:");
            tahmin=oku.nextInt();
            if (tahmin>sayi){
                System.out.println("Küçük Yaz");
            }
            if (tahmin<sayi){
                System.out.println("Büyük Yaz");
            }
        }
        while (tahmin!=sayi);
        System.out.println(kere+ " adımda buldunuz");
    }
    
}
