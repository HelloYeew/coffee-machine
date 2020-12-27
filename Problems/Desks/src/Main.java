import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int num3 = scanner.nextInt();
        num1 = (num1 % 2) + num1 / 2;
        num2 = (num2 % 2) + num2 / 2;
        num3 = (num3 % 2) + num3 / 2;
        int ans = num1+num2+num3;
        System.out.print(ans);
    }
}