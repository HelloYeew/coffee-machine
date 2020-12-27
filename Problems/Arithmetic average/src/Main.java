import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = scanner.nextInt();
        scanner.nextLine();
        int maxNumber = scanner.nextInt();
        int sum = 0;
        int time = 0;
        for (int i = minNumber; i <= maxNumber; i += 3) {
            if (i % 3 == 0) {
                sum += i;
                time += 1;
            }
        }
        float answer = sum / time;
        System.out.println(answer);
    }
}