/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NFAvon extends NF {
    float getLucro(){
        return lucro;
    }
     void getlucro(){
        
        JOptionPane.showMessageDialog(null,"Seu lucro é de : "+lucro);
    }
    
}
