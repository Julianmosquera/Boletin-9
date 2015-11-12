
package boletin92;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Condicion2 { 
    
    public void calculator(){
       int i;
       int su=0;
       double pro=1;
       
        for (i=10; i<=90; i++){
            su=i+su;
            pro=i*pro;}
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros es: "+su);
        JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros es: "+pro);
    }
}
