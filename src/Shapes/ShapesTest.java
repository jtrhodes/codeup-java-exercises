package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(622, 888);
        System.out.println(box1.getPerimeter() + "\n" + box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter() + "\n" + box2.getArea());
    }
}