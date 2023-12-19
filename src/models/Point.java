package models;

public class Point {
    private final double x;
    private final double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString() {
        return "x="+this.x+" y="+this.y;
    }
}