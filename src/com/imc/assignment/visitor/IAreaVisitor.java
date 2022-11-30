package com.imc.assignment.visitor;

import com.imc.assignment.visitor.impl.Circle;
import com.imc.assignment.visitor.impl.Rectangle;
import com.imc.assignment.visitor.impl.Triangle;


public interface IAreaVisitor {
    double visit(Circle circle);
    double visit(Rectangle rectangle);
    double visit(Triangle triangle);
}
