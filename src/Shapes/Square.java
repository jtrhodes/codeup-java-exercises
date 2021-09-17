package Shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }


}