package problem6;

public class Circle implements Forme{
    private int radius;
    double pi = Math.PI;
    // Constructor
    public Circle(int radius){
        this.radius = radius;
    }
    // setter
    void setRadius(int radius){this.radius = radius;}
    // getter
    int getRadius(){return this.radius;}
    // method to compute the surface
    @Override
    public double getSurface() {
        return pi * this.radius * this.radius;
    }
    @Override
    public String toString() {
        return "Circle(radius=" + radius + " cm)";
    }
}

