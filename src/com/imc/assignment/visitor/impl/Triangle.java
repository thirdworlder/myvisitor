package com.imc.assignment.visitor.impl;

import com.imc.assignment.visitor.IShape;
import com.imc.assignment.visitor.IAreaVisitor;

public class Triangle implements IShape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double accept(IAreaVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
