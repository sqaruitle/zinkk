public class aralik29uyg1 {
    public static void main(String[] args) {
        String ad = "yaren";
        System.out.println(terstenYazilis(ad));

    }

    static String terstenYazilis(String metin) {
        if (metin.isEmpty())
            return metin;
        else{
            char ch = metin.charAt(0);
            return terstenYazilis (metin.substring(1))+ch;
        }

    }
}

