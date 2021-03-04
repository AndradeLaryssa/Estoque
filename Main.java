package estoque;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Gerente> lista_gerente = new ArrayList<>();
        List<Vendedor> lista_vendedor = new ArrayList<>();
        List<Atendente> lista_atendente = new ArrayList<>();
        List<Produto> lista_produto = new ArrayList<>();
        List<Clientes> lista_clientes = new ArrayList<>();
        
        while (true) {
             // cadastrar ou exibir funcionário, produto e cliente
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Funcionário | 2- Cadastrar Produto | 3- Cadastrar Cliente | 4- Exibir Funcionário | 5- Exibir Produto | 6- Exibir Cliente"));
            switch(menu){
                case 1: //cadastrar funcionario
                    //tipo de funcionário
                    int tipo1 = Integer.parseInt(JOptionPane.showInputDialog("Tipo de funcionário: [1- Gerente | 2- Vendedor | 3- Atendente]"));
                    switch(tipo1){
                        case 1: //gerente
                            Gerente gerente = new Gerente();
                            gerente.cadastrar_gerente();
                            lista_gerente.add(gerente);
                            break;
                        case 2: //vendedor
                            Vendedor vendedor = new Vendedor();
                            vendedor.cadastrar_vendedor();
                            lista_vendedor.add(vendedor);
                            break;
                        case 3: //atendente
                            Atendente atendente = new Atendente();
                            atendente.cadastrar_atendente();
                            lista_atendente.add(atendente); 
                            break;
                    }
                    break;
                    
                case 2: //cadastrar produto
                    Produto produto = new Produto();
                    produto.cadastrar_produto();
                    lista_produto.add(produto);
                    break;
                    
                case 3: //cadastrar cliente
                     Clientes clientes = new Clientes();
                     clientes.cadastrar_cliente();
                     lista_clientes.add(clientes);
                     break;
                     
                case 4: //exibir funcionario
                     //tipo de funcionário
                     int tipo2 = Integer.parseInt(JOptionPane.showInputDialog("Tipo de funcionário: [1- Gerente | 2- Vendedor | 3- Atendente]"));
                     switch(tipo2){
                         case 1: //gerente
                            for(Gerente gerente : lista_gerente) {
                                gerente.exibir_gerente();   
                                }
                            break;
                         case 2: //vendedor
                             for(Vendedor vendedor : lista_vendedor) {
                                 vendedor.exibir_vendedor();
                             }
                             break;
                         case 3: //atendente
                             for(Atendente atendente : lista_atendente) {
                                 atendente.exibir_atendente();
                             }
                             break;   
                     
                     }
                     break;
                             
                case 5: //exibir produto
                    for(Produto p : lista_produto) {
                        p.exibir_produto();
                    }
                    break;
                   
                    
                case 6: //exibir cliente
                    for(Clientes c : lista_clientes) {
                        c.exibir_cliente();
                    }
                    break;
    
            }
        }
    }
}

