/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author jestevezrial
 */
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base,altura;
        
        /* String resposta= JOptionPane.showInutDialog 
           base= Float.parseFloat(resposta);.*/
        String resposta =JOptionPane.showInputDialog("base :");
        base= Float.parseFloat(resposta);
        JOptionPane.showMessageDialog(null,"base :"+base);
    }
    
}
