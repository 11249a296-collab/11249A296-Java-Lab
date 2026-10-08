import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard");

        frame.setLayout(new BorderLayout());

        frame.add(new JLabel("HEADER", SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JLabel("FOOTER", SwingConstants.CENTER), BorderLayout.SOUTH);
        frame.add(new JButton("MENU"), BorderLayout.WEST);
        frame.add(new JButton("SIDE"), BorderLayout.EAST);
        frame.add(new JButton("CONTENT"), BorderLayout.CENTER);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}