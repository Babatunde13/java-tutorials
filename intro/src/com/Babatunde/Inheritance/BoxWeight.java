package com.Babatunde.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight oldBox) {
        super(oldBox);
        this.weight = oldBox.weight;
    }

    double density() {
        return this.weight / this.volume();
    }

    public String toString () {
        StringBuilder s = new StringBuilder(super.toString());
        s.setCharAt(s.length() - 1, ',');
        s.append(" weighs " + this.weight + "kg.");
    
        return s.toString();
    }
}
