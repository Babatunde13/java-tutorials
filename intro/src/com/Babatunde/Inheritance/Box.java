package com.Babatunde.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double l, double w, double h) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box oldBox) {
        this.h = oldBox.h;
        this.w = oldBox.w;
        this.l = oldBox.l;
    }

    double volume() {
        return this.h * this.w * this.l;
    }

    public String toString () {
        return "Box: " + this.l + "cm long, " + this.w + "cm wide, " + this.h + "cm high.";
    }
}
