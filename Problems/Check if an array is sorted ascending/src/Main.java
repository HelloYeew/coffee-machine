import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            int n = scanner.nextInt();
            numbers[i] = n;
        }
        int[] sortedNumber = numbers.clone();
        Arrays.sort(sortedNumber);
        if (Arrays.equals(numbers,sortedNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}