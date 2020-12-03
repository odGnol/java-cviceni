package Polygon;

import java.awt.*;
import java.awt.Polygon;

public class PolygonObject {

    Polygon polygon;
    Color colorC;

    public PolygonObject(double[] x, double[] y, Color color) {

        ScreenPolygon.NumPolygons++;
        polygon = new Polygon();
        for (int i = 0; i < x.length; i++) {
            polygon.addPoint((int)x[i], (int)y[i]);
            this.colorC = color;
        }
//
//        polygon.xpoints = x;
//        polygon.ypoints = y;
//        polygon.npoints = x.length;


    }

    void drawPolygon(Graphics g) {
        g.setColor(colorC);
        g.drawPolygon(polygon);
    }
}
