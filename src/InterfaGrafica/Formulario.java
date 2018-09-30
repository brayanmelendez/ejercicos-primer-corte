package InterfaGrafica;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    JLabel texto1;
    JLabel texto2;
    JButton boton1;

    public Formulario() {
        setLayout(null);

        texto1 = new JLabel("HOLA MUNDO");
        texto1.setBounds(10, 20, 200, 30);
        add(texto1);

        texto2 = new JLabel("versio 1.0");
        texto2.setBounds(10, 100, 200, 30);
        add(texto2);

        boton1 = new JButton("cerrar");
        boton1.setBounds(100, 150, 100, 40);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Formulario f1 = new Formulario();
        f1.setBounds(0, 0, 300, 250);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

    }
}
