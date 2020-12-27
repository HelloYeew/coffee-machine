import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = scanner.nextInt();
        scanner.nextLine();
        int[] newArray = new int[big];
        for (int i=0; i<big; i++) {
            int n = scanner.nextInt();
            newArray[i] = n;
        }
        scanner.nextLine();
        int check = scanner.nextInt();
        if (big == check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}