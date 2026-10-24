
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int result = 0;

        while (x > 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            x = x / 10;
        }

        System.out.println(result);
    }
}
