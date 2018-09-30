package InterfaGrafica;

import javax.swing.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener {

    JLabel texto1;
    JTextField campo;
    JButton boton1;

    public Form() {
        setLayout(null);
        texto1 = new JLabel("usuario: ");
        texto1.setBounds(10, 20, 300, 40);
        add(texto1);

        campo = new JTextField();
        campo.setBounds(120, 20, 250, 40);
        add(campo);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 100, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String texto = campo.getText();
            setTitle(texto);

        }

    }
    
    public static void main(String[]args){
    
    Form f1 = new Form();
    f1.setBounds(0,0,400,200);
    f1.setResizable(false);
    f1.setLocationRelativeTo(null);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
    }
}
