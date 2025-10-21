import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton button;

    public ButtonPanel(String buttonText) {
        button = new JButton(buttonText);
        button.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 Pressed");
            }
        });;

        add(button);
    }
}
