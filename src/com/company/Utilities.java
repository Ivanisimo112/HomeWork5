package com.company;

public class Utilities {
    static public int lengthBetweenX(Point point1, Point point2) {
        if (point1.getX() > point2.getX()) {
            return point1.getX() - point2.getX();
        }
        return point2.getX() - point1.getX();
    }

    static public int lengthBetweenY(Point point1, Point point2) {
        if (point1.getY() > point2.getY()) {
            return point1.getY() - point2.getY();
        }
        return point2.getY() - point1.getY();
    }

    static public int lengthBetweenZ(Point point1, Point point2) {
        if (point1.getZ() > point2.getZ()) {
            return point1.getZ() - point2.getZ();
        }
        return point2.getZ() - point1.getZ();
    }

    static public double   heightInclinedParallelepiped(Angle angle, int aa1) {
        return Math.sin(angle.fromDegreesToRadians()) * aa1;
    }

    static public double perpendicularSectionAN(Angle angle, int ad) {
        return Math.sin(angle.fromDegreesToRadians()) * ad;
    }
}

