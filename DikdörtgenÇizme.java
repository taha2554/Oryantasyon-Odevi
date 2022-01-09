package dikdörtgençizme;
import java.util.Scanner;
public class DikdörtgenÇizme {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen en değeri giriniz:");
        int en=klavye.nextInt();
        System.out.println("Lütfen boy değeri giriniz:");
        int boy=klavye.nextInt();
        for (int i=0; i<boy; i++){
            for (int j=0; j<en; j++){
                System.out.print("*");
            }
        System.out.println(" ");
        }
    }
}
