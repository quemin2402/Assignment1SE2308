package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(){
        this.points = new ArrayList<Point>();
    }

    public boolean addPoint(Point p) {
        return points.add(p);
    }
    public double P(){
        double sumP = 0;
        for(int i = 0; i <= points.size()-1; i++) {
            if (i == points.size() - 1) {
                sumP += points.get(i).distance(points.get(0));
                break;
            }
            sumP += points.get(i).distance(points.get(i + 1));
        }
        return sumP;
    }

    public double averSide() {
        double summ;
        summ = this.P() / points.size();
        return summ;
    }

    public double longSide() {
        double max = 0;

        for(int i = 0; i <= points.size() - 1; i++) {
            if (i == points.size() - 1) {
                if (points.get(i).distance(points.get(0)) > max) {
                    max = points.get(i).distance(points.get(0));
                }
                break;
            }
            if (points.get(i).distance(points.get(i + 1)) > max) {
                max = points.get(i).distance(points.get(i + 1));
            }
        }

        return max;
    }


}
