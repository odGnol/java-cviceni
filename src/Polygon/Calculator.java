package Polygon;

import static Polygon.ScreenPolygon.ViewFrom;

public class Calculator {

    static double DrawX, DrawY;
    static double CalculatePositionX(double [] viewFrom, double[] viewTo, double x, double y, double z) {
        setStuff(viewFrom, viewTo, x, y, z);
        return DrawX;
    }

    static double CalculatePositionY(double [] viewFrom, double[] viewTo, double x, double y, double z) {
        setStuff(viewFrom, viewTo, x, y, z);
        return DrawY;
    }

    static void setStuff(double[] viewFrom, double[] viewTo, double x, double y, double z) {

        Vector viewVector = new Vector(viewTo[0] - viewFrom[0], viewTo[1] - viewFrom[1], viewTo[2] - viewFrom[2]);
        Vector DirectionVector = new Vector(1,1,1);
        Vector PlaneVector1 = viewVector.CrossProduct(DirectionVector);
        Vector PlaneVector2 = viewVector.CrossProduct(PlaneVector1);

        Vector viewToPoint = new Vector(x -viewFrom[0], y - viewFrom[1], z - viewFrom[2]);

        double t = (viewVector.x*viewTo[0] + viewVector.y*viewTo[1] + viewVector.z*viewTo[2])
                -  (viewVector.x*viewFrom[0] + viewVector.y*viewFrom[1] + viewVector.z*viewFrom[2])
                / (viewVector.x*viewToPoint.x + viewVector.y*viewToPoint.y + viewVector.z*viewToPoint.z);

        x = ViewFrom[0] + viewToPoint.x * t;
        y = ViewFrom[1] + viewToPoint.y * t;
        z = ViewFrom[2] + viewToPoint.z * t;

        if(t>=0) {
            DrawX = PlaneVector2.x * x + PlaneVector2.y * y + PlaneVector2.z * z;
            DrawY = PlaneVector1.x * x + PlaneVector1.y * y + PlaneVector1.z * z;
        }

    }
}
