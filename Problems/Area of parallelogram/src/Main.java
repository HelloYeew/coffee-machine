import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        countAreaOfParallelogram(b,a);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}