import java.util.Scanner;

public class PackageDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length (in cm): ");
        double length = sc.nextDouble();

        System.out.print("Enter width (in cm): ");
        double width = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        if (length <= 0 || width <= 0 || height <= 0) {
            System.out.println("Error: All dimensions must be positive numbers.");
        } else {
            double volume = length * width * height;
            System.out.println("Package Volume: " + volume + " cubic cm");
        }
        sc.close();
    }
}
