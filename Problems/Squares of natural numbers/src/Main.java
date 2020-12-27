import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int multiply = 1;
        int afterMultiply = 0;
        while (afterMultiply <= num) {
            if (multiply*multiply > num) {
                break;
            }
            afterMultiply = multiply*multiply;
            System.out.println(afterMultiply);
            multiply += 1;
        }
    }
}