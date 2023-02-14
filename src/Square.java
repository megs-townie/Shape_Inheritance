public class Square extends Shape {

    private double side;

    //region Constructor
    public Square(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }
    //endregion

    //region Getters & Setters

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    //endregion

    //region Override method
    @Override
    public double getArea(){
        return side*side;
    }
    //endregion
}
