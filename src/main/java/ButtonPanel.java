import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton button1;
    JButton button2;

    public ButtonPanel(String buttonText1, String buttonText2) {
        button1 = new JButton(buttonText1);
        button1.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 Pressed");
            }
        });;

        button2 = new JButton(buttonText2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 Pressed");
            }
        });;

        add(button1);
        setLayout(new GridLayout(2, 3));
        add(button2);
    }
}
