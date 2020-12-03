package Polygon3D.src.shapes;

import java.awt.*;

public class Tetrahedron {

    public MyPolygon[] polygons;
    public Color color;


    public Tetrahedron(Color color, MyPolygon... polygons) {
        this.color = color;
        this.polygons = polygons;
        this.setPolygonColor();

    }

    public Tetrahedron(MyPolygon... polygons) {
        this.color = Color.YELLOW;
        this.polygons = polygons;

    }

    public void render (Graphics g) {
        for(MyPolygon poly : this.polygons) {
            poly.render(g);
        }
    }

    public void rotate(boolean CW, double xDegrees, double yDegrees, double zDegrees) {
        for(MyPolygon p : this.polygons){
            p.rotate(CW, xDegrees, yDegrees, zDegrees);
        }
        this.sortPolygons();
    }

    private void sortPolygons() {



    }

    private void setPolygonColor() {
        for(MyPolygon poly : polygons) {
            poly.setColor(this.color);

        }
    }
}
