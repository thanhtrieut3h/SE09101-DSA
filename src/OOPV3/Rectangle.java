package OOPV3;

public class Rectangle extends Shapes{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double primeter() {
        return (width + height) * 2;
    }
}
