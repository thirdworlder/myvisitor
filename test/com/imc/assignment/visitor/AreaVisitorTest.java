package test.com.imc.assignment.visitor;

import org.junit.Before;
import org.junit.Test;
import src.com.imc.assignment.visitor.IAreaVisitor;
import src.com.imc.assignment.visitor.impl.AreaVisitor;
import src.com.imc.assignment.visitor.impl.Circle;
import src.com.imc.assignment.visitor.impl.Rectangle;
import src.com.imc.assignment.visitor.impl.Triangle;

import static org.junit.Assert.assertEquals;

public class AreaVisitorTest {
    private IAreaVisitor visitor;

    @Before
    public void init() {
        visitor = new AreaVisitor();
    }

    @Test
    public void testCircle() {
        Circle c = new Circle(7);
        double area = c.accept(visitor);
        assertEquals(area, 154d, 0.5d);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(10, 4);
        double area = r.accept(visitor);
        assertEquals(area, 40d, 0.5d);
    }

    @Test
    public void testTriangle() {
        Triangle t = new Triangle(10, 2);
        double area = t.accept(visitor);
        assertEquals(area, 10d, 0.5d);
    }
}
