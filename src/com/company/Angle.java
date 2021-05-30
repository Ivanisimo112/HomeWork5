package com.company;

public class Angle {
    private int deg;

    public Angle(int rad) {
        this.deg = rad;
    }
    public double fromDegreesToRadians(){
        return (deg * Math.PI / 180);
    }
}
