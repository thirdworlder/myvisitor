package src.com.imc.assignment.visitor.impl;

import src.com.imc.assignment.visitor.IAreaVisitor;

public class AreaVisitor implements IAreaVisitor {
    @Override
    public double visit(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getBreadth();
    }

    @Override
    public double visit(Triangle triangle) {
        return 0.5d * triangle.getBase() * triangle.getHeight();
    }
}
