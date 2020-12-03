package Polygon;

import java.awt.*;

import static Polygon.ScreenPolygon.NumPolygons;

public class TDPolygon {


    Color colorC;
    double [] x, y, z;

    public TDPolygon(double[] x, double[] y, double [] z, Color color) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.colorC = color;
        createPolygon();

    }

    void createPolygon() {


        double[] newX = new double[x.length];
        double[] newY = new double [y.length];
        for(int i = 0; i < x.length; i++) {
            newX[i] = 200 * Calculator.CalculatePositionX(ScreenPolygon.ViewFrom, ScreenPolygon.ViewTo, x[i], y[i], z[i]);
            newY[i] = 200 * Calculator.CalculatePositionY(ScreenPolygon.ViewFrom, ScreenPolygon.ViewTo, x[i], y[i], z[i]);
        }
        ScreenPolygon.DrawablePolygons[NumPolygons] = new PolygonObject(newX, newY, colorC);
    };
}
