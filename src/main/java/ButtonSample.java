import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonSample {
    public static void main(String[] args) {
        Runnable runner = () -> {
            JFrame frame = new JFrame("Button Sample");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton button = new JButton("Select Me");

            AnActionListener actionListener = new AnActionListener();

            MouseListener mouseListener = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                    if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                        System.out.println("Left button pressed.");
                    }
                    if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                        System.out.println("Right button pressed.");
                    }
                    if (SwingUtilities.isMiddleMouseButton(mouseEvent)) {
                        System.out.println("Middle button pressed.");
                    }
                }

                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                    if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                        System.out.println("Left button released.");
                    }
                    if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                        System.out.println("Right button released.");
                    }
                    if (SwingUtilities.isMiddleMouseButton(mouseEvent)) {
                        System.out.println("Middle button released.");
                    }
                    System.out.println();
                }

            };


            button.addActionListener(actionListener);
            button.addMouseListener(mouseListener);

            frame.add(button, BorderLayout.SOUTH);
            frame.setSize(300, 100);
            frame.setVisible(true);
        };

        EventQueue.invokeLater(runner);
    }
}
