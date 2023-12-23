package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distance (Point dest) {
        double X = dest.x - this.x;
        double Y = dest.y - this.y;
        double distance = X * X + Y * Y;
        return Math.sqrt(distance);
    }

    // toString
    public String toString() {
        return  "(" + x + ";" + y + ")";
    }
}