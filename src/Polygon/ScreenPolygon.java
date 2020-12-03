package Polygon;

import javax.swing.*;
import java.awt.*;

public class ScreenPolygon extends JPanel {

    static double[] ViewFrom = new double [] { 10, 10, 10 };
    static double[] ViewTo = new double [] { 5, 0, 0 };

    static int NumPolygons  = 0;
    static PolygonObject[] DrawablePolygons = new PolygonObject[100];

//    PolygonObject poly1;
//    PolygonObject poly2;
    TDPolygon TDP = new TDPolygon(new double[]{2,4, 2}, new double[]{2, 4, 7}, new double[]{5,5,5}, Color.BLUE);

    public ScreenPolygon() {
//        poly1 = new PolygonObject(new int[]{10,200, 10}, new int[]{10,200,400}, Color.GREEN);
//        poly2 = new PolygonObject(new int[]{100,20, 100}, new int[]{20,300,500}, Color.RED);
    }

    public void paintComponent(Graphics g) {

//        g.fillOval(10, 10, 100, 100);
//        poly1.drawPolygon(g);
//        poly2.drawPolygon(g);

        for(int i = 0; i < NumPolygons; i++) {
            DrawablePolygons[i].drawPolygon(g);
        }
    }
}
