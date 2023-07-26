public class tekrar {
    public static void main(String[] args) {
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
        System.out.println("---------");
        int number = 1;
        boolean isPrime = true;
        if (number < 1) {
            isPrime = false;
        }
        if (number == 1) {
            System.out.println("geçersiz");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println("evet");
        } else {
            System.out.println("hayır");
        }
    }
}