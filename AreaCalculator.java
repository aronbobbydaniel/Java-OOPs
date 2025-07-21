

class Poly {
    public void area(float radius) {
        float area = 3.14f * radius * radius;
        System.out.println("Circle Area = " + area);
    }

    public void area(double length, double width) {
        double area = length * width;
        System.out.println("Rectangle Area = " + area);
    }

    public void area(int height, int base) {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area = " + area);
    }

    public void area(int side) {
        int area = side * side;
        System.out.println("Square Area = " + area);
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Poly calculator = new Poly();

        calculator.area(5.5f);
        calculator.area(10.0, 4.0);
        calculator.area(6, 8);
        calculator.area(7);
    }
}
