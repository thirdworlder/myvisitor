package src.com.imc.test.visitor.impl;

import src.com.imc.test.visitor.IAreaVisitor;
import src.com.imc.test.visitor.IShape;

public class Rectangle implements IShape {

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double accept(IAreaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
