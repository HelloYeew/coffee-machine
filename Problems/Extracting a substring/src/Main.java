import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String newWord = word.substring(start,end+1);
        System.out.println(newWord);
    }
}