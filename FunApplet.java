import java.awt.*;
import javax.swing.*;

public class FunApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 80);

        g.setColor(Color.BLUE);
        g.fillOval(250, 50, 120, 80);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 80, 190);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Applets are Fun");
        frame.add(new FunApplet());
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}