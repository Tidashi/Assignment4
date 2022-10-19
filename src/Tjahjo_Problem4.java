import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Tjahjo_Problem4 {
    public static void main(String[] args){
        new menu("a");
    }
    public static class menu {
        JFrame menu;

        menu(String a) {
            menu = new JFrame(a);
            JLabel title = new JLabel("Setting window name");
            menu.add(title);
            JTextField bO = new JTextField("", 30);
            menu.add(bO);
            menu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

            JButton Enter = new JButton("Enter");
            menu.add(Enter);
            menu.setSize(400, 400);
            menu.setVisible(true);
            Enter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   new menu(bO.getText());
                   menu.dispose();
                }
            });
            menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }

    }
}
