import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max1 = Math.max(a,b);
        int realMax = Math.max(max1,c);
        if (realMax == a) {
            return 1;
        } else if (realMax == b) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}