import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
public class Tjahjo_Problem3 {
    public static void main(String[] argss){
        new menu();

    }
    public static class menu {
        int number1 = 0;
         int number2 = 0;
        int operation = 0;
        JFrame menu = new JFrame();
        JTextField t = new JTextField("", 8);
        menu(){
            menu.setVisible(true);
            menu.setSize(500,600);
            menu.setLayout(new BorderLayout());
            menu.add(t,BorderLayout.NORTH);
            t.setFont(new Font("Comic Sans", 1,100));
            JPanel j = new JPanel();
            j.setLayout(new GridLayout(4,3));

            JPanel o = new JPanel();
            o.setLayout(new GridLayout(4,1));

            ActionListener number = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    t.setText(t.getText() + "" + ((JButton)(e.getSource())).getText());
                }
            };
            ActionListener action = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(((JButton)(e.getSource())).getText() == "Delete"){
                        t.setText(t.getText().substring(0, t.getText().length()-1));
                    }
                    if(((JButton)(e.getSource())).getText() == "X"){
                        operation =1;
                        number1 = number2;
                        number2 = Integer.parseInt(t.getText());
                        t.setText("");
                    }
                    if(((JButton)(e.getSource())).getText() == "Clear"){
                        t.setText("");
                        number1  = 0;
                        number2 = 0;
                    }
                    if(((JButton)(e.getSource())).getText() == "/"){
                        number1 = number2;
                        number2 = Integer.parseInt(t.getText());
                        operation =2;
                        t.setText("");
                    }
                    if(((JButton)(e.getSource())).getText() == "+"){
                        operation =3;
                        number1 = number2;
                        number2 = Integer.parseInt(t.getText());
                        t.setText("");
                    }
                    if(((JButton)(e.getSource())).getText() == "---"){
                        number1 = number2;
                        number2 = Integer.parseInt(t.getText());
                        operation =4;
                        t.setText("");
                    }
                    if(((JButton)(e.getSource())).getText() == "calculate"){
                        number1 = number2;
                        number2 = Integer.parseInt(t.getText());
                        if(operation == 1){
                            System.out.println("Multiplying");
                            t.setText(Integer.toString(number1 * number2));
                        }
                        if(operation == 2){
                            System.out.println("dividing");
                            t.setText(Integer.toString(number1 / number2));
                        }
                        if(operation == 3){
                            System.out.println("adding");
                            System.out.println(number1);
                            System.out.println(" " + number2);
                            t.setText(Integer.toString(number1 + number2));
                        }
                        if(operation == 4){
                            System.out.println("subtracting");
                            System.out.println(number1 + " " + number2);
                            t.setText(Integer.toString(number1 - number2));
                        }
                    }
                    }
            };

            JButton numbers[] = new JButton[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = new JButton(Integer.toString(i));
                j.add(numbers[i]);
                numbers[i].addActionListener(number);
            }
            menu.add(j, BorderLayout.CENTER);
            j.setPreferredSize( new Dimension( 350, 300 ) );

            JButton x = new JButton("X");
            x.addActionListener(action);
            JButton divide = new JButton("/");
            divide.addActionListener(action);
            JButton add = new JButton("+");
            add.addActionListener(action);
            JButton subtract = new JButton("---");
            subtract.addActionListener(action);
            JButton clear = new JButton("Clear");
            clear.addActionListener(action);
            JButton delete = new JButton("Delete");
            delete.addActionListener(action);
            JButton calculate= new JButton("calculate");
            calculate.addActionListener(action);
            calculate.setSize(300, 10);

            j.add(x);
            j.add(divide);
            j.add(add);
            j.add(subtract);
            j.add(clear);
            j.add(delete);
            j.add(calculate, BorderLayout.SOUTH);


            menu.add(o,BorderLayout.EAST);



            menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }


    }

}
