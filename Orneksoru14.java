package orneksoru14;
import java.util.Scanner; 
class Orneksoru14 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Başlangıç Değerini Giriniz: ");
        int baslangic = klavye.nextInt();
        System.out.println("Adet Sayısını Giriniz: ");
        int adet = klavye.nextInt();
        System.out.println("Artış Miktarını Giriniz: ");
        int artıs = klavye.nextInt();
        for(int i=1; i<=adet; i++){
            System.out.print(baslangic + ", ");
            baslangic = baslangic + artıs; 
        }
    }
}
