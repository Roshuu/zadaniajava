package com.company.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Kumulowanie extends JFrame implements KeyListener, ActionListener {

    public JLabel wprowadz;
    public JTextField liczba;
    public JLabel skumulowana;
    private final JTextField suma;

    public Kumulowanie() {
        super("Zbieracz");
        wprowadz = new JLabel("Wprowadz liczbe i kliknij enter");
        liczba  = new JTextField("");
        skumulowana= new JLabel("Skumulowana suma wynosi");
        suma=new JTextField("");

        suma.setEditable(false);

        JPanel p = new JPanel(new GridLayout(2,3));
        p.add(wprowadz);
        p.add(liczba);
        p.add(skumulowana);
        p.add(suma);



        addKeyListener(this);
        pack();
        setContentPane(p);
        setSize(1000, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_ENTER:
                    int s=Integer.parseInt(suma.getText())+Integer.parseInt(liczba.getText());
                    suma.setText(Integer.toString(s));
                    break;

            }
            repaint();
        }

        @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Kumulowanie::new);
    }
}
