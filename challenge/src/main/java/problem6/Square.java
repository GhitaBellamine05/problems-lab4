package problem6;

public class Square implements Forme {
    private double side;
    // Constructor
    public Square(double side){
        this.side = side;
    }
    // getter
    double getSide(){return this.side;}
    // setter
    void setSide(int side){this.side = side;}
    // method to compute the surface
    @Override
    public double getSurface() {
        return side * side;
    }
    @Override
    public String toString() {
        return "Square(side=" + side + " cm)";
    }
}

