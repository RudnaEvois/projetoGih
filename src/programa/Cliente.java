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
public class Cliente {
    String nome;
    String cod;
    String telefone;
    
    void Cliente(String cod, String nome, String telefone){
        this.cod=cod;
        this.nome=nome;
        this.telefone=telefone;
    }
    void setCod(){
        
        String cod=lerString("Digite o código da cliente:");
        this.cod=cod;
        
    }
    String getCod(){
        return cod;
    }
    void setNome(){
        String nome=lerString("Digite o nome da cliente: ");
       this.nome=nome; 
    }
    String getNome(){
        return nome;
    }
    void setTelefone(){
        String telefone=lerString("Digite o telefone da cliente: ");
        this.telefone=telefone;
    }
    String getTelefone(){
        return telefone;
    }
    void dados(){
        JOptionPane.showMessageDialog(null,"O código do cliente é: "+cod+" \n O nome é: "+nome+" \n O telefone: "+telefone);
    }
  static void escreva(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    static int lerInt(String texto){
        int valor;
        valor=Integer.parseInt(JOptionPane.showInputDialog(texto));
        return valor;
    }
    static String lerString(String texto){
        String valor;
        valor=JOptionPane.showInputDialog(texto);
        return valor;
    }
    static float lerReal(String texto){
        float valor;
        valor=Float.parseFloat(JOptionPane.showInputDialog(texto));
        return valor;
    }
    

    
}
