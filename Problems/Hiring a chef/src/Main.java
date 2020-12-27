//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String stage = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        String cuisine = scanner.nextLine();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisine + " dishes.");
    }
}