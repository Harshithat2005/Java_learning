/*package mypackage;

public class Count_digits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Count = " + count);
    }
}
*/
//OR

package mypackage;

public class Count_digits {
    public static void main(String[] args) {
        int n = 7435;

        String str = String.valueOf(n);
        int count = str.length();

        System.out.println("Count = " + count);
    }
}