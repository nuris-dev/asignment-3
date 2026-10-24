import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zrz = 0;
        for (int i = 0;i < n;i++) {
            int x = in.nextInt();

            if (x == 0) {
                zrz++;
            }
        }
        System.out.println(zrz);
    }
}
