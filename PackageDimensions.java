import java.util.Scanner;

public class PackageDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = length * width * height;
        System.out.println("Package Volume: " + volume + " cubic units");
    }
}
