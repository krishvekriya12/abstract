import java.util.Scanner;

public class abstract1 {

    public static void main(String[] args) {

        Rectangle v = new Rectangle();
        v.read();
        v.show();

        Circle c = new Circle();
        c.read();
        c.show();
    }

}

abstract class Shape {

    final float pi = 3.14f;
    int l, w, area;
    float r, Total;
    Scanner scanner = new Scanner(System.in);

    abstract void read();

    abstract void show();

}

class Rectangle extends Shape {

    void read() {
        System.out.print("Enter Lenght = ");
        l = scanner.nextInt();
        System.out.print("Enter Width = ");
        w = scanner.nextInt();
        area = l * w;

    }

    void show() {

        System.out.println("Rectangle Area = " + area);

    }

}

class Circle extends Shape {

    void read() {

        System.out.print("Enter Circle Radius = ");
        r = scanner.nextFloat();
        Total = pi * r * r;

    }

    void show() {

        System.out.println("Circle of Area = " + Total);

    }

}