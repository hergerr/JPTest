package Ex19;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class A extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform saveAT = g2d.getTransform();
        AffineTransform t = new AffineTransform();

        t.scale(1, -1);
        t.translate(100,-100);
        g2d.setTransform(t);
        g2d.drawLine(-100, 0, 0, 0);
        g2d.setTransform(saveAT);
    }

    public static void main(String[] args) {
        //new A();
        new B();
    }

    public A(){

    }
}

class B extends JFrame{
    A myPanel=null;
    public B(){
        super("Andrzej Gierlak SA©");
        setSize(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        myPanel=new A();
        setContentPane(myPanel);

        setVisible(true);
        }
}
