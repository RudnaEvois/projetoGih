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
public class NF {

    String nomep;
    int codp, quant, codnota;
    float valorcompra, valorvenda, lucro, totaldevenda, totaldecompra;

    void NF(int codp, String nomep, int quant, float valorcompra, float valorvenda) {
        this.codp = codp;
        this.nomep = nomep;
        this.quant = quant;
        this.valorcompra = valorcompra;
        this.valorvenda = valorvenda;
    }

    void setCodnota() {
        int codnota = lerInt("Digite o código da nota: ");
        this.codnota = codnota;
    }

    int getCodnota() {
        return codnota;
    }

    void setCodp() {
        int codp = lerInt("Digite o código do produto: ");
        this.codp = codp;

    }

    int getCodp() {
        return codp;
    }

    void setNomep() {
        String nomep = lerString("Digite o nome do produto: ");
        this.nomep = nomep;
    }

    String getNomep() {
        return nomep;
    }

    void setQuant() {
        int quantidade = lerInt("Digite a quantidade de produtos: ");
        this.quant = quantidade;
    }

    int getQuant() {
        return quant;
    }

    void setValorvenda() {
        float valorvenda = lerReal("Digite o valor de venda do produto: ");
        this.valorvenda = valorvenda * quant;
    }

    float getValorvenda() {
        return valorvenda;
    }

    void setTotaldeVenda() {
        this.totaldevenda = this.valorvenda * quant;
    }

    float getTotaldeVenda() {
        return totaldevenda;
    }

    void setValorCompra() {
        float valorcompra = lerReal("Digite o valor de custo do produto: ");
        this.valorcompra = valorcompra * quant;
    }

    float gerValorCompra() {
        return valorcompra;
    }

    void setTotaldeCompra() {
        this.totaldecompra = this.valorcompra * quant;
    }

    float getTotaldeCompra() {
        return totaldecompra;
    }

    void lucro() {
        float lucro = this.valorvenda - this.valorcompra;
        this.lucro += lucro;
    }

    float getLucro() {
        return lucro;

    }

    void getlucro() {

        JOptionPane.showMessageDialog(null, lucro);
    }

    static void escreva(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    static int lerInt(String texto) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(texto));
        return valor;
    }

    static String lerString(String texto) {
        String valor;
        valor = JOptionPane.showInputDialog(texto);
        return valor;
    }

    static float lerReal(String texto) {
        float valor;
        valor = Float.parseFloat(JOptionPane.showInputDialog(texto));
        return valor;
    }

}
