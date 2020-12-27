import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrNot = true;
        int max = 0;
        while (continueOrNot == true) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number == 0) {
                continueOrNot = false;
            }
        }
        System.out.println(max);
    }
}