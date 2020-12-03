import javax.swing.*;
import java.awt.*;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DoNotEnterSign extends JPanel {

    private static final long seralVersionUID =  7148504528835036003L;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        var center = new Point(getWidth() / 2, getHeight()/2);
        var radius = Math.min(getWidth()/2, getHeight()/2) - 5;
        var diameter = radius * 2;
        var innerRadius = (int)(radius * 0.9);
        var innerDiameter = innerRadius * 2;
        var barWidth = (int)(innerRadius * 1.5);
        var barHeight = (int)(innerRadius * 0.3);

        g.setColor(Color.white);
        g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
        g.setColor(Color.red);
        g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
        g.setColor(Color.white);
        g.fillRect(center.x - barWidth/2, center.y - barHeight/2, barWidth, barHeight);
    }

    public static void main(String[]args){
        SwingUtilities.invokeLater(()-> {
            var panel = new DoNotEnterSign();
            panel.setBackground(Color.GREEN.darker());
            var frame = new JFrame("A simple test, Gnolod");
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }


}
