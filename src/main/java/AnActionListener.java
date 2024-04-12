import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnActionListener implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("I was selected.");
    }
}
