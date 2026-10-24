import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zrz = 0;
        int plus = 0;
        int minus = 0;
        for( int  i = 0;i < n; i++ ) {
            int x = in.nextInt();
            if (x == 0) {
                zrz++;
            }else if (x > 0) {
                plus++;
            }else {
                minus++;
            }
        }
        System.out.println(zrz +" "+ plus+" "+ minus);
    }
}