package src.com.imc.test.visitor;

import src.com.imc.test.visitor.impl.Circle;
import src.com.imc.test.visitor.impl.Rectangle;
import src.com.imc.test.visitor.impl.Triangle;


public interface IAreaVisitor {
    double visit(Circle circle);
    double visit(Rectangle rectangle);
    double visit(Triangle triangle);
}
