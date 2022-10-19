import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tjahjo_Problem2 {
    public static void main(String[] args){
        new Suduko();

    }
    public static class Suduko{
        public boolean checker(JTextField a[][], int number){
            for(int i = 0; i < 9; i++){ //row checker
                for(int p = 0; p < 9; p++){
                    if(number > 10){
                        return true;
                    }else if(Integer.parseInt(a[i][p].getText()) == number){
                        //System.out.println("Hi");
                        a[i][p].setBackground(new Color(0,100,0));
                        checker(a,number+1);

                    }

                }
            }

            return true;
        }
        JFrame Game = new JFrame();

        public Suduko(){
            JPanel game = new JPanel(new GridLayout(3,3));
            Game.setLayout(new BorderLayout());
            Game.add(game);
            JPanel a = new JPanel();
            a.setLayout(new GridLayout(3,3));
            JTextField a1 = new JTextField();
            JTextField a2 = new JTextField();
            JTextField a3 = new JTextField();
            JTextField a4 = new JTextField();
            JTextField a5 = new JTextField();
            JTextField a6 = new JTextField();
            JTextField a7 = new JTextField();
            JTextField a8 = new JTextField();
            JTextField a9 = new JTextField();
            a.add(a1);
            a.add(a2);
            a.add(a3);
            a.add(a4);
            a.add(a5);
            a.add(a6);
            a.add(a7);
            a.add(a8);
            a.add(a9);
            JTextField arr1[] = {a1,a2,a3,a4,a5,a6,a7,a8,a9};
            game.add(a);

            JPanel b = new JPanel();
            b.setLayout(new GridLayout(3,3));
            JTextField b1 = new JTextField();
            JTextField b2 = new JTextField();
            JTextField b3 = new JTextField();
            JTextField b4 = new JTextField();
            JTextField b5 = new JTextField();
            JTextField b6 = new JTextField();
            JTextField b7 = new JTextField();
            JTextField b8 = new JTextField();
            JTextField b9 = new JTextField();
            b.add(b1);
            b.add(b2);
            b.add(b3);
            b.add(b4);
            b.add(b5);
            b.add(b6);
            b.add(b7);
            b.add(b8);
            b.add(b9);
            JTextField arr2[] = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
            game.add(b);

            JPanel c = new JPanel();
            c.setLayout(new GridLayout(3,3));
            JTextField c1 = new JTextField();
            JTextField c2 = new JTextField();
            JTextField c3 = new JTextField();
            JTextField c4 = new JTextField();
            JTextField c5 = new JTextField();
            JTextField c6 = new JTextField();
            JTextField c7 = new JTextField();
            JTextField c8 = new JTextField();
            JTextField c9 = new JTextField();
            c.add(c1);
            c.add(c2);
            c.add(c3);
            c.add(c4);
            c.add(c5);
            c.add(c6);
            c.add(c7);
            c.add(c8);
            c.add(c9);
            JTextField arr3[] = {c1,c2,c3,c4,c5,c6,c7,c8,c9};
            game.add(c);

            JPanel d = new JPanel();
            d.setLayout(new GridLayout(3,3));
            JTextField d1 = new JTextField();
            JTextField d2 = new JTextField();
            JTextField d3 = new JTextField();
            JTextField d4 = new JTextField();
            JTextField d5 = new JTextField();
            JTextField d6 = new JTextField();
            JTextField d7 = new JTextField();
            JTextField d8 = new JTextField();
            JTextField d9 = new JTextField();
            d.add(d1);
            d.add(d2);
            d.add(d3);
            d.add(d4);
            d.add(d5);
            d.add(d6);
            d.add(d7);
            d.add(d8);
            d.add(d9);
            JTextField arr4[] = {d1,d2,d3,d4,d5,d6,d7,d8,d9};
            game.add(d);

            JPanel e = new JPanel();
            e.setLayout(new GridLayout(3,3));
            JTextField e1 = new JTextField();
            JTextField e2 = new JTextField();
            JTextField e3 = new JTextField();
            JTextField e4 = new JTextField();
            JTextField e5 = new JTextField();
            JTextField e6 = new JTextField();
            JTextField e7 = new JTextField();
            JTextField e8 = new JTextField();
            JTextField e9 = new JTextField();
            e.add(e1);
            e.add(e2);
            e.add(e3);
            e.add(e4);
            e.add(e5);
            e.add(e6);
            e.add(e7);
            e.add(e8);
            e.add(e9);
            JTextField arr5[] = {e1,e2,e3,e4,e5,e6,e7,e8,e9};
            game.add(e);

            JPanel f = new JPanel();
            f.setLayout(new GridLayout(3,3));
            JTextField f1 = new JTextField();
            JTextField f2 = new JTextField();
            JTextField f3 = new JTextField();
            JTextField f4 = new JTextField();
            JTextField f5 = new JTextField();
            JTextField f6 = new JTextField();
            JTextField f7 = new JTextField();
            JTextField f8 = new JTextField();
            JTextField f9 = new JTextField();
            f.add(f1);
            f.add(f2);
            f.add(f3);
            f.add(f4);
            f.add(f5);
            f.add(f6);
            f.add(f7);
            f.add(f8);
            f.add(f9);
            JTextField arr6[] = {f1,f2,f3,f4,f5,f6,f7,f8,f9};
            game.add(f);

            JPanel g = new JPanel();
            g.setLayout(new GridLayout(3,3));
            JTextField g1 = new JTextField();
            JTextField g2 = new JTextField();
            JTextField g3 = new JTextField();
            JTextField g4 = new JTextField();
            JTextField g5 = new JTextField();
            JTextField g6 = new JTextField();
            JTextField g7 = new JTextField();
            JTextField g8 = new JTextField();
            JTextField g9 = new JTextField();
            g.add(g1);
            g.add(g2);
            g.add(g3);
            g.add(g4);
            g.add(g5);
            g.add(g6);
            g.add(g7);
            g.add(g8);
            g.add(g9);
            JTextField arr7[] = {g1,g2,g3,g4,g5,g6,g7,g8,g9};
            game.add(g);

            JPanel h = new JPanel();
            h.setLayout(new GridLayout(3,3));
            JTextField h1 = new JTextField();
            JTextField h2 = new JTextField();
            JTextField h3 = new JTextField();
            JTextField h4 = new JTextField();
            JTextField h5 = new JTextField();
            JTextField h6 = new JTextField();
            JTextField h7 = new JTextField();
            JTextField h8 = new JTextField();
            JTextField h9 = new JTextField();
            h.add(h1);
            h.add(h2);
            h.add(h3);
            h.add(h4);
            h.add(h5);
            h.add(h6);
            h.add(h7);
            h.add(h8);
            h.add(h9);
            JTextField arr8[] = {h1,h2,h3,h4,h5,h6,h7,h8,h9};
            game.add(h);

            JPanel i = new JPanel();
            i.setLayout(new GridLayout(3,3));
            JTextField i1 = new JTextField();
            JTextField i2 = new JTextField();
            JTextField i3 = new JTextField();
            JTextField i4 = new JTextField();
            JTextField i5 = new JTextField();
            JTextField i6 = new JTextField();
            JTextField i7 = new JTextField();
            JTextField i8 = new JTextField();
            JTextField i9 = new JTextField();
            i.add(i1);
            i.add(i2);
            i.add(i3);
            i.add(i4);
            i.add(i5);
            i.add(i6);
            i.add(i7);
            i.add(i8);
            i.add(i9);
            JTextField arr9[] = {i1,i2,i3,i4,i5,i6,i7,i8,i9};
            game.add(i);


            JTextField arr10[][] = {{a1,a2,a3,b1,b2,b3,c1,c2,c3},
                    {a4,a5,a6,b4,b5,b6,c4,c5,c6},
                    {a7,a8,a9,b7,b8,b9,c7,c8,c9},
                    {d1,d2,d3,e1,e2,e3,f1,f2,f3},
                    {d4,d5,d6,e4,e5,e6,f4,f5,f6},
                    {d7,d8,d9,e7,e8,e9,f7,f8,f9},
                    {g1,g2,g3,h1,h2,h3,i1,i2,i3},
                    {g4,g5,g6,h4,h5,h6,i4,i5,i6},
                    {g7,g8,g9,h7,h8,h9,i7,i8,i9}};

            JButton done = new JButton("Check");
            Game.add(done, BorderLayout.SOUTH);
            done.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checker(arr10,1);

                }
            });

            
           Game.setSize(800,800);
                        Game.setVisible(true);
                        //Game.pack();
        }
    }

}
