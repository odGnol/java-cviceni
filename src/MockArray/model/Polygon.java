package MockArray.model;

import MockArray.model.Point;

import java.util.List;

public class Polygon {

    private final List<MockArray.model.Point> points;
    private final int color;

    public Polygon (List<Point> points, int color) {
        this.points = points;
        this.color = color;

    }
}
