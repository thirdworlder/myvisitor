package src.com.imc.test.visitor;

public interface IShape {
    double accept(IAreaVisitor visitor);
}
