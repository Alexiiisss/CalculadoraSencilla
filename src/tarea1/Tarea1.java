/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author sebas
 */
public class Tarea1 extends JFrame {
private JPanel pNumb, pDatos, pResult;
private JButton suma, resta, multiplicacion, division;
private JTextArea numb1, numb2, result;
private JLabel number1, number2, resultado;

public Tarea1 ()
{
        initComponents();
        setTitle("Una chimba de calculadora.");
        setSize(750,250);
        setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}

private void initComponents() 
{
    pDatos = new JPanel();
    pDatos.setPreferredSize(new Dimension(250, 100));
    pDatos.setBorder(BorderFactory.createTitledBorder("Ingrese sus datos"));
    pNumb = new JPanel();
    pNumb.setPreferredSize(new Dimension(250, 100));
    pNumb.setBorder(BorderFactory.createTitledBorder("Operaciones"));
    pResult = new JPanel();
    pResult.setPreferredSize(new Dimension(250, 100));
    pResult.setBorder(BorderFactory.createTitledBorder("Resultado"));
    number1 = new JLabel("Número 1");
    number2 = new JLabel("Número 2");
    resultado = new JLabel("Resultado");
    suma = new JButton("Suma");
    resta = new JButton("Resta");
    multiplicacion = new JButton("Multiplicar");
    division = new JButton("Dividir");
    numb1 = new JTextArea(1, 10);
    numb2 = new JTextArea(1, 10);
    result = new JTextArea(1, 10);

    add(pDatos, BorderLayout.NORTH);
    add(pNumb, BorderLayout.CENTER);
    add(pResult, BorderLayout.AFTER_LINE_ENDS);
    pResult.add(result, BorderLayout.WEST);
    pNumb.add(suma, BorderLayout.NORTH);
    pNumb.add(resta, BorderLayout.EAST);
    pNumb.add(multiplicacion, BorderLayout.NORTH);
    pNumb.add(division, BorderLayout.NORTH);
    pDatos.add(number1, BorderLayout.LINE_START);
    pDatos.add(numb1, BorderLayout.NORTH);
    pDatos.add(number2, BorderLayout.SOUTH);
    pDatos.add(numb2, BorderLayout.SOUTH);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarea1 miTarea1 = new Tarea1();
    } 
}
