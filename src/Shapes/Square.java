package Shapes;

public class Square extends Rectangle{

    private final int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public int getArea(){
        return getPerimeter();
    }
    @Override
    public int getPerimeter(){
        return side * 4;
    }
}