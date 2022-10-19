import java.awt.*; import java.awt.event.*;import javax.swing.*; import java.util.*;
public class Tjahjo_Problem1{
    public static void main(String[] args) {
        new menu();

    }
    public static class Border { //1 is o and -1 is X
        Random rand = new Random();
        JButton[][] a = new JButton[3][3];


        JFrame f;
        Border(int i) {
            int[] turn = {i};
            f = new JFrame();
            ActionListener numberL = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (turn[0] == 1) {
                        ((JButton)e.getSource()).setText("O");
                        ((JButton)e.getSource()).setFont(new Font("Comic Sans", Font.BOLD, 100));
                        ((JButton)e.getSource()).setEnabled(false);
                        ((JButton)e.getSource()).setBackground(new Color(0, 0, 255));
                        turn[0] = -1;
                        if(hasWon(a, "O")){
                            System.out.println("Done");
                            f.dispose();
                        }
                        turn[0] = computer(a, turn[0]);
                    } else {
                        ((JButton)e.getSource()).setText("X");
                        ((JButton)e.getSource()).setFont(new Font("Comic Sans", Font.BOLD, 100));
                        ((JButton)e.getSource()).setEnabled(false);
                        ((JButton)e.getSource()).setBackground(new Color(255, 0, 0));
                        turn[0] = 1;
                        if(hasWon(a, "X")){
                            System.out.println("Done");
                            f.dispose();
                        }
                        turn[0] = computer(a, turn[0]);
                    }
                }
            };
                JButton b1 = new JButton("");
                b1.addActionListener(numberL);
                JButton b2 = new JButton("");
                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b2.setText("O");
                            b2.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b2.setEnabled(false);
                            b2.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b2.setText("X");
                            b2.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b2.setEnabled(false);
                            b2.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b3 = new JButton("");
                b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b3.setText("O");
                            b3.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b3.setEnabled(false);
                            b3.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b3.setText("X");
                            b3.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b3.setEnabled(false);
                            b3.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b4 = new JButton("");
                b4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b4.setText("O");
                            b4.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b4.setEnabled(false);
                            b4.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b4.setText("X");
                            b4.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b4.setEnabled(false);
                            b4.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b5 = new JButton("");
                b5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b5.setText("O");
                            b5.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b5.setEnabled(false);
                            b5.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b5.setText("X");
                            b5.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b5.setEnabled(false);
                            b5.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b6 = new JButton("");
                b6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b6.setText("O");
                            b6.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b6.setEnabled(false);
                            b6.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b6.setText("X");
                            b6.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b6.setEnabled(false);
                            b6.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b7 = new JButton("");
                b7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b7.setText("O");
                            b7.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b7.setEnabled(false);
                            b7.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b7.setText("X");
                            b7.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b7.setEnabled(false);
                            b7.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b8 = new JButton("");
                b8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b8.setText("O");
                            b8.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b8.setEnabled(false);
                            b8.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b8.setText("X");
                            b8.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b8.setEnabled(false);
                            b8.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a, "X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                JButton b9 = new JButton(""); //button name.setenable(false);
                b9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (turn[0] == 1) {
                            b9.setText("O");
                            b9.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b9.setEnabled(false);
                            b9.setBackground(new Color(0, 0, 255));
                            turn[0] *= -1;
                            if(hasWon(a,"O")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        } else {
                            b9.setText("X");
                            b9.setFont(new Font("Comic Sans", Font.BOLD, 100));
                            b9.setEnabled(false);
                            b9.setBackground(new Color(255, 0, 0));
                            turn[0] *= -1;
                            if(hasWon(a,"X")){
                                System.out.println("Done");
                                f.dispose();
                            }
                            turn[0] = computer(a, turn[0]);
                        }
                    }
                });
                f.add(b1);
                f.add(b2);
                f.add(b3);
                f.add(b4);
                f.add(b5);
                f.add(b6);
                f.add(b7);
                f.add(b8);
                f.add(b9);
                f.setLayout(new GridLayout(3, 3));
                f.setSize(800, 800);
                f.setVisible(true);
                a[0][0] = b1; a[0][1] = b2; a[0][2] = b3; a[1][0] = b4; a[1][1] = b5; a[1][2] = b6; a[2][0] = b7; a[2][1] = b8; a[2][2] = b9;
           boolean b = true;


        }
    }
    public static class menu {
        JFrame menu;
        menu(){
            menu=new JFrame();
            JLabel title = new JLabel("Choose your symbol x or o");
            menu.add(title);
            JButton bO = new JButton("X");
            menu.add(bO);
            JButton bX = new JButton("O");
            menu.add(bX);
            menu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
            menu.setSize(800, 100);
            menu.setVisible(true);
            bO.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new Border(-1);
                    menu.dispose();
                }
            });
            bX.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new Border(1);
                    menu.dispatchEvent(new WindowEvent(menu, WindowEvent.WINDOW_CLOSING));
                }
            });
        }

    }
    static int computer(JButton[][] a, int b){
        Random rand = new Random();
        boolean c = true;
        while(c) {
            int r = rand.nextInt(3);
            int p = rand.nextInt(3);
            if (a[r][p].isEnabled()) {
                if (b == 1) {
                    a[r][p].setText("O");
                    a[r][p].setFont(new Font("Comic Sans", Font.BOLD, 100));
                    a[r][p].setEnabled(false);
                    a[r][p].setBackground(new Color(0, 0, 255));
                    c= false;
                    return b*-1;
                } else {
                    a[r][p].setText("X");
                    a[r][p].setFont(new Font("Comic Sans", Font.BOLD, 100));
                    a[r][p].setEnabled(false);
                    a[r][p].setBackground(new Color(255, 0, 0));
                    c= false;
                    return b*-1;
                }

            }
        }
        return b*-1;
    }
    static boolean hasWon( JButton a[][], String b) {
        for(int i = 0; i < 3; i++){
            if(a[i][0].getText() == "X" && a[i][1].getText() == "X" && a[i][2].getText() == "X"){
                return true;
            }
            if(a[i][0].getText() == "O" && a[i][1].getText() == "O" && a[i][2].getText() == "O"){
                return true;
            }
            if(a[0][i].getText() == "X" && a[1][i].getText() == "X" && a[2][i].getText() == "X"){
                return true;
            }
            if(a[i][0].getText() == "O" && a[i][1].getText() == "O" && a[i][2].getText() == "O"){
                return true;
            }

        }
        if(a[0][0].getText() == "O" && a[1][1].getText() == "O" && a[2][2].getText() == "O"){ //checks diagnoally
            return true;
        }
        if(a[0][0].getText() == "O" && a[1][1].getText() == "O" && a[2][2].getText() == "O"){
            return true;
        }
        if(a[0][2].getText() == "O" && a[1][1].getText() == "O" && a[2][0].getText() == "O"){ //checks diagnoally
            return true;
        }
        if(a[0][2].getText() == "O" && a[1][1].getText() == "O" && a[2][0].getText() == "O") {
            return true;

        }


        if(!(a[0][0].isEnabled()) && !(a[0][1].isEnabled()) && !(a[0][2].isEnabled()) && !(a[1][0].isEnabled()) && !(a[1][1].isEnabled()) && !(a[1][2].isEnabled()) && !(a[2][0].isEnabled()) && !(a[2][1].isEnabled()) && !(a[2][2].isEnabled())){
            System.out.println("Tie");
            return true;
        }else{
            return false;
        }
    }



    }

