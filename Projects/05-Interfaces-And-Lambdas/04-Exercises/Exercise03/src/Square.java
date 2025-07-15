public class Square implements Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public Square(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }
}
