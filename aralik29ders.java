import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class aralik29ders {
    public static void main(String[] args) {
        ArrayList<Integer> dersler = new ArrayList<Integer>();
        //for (int i = 0; i < 10; i++) {
          //  dersler.add(int) (Math.random(*100));

     //   }
        System.out.println("elemanlar: "+dersler);
        double toplam= 0;
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println("dizinin ort: " + String.format("%.2f", dersler.get(i)));
            toplam+= dersler.get(i);
        }
        double ort =toplam/dersler.size();
        //.out.println("dizinin ort: " + String.format("%.2f", dersler.get()));

        }
        //dersler.add("kimya");
        //dersler.add("matematik");
        //dersler.add("fizik");
        //System.out.println(dersler);
        //System.out.println(dersler.get(2));
        //dersler.set(0,"Algoritma");
        // System.out.println(dersler);
        //dersler.remove(0);
        // dersler.add(1, "Algoritma");
        //System.out.println(dersler);
        //for (int i = 0; i < dersler.size(); i++) {
        //   System.out.println(dersler.get(i));
        //}
        //for(String i : dersler){
        //  System.out.println((i+" "));
        //}
        //dersler.clear();
        //System.out.println(dersler);
        //int[] a= {9,8,7,6};
        //Arrays.sort(a);
        //  System.out.println(Arrays.toString(a));
        //}
        //Collections.sort(dersler);
        //Collections.reverse(dersler);
        //System.out.println(dersler);
        //System.out.println(dersler.indexOf(3));
        //System.out.println(dersler.contains(18));
    }


