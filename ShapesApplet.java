import javax.swing.*;
import java.awt.*;

public class ShapesApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 60);
        g.drawOval(200, 50, 80, 80);
        g.drawLine(50, 150, 200, 150);

        g.drawLine(300, 150, 250, 230);
        g.drawLine(250, 230, 350, 230);
        g.drawLine(350, 230, 300, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shapes");
        frame.add(new ShapesApplet());
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}