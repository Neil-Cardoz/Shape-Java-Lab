// Name : Neil Cardoz
// PRN : 2307012079
// Batch : B1
// Branch : AIML 23-27

//Main.java


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            while (true) { // Infinite loop to keep menu running
                System.out.println("**********************************************************");
                System.out.println("            SHAPE FEATURE CALCULATOR");
                System.out.println("**********************************************************");
                System.out.println("1. Triangle");
                System.out.println("2. Rectangle");
                System.out.println("3. Cube");
                System.out.println("4. Square");
                System.out.println("5. Circle");
                System.out.println("6. Sphere");
                System.out.println("7. Cylinder");
                System.out.println("8. Equilateral Pyramid");
                System.out.println("9. Exit");
                System.out.println("**********************************************************");
                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(scan.nextLine());
                System.out.println("-------------------------------------------");

                switch (choice) {
                    case 1: // Triangle
                        System.out.println("Enter base of Triangle: ");
                        double base = Double.parseDouble(scan.nextLine());

                        System.out.println("Enter height of Triangle: ");
                        double height = Double.parseDouble(scan.nextLine());

                        Triangle triangle = new Triangle(base, height);
                        System.out.println("Area of Triangle: " + triangle.calculateArea());
                        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
                        break;

                }

                    case 2: // Rectangle
                    System.out.println("Enter length of Rectangle: ");
                    double length = Double.parseDouble(scan.nextLine());

                    System.out.println("Enter breadth of Rectangle: ");
                    double breadth = Double.parseDouble(scan.nextLine());

                    Rectangle rectangle = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
                    break;


                    case 3: // Cube
                    System.out.println("Enter side of Cube: ");
                    double side = Double.parseDouble(scan.nextLine());

                    Cube cube = new Cube(side);
                    System.out.println("Total Surface Area of Cube: " + cube.calculateArea());
                    System.out.println("Perimeter of Cube: " + cube.calculatePerimeter());
                    System.out.println("Volume of Cube: " + cube.calculateVolume());
                    break;


    }
}
