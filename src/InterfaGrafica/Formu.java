package InterfaGrafica;

import javax.swing.*;
import java.awt.event.*;

public class Formu extends JFrame implements ActionListener {
    
    private JButton boton1, boton2, boton3;
    private JLabel texto1;
    
    public Formu() {
        setLayout(null);
        
        boton1 = new JButton("1");
        boton1.setBounds(10, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);
        
        texto1 = new JLabel("En espera.....");
        texto1.setBounds(10, 10, 300, 30);
        add(texto1);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            
            texto1.setText("USTED A PRESIONADO EL BOTON 1");
            
        } else {
            if (e.getSource() == boton2) {
                
                texto1.setText("USTED A PRESIONADO EL BOTON 2");
                
            } else {
                if (e.getSource() == boton3) {
                    
                    texto1.setText("USTEDA PRESIONADO EL BOTON 3");
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        Formu f1 = new Formu();
        f1.setBounds(0, 0, 350, 200);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}
