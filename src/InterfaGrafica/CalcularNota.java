package InterfaGrafica;

import javax.swing.*;
import java.awt.event.*;

public class CalcularNota extends JFrame implements ActionListener {
    
    private JLabel ne, nt1, nt2, nt3;
    private JTextField nombre, nota1, nota2, nota3;
    private JButton boton1, boton2;
    
    double n1, n2, n3, promedio;
    
    public CalcularNota() {
        
        setLayout(null);
        
        ne = new JLabel("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
        ne.setBounds(10, 10, 300, 30);
        add(ne);
        
        nombre = new JTextField();
        nombre.setBounds(10, 35, 200, 20);
        add(nombre);
        
        nt1 = new JLabel("INGRESE LA PRIMERA NOTA: ");
        nt1.setBounds(10, 55, 200, 20);
        add(nt1);
        
        nota1 = new JTextField();
        nota1.setBounds(10, 75, 200, 20);
        add(nota1);
        
        nt2 = new JLabel("INGRESE LA SEGUNDA NOTA: ");
        nt2.setBounds(10, 95, 200, 20);
        add(nt2);
        
        nota2 = new JTextField();
        nota2.setBounds(10, 115, 200, 20);
        add(nota2);
        
        nt3 = new JLabel("INGRESE LA TERCERA NOTA: ");
        nt3.setBounds(10, 135, 200, 20);
        add(nt3);
        
        nota3 = new JTextField();
        nota3.setBounds(10, 155, 200, 20);
        add(nota3);
        
        boton1 = new JButton("CALCULAR");
        boton1.setBounds(250, 200, 120, 30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("LIMPIAR");
        boton2.setBounds(10, 200, 120, 30);
        add(boton2);
        boton2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            nota3.setText("");
            nota1.setText("");
            nota2.setText("");
            nombre.setText("");
            
        }else{
        
        if (e.getSource()==boton1){
        
            String campoNota1 = nota1.getText();
            n1 = Double.parseDouble(campoNota1);
            
            String campoNota2 = nota2.getText();
            n2 =Double.parseDouble(campoNota2);
            
            String campoNota3 = nota3.getText();
            n3 = Double.parseDouble(campoNota3);
            
            double resultado = (n1+n2+n3)/3;
            
            JOptionPane.showMessageDialog(null,"SU NOTA ES DE: "+resultado);
            
        }
        
        }
    }
    
    public static void main(String[] args) {
        
        CalcularNota c1 = new CalcularNota();
        c1.setBounds(0, 0, 400, 300);
        c1.setResizable(false);
        c1.setLocationRelativeTo(null);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setVisible(true);
        
    }
}
