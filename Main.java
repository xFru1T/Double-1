import java.util.Scanner;
class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print 1 side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Print 2 side: ");
        double side2 = scanner.nextDouble();
        double side3 = Math.pow(side1, 2) + Math.pow(side2, 2);
        System.out.println("Hypotenuse: " + Math.sqrt(side3));
        }
    }

