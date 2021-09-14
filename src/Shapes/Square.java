package Shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }
    public int getArea(){
        return this.length;
    }
    public int getPerimeter(){
        return this.length * 4;
    }
}