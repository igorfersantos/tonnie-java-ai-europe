public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.5,5);
        Shape square = new Square(10);
        Shape circle = new Circle(5);

        System.out.println("The area of the rectangle is " + rectangle.calculateArea());
        System.out.println("The area of the square is " + square.calculateArea());
        System.out.println("The area of the circle is " + circle.calculateArea());
    }
}