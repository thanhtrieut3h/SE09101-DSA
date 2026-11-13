package OOPV3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("********** Hinh Tron *********");
        System.out.println("Nhap ban kinh hinh tron : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Shapes circle = new Circle(radius);
        System.out.println("Dien Tich : " + circle.area());
        System.out.println("Chu Vi : " + circle.primeter());

        System.out.println("********** Hinh Chu Nhat *********");
        System.out.println("Nhap chieu rong : ");
        double w = scanner.nextDouble();
        System.out.println("Nhap chieu dai : ");
        double h = scanner.nextDouble();
        Shapes rectangle = new Rectangle(w, h);
        System.out.println("Dien Tich : " + rectangle.area());
        System.out.println("Chu Vi : " + rectangle.primeter());
    }
}
