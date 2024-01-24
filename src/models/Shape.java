package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    public ArrayList<Point> points;
    public Shape() {
        points = new ArrayList<>();
    }

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++)
            perimeter += points.get(i).distance(points.get(i + 1));
        perimeter += points.get(points.size() - 1).distance(points.get(0));
        return  perimeter;
    }

    // getAverageSide()
    public double getAverageSide() {
        double AverageSide = calculatePerimeter() / points.size();
        return AverageSide;
    }

    // getLongestSide()
    public double getLongestSide() {
        double longestSide = 0;
        for(int i = 0; i < points.size() - 1; i++){
            double sideLength = points.get(i).distance(points.get(i + 1));
            if (sideLength > longestSide)
                longestSide = sideLength;
        }
        longestSide = Math.max(longestSide, points.get(points.size() - 1).distance(points.get(0)));
        return longestSide;
    }
}