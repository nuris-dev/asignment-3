import java.util.Scanner;

public class D {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while(x > 0) {
            int digit = x % 10;

            if (digit == b){
            count++;

            }

        x = x / 10;

        }
        System.out.println(count);
    }
}
