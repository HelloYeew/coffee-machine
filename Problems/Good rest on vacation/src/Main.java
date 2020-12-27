import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer days = scanner.nextInt();
        Integer food = scanner.nextInt();
        Integer flight = scanner.nextInt();
        Integer hotel = scanner.nextInt();
        Integer cost = (food*days)+(flight*2)+(hotel*(days-1));
        System.out.println(cost);
    }
}