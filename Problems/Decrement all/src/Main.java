import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        num1 = num1-1;
        num2 = num2-1;
        num3 = num3-1;
        num4 = num4-1;
        System.out.print(num1);
        System.out.print(" ");
        System.out.print(num2);
        System.out.print(" ");
        System.out.print(num3);
        System.out.print(" ");
        System.out.print(num4);
    }
}