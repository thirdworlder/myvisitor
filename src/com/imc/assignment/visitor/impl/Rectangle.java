package com.imc.assignment.visitor.impl;

import com.imc.assignment.visitor.IAreaVisitor;
import com.imc.assignment.visitor.IShape;

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
