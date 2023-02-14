public class Circle extends Shape{

    private double radius;

    //region Constructor
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    //endregion

    //region Getters & Setters
    public double getRadius() {
        return radius;
    }

    //endregion

    //region Overide getArea with circle specific area calculation
    @Override
    public double getArea(){
        // Circle Area is pi * r^2
        return Math.PI * radius * radius;
    }
    //endregion
}
