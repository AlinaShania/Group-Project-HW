package GroupProject2;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();

}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the circle is "+(3.14*radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle is "+(2*3.14*radius));
    }
}
class Square implements Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the square is "+(side*side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the square is "+(4*side));
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle obj1 = new Circle(6);
        Square obj2 = new Square(4);

        obj1.calculateArea();
        obj1.calculatePerimeter();
        obj2.calculateArea();
        obj2.calculatePerimeter();
    }
}

