import javax.swing.*;
import java.awt.*;

public class ButtonSample {
    public static void main(String[] args) {
        Runnable runner = () -> {
            JFrame frame = new JFrame("Button Sample");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton button = new JButton("Select Me");

            AnActionListener actionListener = new AnActionListener();

            button.addActionListener(actionListener);

            frame.add(button, BorderLayout.SOUTH);
            frame.setSize(300, 100);
            frame.setVisible(true);
        };

        EventQueue.invokeLater(runner);
    }
}
