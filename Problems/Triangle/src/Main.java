import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();
        int c = scanner.nextInt();
        if (a+b > c) {
            if (a+c > b) {
                if (b+c > a) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}