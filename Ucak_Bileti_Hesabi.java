import java.util.Scanner;

public class Ucak_Bileti_Hesabi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int mesafe, yas, tip;


        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe=inp.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas=inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek yon, 2=> Gidis donus");
        tip=inp.nextInt();

        double tutar, yasind, tipind;


        tutar = 0.1 * mesafe;
        System.out.println("Normal tutar: " + tutar);

        if(mesafe > 0 && yas >0 && (tip ==1 || tip ==2)){
            if (yas < 12){
                yasind = tutar * 0.5;
            } else if (yas >= 12 && yas <=24){
                yasind = tutar * 0.1;
            } else if (yas >= 65) {
                yasind = tutar * 0.30;

            } else {
                yasind = 0;
            }
                tutar -= yasind;
            if (tip == 2){
                tipind = tutar * 0.2;
                tutar = (tutar - tipind) * 2;
            }
            System.out.println("Bilet tutari: " + tutar);
        }

        else {
            System.out.println("Girdiginiz bilgiler hatali. Tekrar deneyiniz!!!");
        }





    }
}
