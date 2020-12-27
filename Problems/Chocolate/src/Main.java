import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();
        int k = scanner.nextInt();
        if (k == 1 && n != 1 && m != 1) {
            System.out.println("NO");
        } else if (k == 1 && (n == 1 || m == 1)) {
            System.out.println("YES");
        } else if (n % k == 0 || m % k == 0 || (n * m) % k == 0 || (n + m) % k == 0) {
            System.out.println("YES");
        } else if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//
//        (k % n == 0 || k % m == 0)
//        (n % k == 0 || m % k == 0 || (n * m) % k == 0 || (n + m) % k == 0)