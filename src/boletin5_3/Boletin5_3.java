package boletin5_3;

import javax.swing.JOptionPane;

public class Boletin5_3 {

    public static void main(String[] args) {
         double radio,pi=3.14;
     String resultado=JOptionPane.showInputDialog("Radio");
     radio=Double.parseDouble(resultado);
     Circulo c=new Circulo(radio,pi);
     JOptionPane.showMessageDialog(null,"Area circulo" +c.areaCirculo()+"m");
     JOptionPane.showMessageDialog(null,"Lonxitude" +c.lonxitude() +"m²");
    }
    
}