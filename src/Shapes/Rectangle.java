package Shapes;

public class Rectangle extends Quadrilateral implements Measureable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return this.length * 2 + this.width * 2;
    }
}

