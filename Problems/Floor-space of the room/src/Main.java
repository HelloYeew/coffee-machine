import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "triangle":
                double s1 = scanner.nextDouble();
                scanner.nextLine();
                double s2 = scanner.nextDouble();
                scanner.nextLine();
                double s3 = scanner.nextDouble();
                double area = (s1+s2+s3)/2.0d;
                double result = Math.sqrt(area* (area - s1) * (area - s2) * (area - s3));
                System.out.println(result);
                break;
            case "rectangle":
                double a = scanner.nextDouble();
                scanner.nextLine();
                double b = scanner.nextDouble();
                double areaRec = a*b;
                System.out.println(areaRec);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double areaCircle = 3.14*r*r;
                System.out.println(areaCircle);
                break;
        }
    }
}