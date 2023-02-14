public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 5.0);
        System.out.println("Circle area: " + circle.getArea());

        Square square = new Square("Blue", true, 7.0);
        System.out.println("Square area: " + square.getArea());

        Triangle triangle = new Triangle("Green", true, 8.0, 10.0);
        System.out.println("Triangle area: " + triangle.getArea());
    }
}