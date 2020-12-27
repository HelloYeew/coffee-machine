import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summation = 0;
        boolean continueornot = true;
        while (continueornot == true) {
            int number = scanner.nextInt();
            summation += number;
            if (number == 0) {
                continueornot = false;
            }
        }
        System.out.println(summation);
    }
}