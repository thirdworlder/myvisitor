package src.com.imc.assignment.visitor;

public interface IShape {
    double accept(IAreaVisitor visitor);
}
