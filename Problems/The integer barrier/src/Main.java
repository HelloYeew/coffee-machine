import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            sum += number;
            if (number == 0 || sum >= 1000) {
                if (sum >= 1000) {
                    System.out.println(sum - 1000);
                    break;
                } else {
                    System.out.println(sum);
                    break;
                }
            }
        }

    }
}