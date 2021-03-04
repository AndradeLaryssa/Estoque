package estoque;

import javax.swing.JOptionPane;

public class Clientes{
    private String nome_cliente;
    private String cpf_cliente;

    public void cadastrar_cliente(){
        this.nome_cliente = JOptionPane.showInputDialog("Nome do Cliente");
        this.cpf_cliente = JOptionPane.showInputDialog("CPF do Cliente");
    }

    public void exibir_cliente(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome_cliente + "\n Cpf: " + this.cpf_cliente);
    }
}
