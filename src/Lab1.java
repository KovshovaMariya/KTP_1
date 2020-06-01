import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first point:");
        //задаём координаты для каждой точки, считывая их с консоли
        Point3d a = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input second point:");
        Point3d b = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input third point:");
        Point3d c = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        if (a.equals(b) || b.equals(c) || c.equals(a)){ //проверяем, есть ли равные точки
            System.out.println("Points is equals");
        }
        else {
            System.out.print("S = ");
            System.out.println(String.format("%.2g%n", computeArea(a, b, c))); //выводим значение площади треугольника
        }
    }
    public static double  computeArea(Point3d a, Point3d b, Point3d c){ //функция для вычисления площади треугольника
        double A, B, C, p;
        A = a.distanceTo(b);  //задаём стороны треугольника
        B = b.distanceTo(c);
        C = c.distanceTo(a);
        p = (A + B + C)/2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
