package principal;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese Numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese Numero 2"));




        JOptionPane.showMessageDialog(null,+sumar(numero1,numero2));

       // System.out.println(""+ sumar(numero1,numero2));

    }


    private static int sumar(int numero1 , int numero2){
        return numero1 - numero2;

    }
}
