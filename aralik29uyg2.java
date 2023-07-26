import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class aralik29uyg2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        System.out.println("dizinin ilk elemanını girin: ");
        dizi.add(giris.nextInt());

        while (true) {
            System.out.println("başka bir sayı eklemek iste misin? e/h");
            String x = giris.next();
            char cevap = x.charAt(0);
            cevap = Character.toLowerCase(cevap);
            if (cevap == 'h')
                break;
            else if (cevap == 'e') {
                System.out.println("eklenecek sayıyı girin: ");
                dizi.add(giris.nextInt());
            } else
                System.out.println("hatalı giriş yaptınız ");
        }
        int ortancaIndex = dizi.size() /2;
        System.out.println("dizinin elemanları: " + dizi);
        Collections.sort(dizi);
        System.out.println("dizinin normal hali: " + dizi);
        System.out.println("dizinin ortanca elemanı: " + dizi.get(ortancaIndex));
    }
}