import java.awt.*;
import javax.swing.*;

public class FaceApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(100, 40, 220, 220);

        g.fillOval(150, 110, 20, 20);
        g.fillOval(250, 110, 20, 20);

        g.drawLine(210, 120, 190, 170);
        g.drawLine(190, 170, 220, 170);

        g.drawArc(155, 160, 110, 60, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        frame.add(new FaceApplet());
        frame.setSize(450, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}