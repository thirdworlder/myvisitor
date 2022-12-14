package com.imc.assignment.visitor.client;

import com.imc.assignment.visitor.IShape;
import com.imc.assignment.visitor.impl.Rectangle;
import com.imc.assignment.visitor.impl.Triangle;
import com.imc.assignment.visitor.IAreaVisitor;
import com.imc.assignment.visitor.impl.AreaVisitor;
import com.imc.assignment.visitor.impl.Circle;

public class ShapeClient {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[]{
                new Circle(7),
                new Rectangle(5, 2),
                new Triangle(10, 5)
        };

        IAreaVisitor visitor = new AreaVisitor();
        for(IShape shape : shapes)
        {
            double area = shape.accept(visitor);
            System.out.println("Area of " + shape + " is: " + area);
        }

    }
}
