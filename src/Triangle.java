public class Triangle extends Shape {

    private double base;
    private double height;

    //region Constructor
    public Triangle(String color, boolean filled, double base, double height){
        super(color, filled);
        this.base = base;
        this.height = height;
    }
    //endregion

    //region Getters & Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //endregion

    //region Override Method
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
