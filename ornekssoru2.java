package com.example.ornekssoru2;
import java.util.Scanner;
public class ornekssoru2 {
    public static void main(String[] args){
        Scanner klavye=new Scanner(System.in);
        System.out.print("Sicil No Giriniz:");
        String Sicil_No=klavye.nextLine();
        System.out.print("Çalışma Saati Giriniz:");
        int Calisma_Saati=klavye.nextInt();
        System.out.print("Saatlik Ücreti Girniz:");
        int Saatlik_Ucret= klavye.nextInt();

        double Maas,Prim,Vergi,Net_Maas;
        Maas=Calisma_Saati*Saatlik_Ucret;
        Prim=Maas*0.14;
        Vergi=Maas*0.15;
        Net_Maas = Maas - (Prim + Vergi);

        System.out.println("Sicil No: "+Sicil_No);
        System.out.println("Prim: "+Prim);
        System.out.println("Vergi: "+Vergi);
        System.out.println("Net Maaş: "+Net_Maas);
    }
}