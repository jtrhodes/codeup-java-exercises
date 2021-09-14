package Shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int getArea(){
        return this.length * this.width;
    }
    public int getPerimeter(){
        return this.length * 2 + this.width * 2;
    }
}

