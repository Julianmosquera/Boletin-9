
package boletin94;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Tabla {

    public int getNumero(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        
    }
    
public void calculator(){
    int num;
    num=getNumero();
    
   if (num!=0){
       for (int i=1;i<=10;i++){
           
        JOptionPane.showMessageDialog(null,num+"*"+i+"="+i*num);
       }
   } 
   else 
       
       JOptionPane.showMessageDialog(null,"Ha salido del porgrama");
      
   
    
    
}    
    
    
    
    
}
