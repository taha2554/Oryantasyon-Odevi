package orneksoru7;
import java.util.Scanner;
public class OrnekSoru7 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Lütfen Makine Sayısını Giriniz: ");
        int MakineSayisi= klavye.nextInt();
        System.out.print("Lütfen Hangi Ayda Olduğunuzu Giriniz: ");
        int ay=klavye.nextInt();
        int sure,aralık;
        if(ay>2&&ay<9){
        sure=480;
        aralık=45;}
        else{
          sure=540;
          aralık=30;}
        for(int i = MakineSayisi; i>0; i--){
        System.out.print(sure + ",");
        sure=sure-aralık;}
    }
}
