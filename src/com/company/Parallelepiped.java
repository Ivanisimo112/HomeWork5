package com.company;

public class Parallelepiped {
    private Point a;
    private Point b;
    private Point d;
    private Point a1;
    private int i;
    private int aa1;
    private int ab;
    private int ad;
    private Angle angleA1AD;
    private Angle angleBAD;


    public Parallelepiped(Point a, Point b, Point d, Point a1) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.a1 = a1;
        i = 1;
    }

    public Parallelepiped(Point a, Point b, Point d, int aa1, Angle angleA1AD) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.aa1 = aa1;
        this.angleA1AD = angleA1AD;
        i = 2;
    }

    public Parallelepiped(Point a, int aa1, int ab, int ad, Angle angleA1AD, Angle angleBAD) {
        this.a = a;
        this.aa1 = aa1;
        this.ab = ab;
        this.ad = ad;
        this.angleA1AD = angleA1AD;
        this.angleBAD = angleBAD;
        i = 3;
    }

    public double baseArea() {
        if (i == 3) {
            return ad * ab * Math.sin(angleBAD.fromDegreesToRadians());
        } else {
            return Utilities.lengthBetweenX(a, b) * Utilities.lengthBetweenY(a, d);
        }
    }

    public double   parallelepipedHeight() {
        if (i == 1) {
            return Utilities.lengthBetweenZ(a, a1);
        }
        return (int) Math.round(Utilities.heightInclinedParallelepiped(angleA1AD, aa1));
    }

    public double capacity() {
        return baseArea() * parallelepipedHeight();
    }

    public double basePerimeter() {
        if (i==3){
            return ((ad * 2) + (ab * 2));
        }
        return ((Utilities.lengthBetweenY(a, d) * 2) + (Utilities.lengthBetweenX(a, b) * 2));
    }

    public int obliqueSection() {
        if (i==3){
            return (int) Math.round(((Utilities.perpendicularSectionAN(angleA1AD, ad) * 2) + (2 * ad)));
        }
        return (int) Math.round(((Utilities.perpendicularSectionAN(angleA1AD, Utilities.lengthBetweenY(a, d)) * 2) + (2 * Utilities.lengthBetweenY(a, d))));
    }

    public double surfaceArea() {
        if (i == 1) {
            return ((baseArea() * 2) + basePerimeter() * parallelepipedHeight());
        }
        return ((baseArea() * 2) + obliqueSection() * aa1);
    }

}
