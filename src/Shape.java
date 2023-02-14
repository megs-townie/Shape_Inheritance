public class Shape {

    //Variables & Properties

    private String color;
    private boolean filled;

    //region Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //endregion

    //region Getters & Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //endregion

    //region Calculate Area of the Shape Method
    public double getArea() {
        return 0.0; //returns 0 by default because this class has no specific shape
    }
    //endregion
}

