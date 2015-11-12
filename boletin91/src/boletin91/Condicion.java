
package boletin91;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Condicion {
    private int neg=0;
    private int pos=0;
    private int cero=0;
    
    public void compararNumero(){
        for (int cont=0;cont<10;cont++){
            String dato= JOptionPane.showInputDialog("Introduzca numero"+(cont+1));
            double valor=Double.parseDouble(dato);
            
            if (valor>0){
                pos++;
                
            }
            
            if (valor<0){
                neg++;
            }
            
            if (valor==0){
                cero++;
            }
            
                    
    }
    } 
    
    public void mostradorNumeros(){
        JOptionPane.showMessageDialog(null,"Hay "+pos+" positivos");
        JOptionPane.showMessageDialog(null,"Hay "+neg+" negativos");
        JOptionPane.showMessageDialog(null,"Hay "+cero+" ceros");
        
    }   
    }