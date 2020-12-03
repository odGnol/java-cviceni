package Polygon3D.src.point;

import Polygon3D.src.renderer.Display;

import java.awt.*;

public class PointConverter {


    private static double scale = 1;

    public static Point convertPoint(MyPoint point3D) {

        //nastavení hloubky a souřadnic v prostoru
        double x3D = point3D.y * scale;
        double y3D = point3D.z * scale;
        double depth = point3D.x * scale;
        double[] newVal = scale(x3D, y3D, depth);

        int x2D = (int)(Display.WIDTH/2 + newVal[0]);
        int y2D = (int)(Display.HEIGHT/2 - newVal[1]);

        Point point2D = new Point(x2D, y2D);
        return point2D;
    }

    private static double[] scale (double x3d, double y3d, double depth) {
        double dist = Math.sqrt(x3d*x3d + y3d*y3d);
        //angle
        double theta = Math.atan2(y3d, x3d);
        //pozice od objektu
        double depth2 = 15-depth;
        //truncate, škalování?
        double localScale = Math.abs(1400/(depth2+1400));
        //
        dist *= localScale;
        double[] newVal = new double[2];
        //počítání vektoru
        newVal[0] = dist *  Math.cos(theta);
        newVal[1] = dist *  Math.sin(theta);

        return newVal;
    }

    public static void rotateAxisX(MyPoint p, boolean CW, double degrees) {

        double radius = Math.sqrt(p.y*p.y + p.z*p.z);
        double theta = Math.atan2(p.z, p.y);
        theta += 2*Math.PI/360*degrees*(CW ? -1:1);
        p.y = radius * Math.cos(theta);
        p.z = radius * Math.sin(theta);

    }

    public static void rotateAxisY(MyPoint p, boolean CW, double degrees) {

        double radius = Math.sqrt(p.x*p.x + p.z*p.z);
        double theta = Math.atan2(p.z, p.x);
        theta += 2*Math.PI/360*degrees*(CW ? -1:1);
        p.x = radius * Math.cos(theta);
        p.z = radius * Math.sin(theta);

    }

    public static void rotateAxisZ(MyPoint p, boolean CW, double degrees) {

        double radius = Math.sqrt(p.y*p.y + p.z*p.z);
        double theta = Math.atan2(p.y, p.z);
        theta += 2*Math.PI/360*degrees*(CW ? 1:-1);
        p.y = radius * Math.sin(theta);
        p.z = radius * Math.cos(theta);

    }
}
