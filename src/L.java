
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int result = 0;
        int power = 1;

        while (x > 0) {
            int digit = x % 10;
            result = result + digit * power;
            power = power * 2;
            x = x / 10;
        }

        System.out.println(result);
    }
}

