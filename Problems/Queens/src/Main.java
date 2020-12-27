import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2) {
            System.out.println("YES");
        } else if (y1 == y2){
            System.out.println("YES");
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//    Divide into 3 cases:
//        - x1 == x2
//        - y1 == y2
//        - abs(x2 - x1) == abs (y2 - y1)
//        In the three cases above the queens will intercept.