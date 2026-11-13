package OOPV3;

public class Circle extends Shapes {
    private double radius;
    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double primeter() {
        return 2 * Math.PI * radius;
    }
}
