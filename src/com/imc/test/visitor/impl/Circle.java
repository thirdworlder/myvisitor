package src.com.imc.test.visitor.impl;

import src.com.imc.test.visitor.IAreaVisitor;
import src.com.imc.test.visitor.IShape;

public class Circle implements IShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double accept(IAreaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
