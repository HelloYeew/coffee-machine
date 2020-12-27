import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = 0;
        scanner.nextLine();
        for (int i = 0; i < input; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number % 6 == 0) {
                result += number;
            }
        }
        System.out.println(result);
    }
}