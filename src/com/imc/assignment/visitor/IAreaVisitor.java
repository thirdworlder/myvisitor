package src.com.imc.assignment.visitor;

import src.com.imc.assignment.visitor.impl.Circle;
import src.com.imc.assignment.visitor.impl.Rectangle;
import src.com.imc.assignment.visitor.impl.Triangle;


public interface IAreaVisitor {
    double visit(Circle circle);
    double visit(Rectangle rectangle);
    double visit(Triangle triangle);
}
