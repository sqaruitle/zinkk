public class aralik29sinav {
    public static void main(String[] args) {
        String metin1 = "cuMHURiyet";
        String metin = metin1.toLowerCase();
        String yeni = Cevir(metin);
        System.out.println(yeni);
    }

    public static String Cevir(String metin) {
        char[] ch = metin.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
       return new String(ch);
    }
}
