package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(){
        this.points = new ArrayList<>();
    }

    public boolean addPoint(Point p) {
        return points.add(p);
    }
    public double calculatePerimeter(){
        double sumP = 0;
        for (double side : getSides()) {
            sumP += side;
        }

        return sumP;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        double max = 0;
        for (double side : getSides()) {
            if (max < side) {
                max = side;
            }
        }

        return max;
    }

    private double[] getSides() {
        double[] sides = new double[points.size()];
        for(int i = 0; i < points.size(); i++) {
            if (i == points.size() - 1) {
                sides[i] = points.get(i).distance(points.getFirst());
                break;
            }
            sides[i] = points.get(i).distance(points.get(i + 1));
        }

        return sides;
    }
}
