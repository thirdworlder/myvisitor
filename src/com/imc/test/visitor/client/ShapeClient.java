package src.com.imc.test.visitor.client;

import src.com.imc.test.visitor.IAreaVisitor;
import src.com.imc.test.visitor.IShape;
import src.com.imc.test.visitor.impl.AreaVisitor;
import src.com.imc.test.visitor.impl.Circle;
import src.com.imc.test.visitor.impl.Rectangle;
import src.com.imc.test.visitor.impl.Triangle;

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
