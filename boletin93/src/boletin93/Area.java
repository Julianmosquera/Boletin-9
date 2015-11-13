
package boletin93;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Area {
    
    public float ponerBase(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introducir base: "));
        
    }
    
    public float ponerAltura(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura :"));
    }
  
    public void calcular(){
        float base=ponerBase();
        float altura=ponerAltura();
           
    
    if (base>=0&&altura>=0){
        JOptionPane.showMessageDialog(null,"El area es igual a: "+base*altura);
        
    }
    else { JOptionPane.showMessageDialog(null, "ERROR solo numeros positivos");
        
    }
        
        
        
    
    }
    
   
    
}
