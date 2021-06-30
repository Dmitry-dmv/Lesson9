package chernyh.company;

public class Cylinder extends class Solidofrevolushon {
    private final double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}