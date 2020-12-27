import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean bool1 = (num1 + num2) == 20;
        boolean bool2 = (num1 + num3) == 20;
        boolean bool3 = (num2 + num3) == 20;
        boolean answer = bool1 || bool2 || bool3;
        System.out.println(answer);
    }
}