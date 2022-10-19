import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tjahjo_Problem5 {
    public static void main(String[] args){
        new menu();
    }
    public static class menu {
        JFrame menu;


        menu() {
            menu = new JFrame();
            JLabel title = new JLabel("PassCode guesser");
            menu.add(title);
            JTextField bO = new JTextField("", 30);
            menu.add(bO);
            menu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
            JPanel j = new JPanel();
            j.setLayout(new GridLayout(4,3));
            ActionListener number = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bO.setText(bO.getText() + "" + ((JButton)(e.getSource())).getText());
                }
            };
            JButton numbers[] = new JButton[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = new JButton(Integer.toString(i));
                j.add(numbers[i]);
                numbers[i].addActionListener(number);
            }
            menu.add(j);
            JButton Enter = new JButton("Enter");
            menu.add(Enter);
            JButton Del = new JButton("delete");
            menu.add(Del);
            Del.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bO.setText(bO.getText().substring(0, bO.getText().length()-1));
                }
            });
            menu.setSize(400, 400);
            menu.setVisible(true);
            Enter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if((Integer.parseInt(bO.getText()) == 1234)){
                        menu.dispose();
                    }else{
                        menu.getContentPane().setBackground(new Color(255, 0, 0));
                    }
                }
            });
            menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }


    }
}
