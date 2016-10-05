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
public class ClienteAvon extends Cliente{
    void ClienteAvon(String cod, String nome, String telefone){
        this.cod=cod;
        this.nome=nome;
        this.telefone=telefone;
    }
    
    void dadosCAvon(){
        JOptionPane.showMessageDialog(null,"O código do cliente é: "+cod+" \n O nome é: "+nome+" \n O telefone: "+telefone);
    }
}
