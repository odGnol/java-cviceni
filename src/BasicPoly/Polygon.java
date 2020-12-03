package BasicPoly;
import java.awt.Graphics;

public class Polygon {

    public void draw(Graphics g){
        int [] pentagonsX = { 250, 350, 300, 200, 150};
        int [] pentagonsY = { 100, 200, 300, 300, 200};

        g.fillPolygon( pentagonsX, pentagonsY, pentagonsX.length);
    }



}
