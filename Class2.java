//package nes;

public class Class2d {
    private double xCoord;
    private double yCoord;

    public Class2d ( double x, double y){
        xCoord = x;
        yCoord = y;
    }
    public Class2d (){
        this (0.0,0.0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public boolean compare(Class2d point){
        return (xCoord == point.getX() & yCoord == point.getY());
    }
}
