import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean answer = name.endsWith("burg");
        System.out.println(answer);
    }
}