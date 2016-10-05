/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import javax.swing.JOptionPane;

/**
 *
 * @author RudnaEvois
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente[] CAvon = new ClienteAvon[100];
        Cliente[] CJequiti = new ClienteJequiti[100];
        NF[] nfavon = new NFAvon[100];
        NF[] nfjequiti = new NFJequiti[100];
        NFAvon nfa = new NFAvon();
        NFJequiti jqt = new NFJequiti();
        int menu = 0;
        while (menu == 0) {
            int escolha = lerInt("O que deseja fazer?: \n 1- Cadastrar \n 2- Consultar \n 3-Sair");
            switch (escolha) {
                case 1:
                    menu = 1;
                    break;
                case 2:
                    menu = 2;
                    break;
                case 3:
                    menu = 100;
                    break;
            }

            while (menu == 1) { //cadastra
                int escolha1 = lerInt("CADASTRO: \n O que deseja fazer? \n 1- Cadastrar Cliente \n 2- Cadastrar Nota Fiscal \n 3- Voltar \n 4- Sair");
                switch (escolha1) {
                    case 1:
                        menu = 11;
                        break;
                    case 2:
                        menu = 12;
                        break;
                    case 3:
                        menu = 0;
                        break;
                    case 4:
                        menu = 100;
                        break;
                }
            }
            while (menu == 11) {//cadastrar cliente
                int escolha1_1 = lerInt("Deseja cadastrar clientes: \n 1- Avon \n 2- Jequiti \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                switch (escolha1_1) {
                    case 1:
                        menu = 111;//cadastrar cliente avon
                        break;
                    case 2:
                        menu = 112;//cadastrar cliente jequiti
                        break;
                    case 3:
                        menu = 1;
                        break;
                    case 4:
                        menu = 0;
                        break;
                    case 5:
                        menu = 100;
                        break;
                }
                while (menu == 111) { //cadastrar cliente avon
                    int x = 100;
                    int z = 0;

                    for (int i = z; i <= x; i++) {
                        if (CAvon[i] == null) {
                            x++;

                            CAvon[i] = new ClienteAvon();
                            CAvon[i].setCod();
                            CAvon[i].setNome();
                            CAvon[i].setTelefone();
                        }
                        int q = lerInt("Deseja cadastrar mais 1 cliente Avon? \n 1-Sim \n 2-Não");
                        switch (q) {
                            case 1:

                                menu = 111;
                                break;
                            case 2:
                                x = 0;
                                menu = 0;
                                break;

                        }
                    }
                }
                while (menu == 112) { //cadastrar cliente Jequiti
                    int x = 100;
                    int z = 0;

                    for (int i = z; i <= x; i++) {
                        if (CJequiti[i] == null) {
                            x++;

                            CJequiti[i] = new ClienteJequiti();
                            CJequiti[i].setCod();
                            CJequiti[i].setNome();
                            CJequiti[i].setTelefone();
                        }
                        int q = lerInt("Deseja cadastrar mais 1 cliente? \n 1-Sim \n 2-Não");
                        switch (q) {
                            case 1:

                                menu = 112;
                                break;
                            case 2:
                                x = 0;
                                menu = 0;
                                break;
                        }
                    }
                }
            }
            while (menu == 12) { //Cadastrar NF
                int escolha1_2 = lerInt("Deseja cadastrar Nota Fiscal: \n 1- Avon \n 2- Jequiti \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                switch (escolha1_2) {
                    case 1:
                        menu = 121;
                        break;
                    case 2:
                        menu = 122;
                        break;
                    case 3:
                        menu = 1;
                        break;
                    case 4:
                        menu = 0;
                        break;
                    case 5:
                        menu = 100;
                        break;
                }

                while (menu == 121) {//Cadastro NF Avon
                    int x = 100;
                    int z = 0;
                    nfa.setCodnota();
                    for (int i = z; i <= x; i++) {
                        if (nfavon[i] == null) {
                            x++;

                            nfavon[i] = new NFAvon();
                            nfavon[i].codnota = nfa.getCodnota();
                            nfavon[i].setCodp();
                            nfavon[i].setNomep();
                            nfavon[i].setQuant();
                            nfavon[i].setValorCompra();
                            nfavon[i].setValorvenda();
                            nfavon[i].lucro();
                            nfavon[i].getlucro();
                        }
                        int q = lerInt("Deseja cadastrar mais 1 produto na nota? \n 1-Sim \n 2-Não");
                        switch (q) {
                            case 1:

                                menu = 121;
                                break;
                            case 2:

                                x = 0;
                                menu = 0;
                                break;
                        }
                    }
                }
                while (menu == 122) {//Cadastro NF Jequiti
                    int x = 100;
                    int z = 0;
                    jqt.setCodnota();
                    for (int i = z; i <= x; i++) {
                        if (nfjequiti[i] == null) {
                            x++;

                            nfjequiti[i] = new NFJequiti();
                            nfjequiti[i].codnota = jqt.getCodnota();
                            nfjequiti[i].setCodp();
                            nfjequiti[i].setNomep();
                            nfjequiti[i].setQuant();
                            nfjequiti[i].setValorCompra();
                            nfjequiti[i].setValorvenda();
                            nfjequiti[i].lucro();
                            nfjequiti[i].getLucro();
                        }
                        int q = lerInt("Deseja cadastrar mais 1 produto da nota? \n 1-Sim \n 2-Não");
                        switch (q) {
                            case 1:

                                menu = 122;
                                break;
                            case 2:

                                x = 0;
                                menu = 0;
                                break;
                        }
                    }
                }
            }

            while (menu == 2) { //consulta
                int escolha2 = lerInt("CONSULTA: \n O que deseja fazer? \n 1- Consultar Cliente \n 2- Consultar produto na Nota Fiscal \n 3- Voltar \n 4- Sair");
                switch (escolha2) {
                    case 1:
                        menu = 21;
                        break;
                    case 2:
                        menu = 22;
                        break;
                    case 3:
                        menu = 0;
                        break;
                    case 4:
                        menu = 100;
                        break;
                }

                while (menu == 21) { //Consultar cliente
                    int escolha2_1 = lerInt("Deseja consultar Cliente: \n 1- Avon \n 2- Jequiti \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                    switch (escolha2_1) {
                        case 1:
                            menu = 211;
                            break;
                        case 2:
                            menu = 212;
                            break;
                        case 3:
                            menu = 2;
                            break;
                        case 4:
                            menu = 0;
                            break;
                        case 5:
                            menu = 100;
                            break;
                    }
                    while (menu == 211) {//consultar cliente avon
                        int escolha2_1_1 = lerInt("-------PESQUISAR------------- \n Deseja pesquisar por: \n 1- Codigo do Cliente \n 2- Nome \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                        switch (escolha2_1_1) {
                            case 1:
                                menu = 2111;//pesquisar por codigo
                                break;
                            case 2:
                                menu = 2112;//pesquisar por nome
                                break;
                            case 3:
                                menu = 21;
                                break;
                            case 4:
                                menu = 0;
                                break;
                            case 5:
                                menu = 100;
                        }
                        while (menu == 2111) {//pesquisar cliente avon por codigo
                            String codigo = lerString("Digite o código da sua cliente avon :");

                            int x = 100;
                            for (int i = 0; i <= x; i++) {
                               boolean t=false;

                                if (codigo==CAvon[i].getCod()) {
                                    t=true;
                                    x = 0;
                                                                    }else
                                    t=false;
                                if(t=true){
                                                                    }

                            }

                        }
                        while (menu == 212) {//consultar cliente jequiti
                            int escolha2_1_2 = lerInt("-------PESQUISAR------------- \n Deseja pesquisar por: \n 1- Codigo do Cliente \n 2- Nome \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                            switch (escolha2_1_2) {
                                case 1:
                                    menu = 2121;
                                    break;
                                case 2:
                                    menu = 2122;
                                    break;
                                case 3:
                                    menu = 21;
                                    break;
                                case 4:
                                    menu = 0;
                                    break;
                                case 5:
                                    menu = 100;
                            }
                        }
                    }

                    while (menu == 22) {//Consultar NF
                        int escolha1_2 = lerInt("Deseja consultar Nota Fiscal: \n 1- Avon \n 2- Jequiti \n 3- Voltar ao menu anterior \n 4- Voltar ao menu principal \n 5- Sair");
                        switch (escolha1_2) {
                            case 1:
                                menu = 221;
                                break;
                            case 2:
                                menu = 222;
                                break;
                            case 3:
                                menu = 2;
                                break;
                            case 4:
                                menu = 0;
                                break;
                            case 5:
                                menu = 100;
                                break;
                        }
                    }

                }

            }
        }
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
