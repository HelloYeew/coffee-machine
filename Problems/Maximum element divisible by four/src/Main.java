import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int max = 0;
        scanner.nextLine();
        for (int i = 0; i < line; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}