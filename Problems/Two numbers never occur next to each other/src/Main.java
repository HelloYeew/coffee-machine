import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] list = new int[length];
        for (int i=0; i<length; i++) {
            int number = scanner.nextInt();
            list[i] = number;
        }
        scanner.nextLine();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i=0; i<length-1; i++) {
            if (list[i]==n && list[i-1]==m) {
                System.out.println("false");
                break;
            }
        }
    }
}