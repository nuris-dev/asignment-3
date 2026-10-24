import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int count = 0;

            int i = 1;

            while (i * i < x) {
                if (x % i == 0) {
                    count += 2;
                }
                i++;
            }

            if (i * i == x) {
                count++;
            }

            System.out.println(count);
        }
    }
}

