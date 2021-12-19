import java.util.Scanner;

public class assnNo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Triangle ");
        triangle.setData();

        System.out.println("Rectangle ");
        rectangle.setData();

        do {
            System.out.println("1. Calculate the area of the triangle");
            System.out.println("2. Calculate the area of the rectangle");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Area of Triangle is " + triangle.calculateArea());
                    break;
                case 2:
                    System.out.println("Area of Rectangle is " + rectangle.calculateArea());
                    break;
            }
        } while (option <= 2);

        input.close();
    }
}

abstract class Shape {
    Scanner input = new Scanner(System.in);
    double base;
    double height;
    double area;

    abstract public double calculateArea();

    public void setData() {

        System.out.print("Enter the Dimension \n");

        System.out.print("Base : ");
        base = input.nextDouble();

        System.out.print("Height  : ");
        height = input.nextDouble();

    }

    public void information() {
        System.out.println("Area : " + area);

    }
}

class Triangle extends Shape {
    public double calculateArea() {
        area = (1.0 / 2) * base * height;
        return area;
    }
}

class Rectangle extends Shape {
    public double calculateArea() {
        area = (base * height);
        return area;
    }
}
