public class Main {

    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(10);

        printArea(rectangle);
        printArea(square);
    }
}