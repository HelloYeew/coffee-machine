import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<String> caution = new ArrayList<String>();
        int CarHeight = scanner.nextInt();
        int time = scanner.nextInt();
        for (int i=0; i < time; i++) {
            int n = scanner.nextInt();
            number.add(n);
        }
        for (int i=0; i < number.size() ; i++) {
            if (number.get(i) < CarHeight || number.get(i) == CarHeight) {
                caution.add("Will crash on bridge " + (i+1));
            }
        }
        if (caution.size() == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println(caution.get(0));
        }
    }
}