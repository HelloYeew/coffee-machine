import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = scanner.nextInt();
        scanner.nextLine();
        int[] newArray = new int[big];
        int sum = 0;
        for (int i=0; i<big; i++) {
            int n = scanner.nextInt();
            newArray[i] = n;
            sum = sum+n;
        }
        System.out.println(sum);
    }
}