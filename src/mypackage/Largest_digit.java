package mypackage;

public class Largest_digit {
    public static void main(String[] args) {

        int n = 1204;
        String str = Integer.toString(n);

        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            
            if (digit > max) {
                max = digit;
            }
        }

        System.out.println("Largest Digit = " + max);
    }
}