import java.awt.*;
import javax.swing.*;

public class CalculatorGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        frame.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            frame.add(new JButton(text));
        }

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}