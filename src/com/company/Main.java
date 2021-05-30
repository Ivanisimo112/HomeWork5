package com.company;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(6, 0, 0);
        Point point3 = new Point(0, 6, 0);
        Point point4 = new Point(0, 0, 6);

        System.out.println("1)");
        Parallelepiped parallelepiped1 = new Parallelepiped(point1, point2, point3, point4);
        System.out.println(parallelepiped1.baseArea());
        System.out.println(parallelepiped1.parallelepipedHeight());
        System.out.println(parallelepiped1.capacity());
        System.out.println(parallelepiped1.basePerimeter());
        System.out.println(parallelepiped1.surfaceArea());

        System.out.println("2)");
        Angle angle1 = new Angle(30);
        Parallelepiped parallelepiped2 = new Parallelepiped(point1, point2, point3,6,angle1 );
        System.out.println(parallelepiped2.baseArea());
        System.out.println(parallelepiped2.parallelepipedHeight());
        System.out.println(parallelepiped2.capacity());
        System.out.println(parallelepiped2.basePerimeter());
        System.out.println(parallelepiped2.surfaceArea());

        System.out.println("3)");
        Angle angle2 = new Angle(30);
        Angle angle3 = new Angle(90);
        Parallelepiped parallelepiped3 = new Parallelepiped(point1,6,6,6,angle2 ,angle3 );
        System.out.println(parallelepiped3.baseArea());
        System.out.println(parallelepiped3.parallelepipedHeight());
        System.out.println(parallelepiped3.capacity());
        System.out.println(parallelepiped3.basePerimeter());
        System.out.println(parallelepiped3.surfaceArea());
    }
}
