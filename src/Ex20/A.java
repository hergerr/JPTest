package Ex20;

import javax.swing.*;


class B extends JFrame {
    JButton btnNewButton = new JButton("<html><font color=red>AAA</font></html>");
    JPanel panel = new JPanel();

    public B() {
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setContentPane(panel);
        panel.add(btnNewButton);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new B();
    }
}
