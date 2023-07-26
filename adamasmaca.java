import java.util.Scanner;

public class adamasmaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelime1 = "senden bana kalan";
        String kelime = kelime1.toLowerCase();
        int hak = 7;
        int kelimeHak = 3;
        char[] tahmin = new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ' ') {
                tahmin[i] = ' ';
                i++;
            }
            tahmin[i] = '_';
        }
        while (hak > 0) {
            System.out.println("\nbir harf girin: ");
            char tahminHarf1 = scanner.next().charAt(0);
            char tahminHarf = Character.toLowerCase(tahminHarf1);
            boolean bl = false;
            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == tahminHarf) {
                    tahmin[i] = tahminHarf;
                    bl = true;
                }
            }
            if (!bl) {
                hak--;
            }
                System.out.println(hak + " hakkınız kaldı!!");
                if (hak == 6) {
                    System.out.println("_____");
                }
                if (hak == 5) {
                    System.out.println("_____");
                    System.out.println("|   |");
                }
                if (hak == 4) {
                    System.out.println("_____");
                    System.out.println("|   |");
                    System.out.println("|   0");
                }
                if (hak == 3) {
                    System.out.println("_____");
                    System.out.println("|   |");
                    System.out.println("|   0");
                    System.out.println("|  -|-  ");
                }
                if (hak == 2) {
                    System.out.println("_____");
                    System.out.println("|   |");
                    System.out.println("|   0");
                    System.out.println("|  -|-  ");
                    System.out.println("|  / \\  ");
                }
                if (hak == 1) {
                    System.out.println("_____");
                    System.out.println("|   |");
                    System.out.println("|   0");
                    System.out.println("|  -|-  ");
                    System.out.println("|  / \\  ");
                    System.out.println("|");
                }
                for (int i = 0; i < kelime.length(); i++) {
                    System.out.print(tahmin[i] + " ");
                }
                String sontahmin = "";
                sontahmin = sontahmin.copyValueOf(tahmin, 0, kelime.length());
                //System.out.println(sontahmin);
                if (sontahmin.equals(kelime)) {
                    System.out.println("\noyunu kazandınız!");
                    break;
                }
                if (hak == 0) {
                    System.out.println("\n_____");
                    System.out.println("|   |");
                    System.out.println("|   0");
                    System.out.println("|  -|-  ");
                    System.out.println("|  / \\  ");
                    System.out.println("|");
                    System.out.println("|_______");
                    System.out.println("\noyunu kaybettiniz. doğru cevap: " + kelime);
                }
            }
        }
    }


