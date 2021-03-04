package estoque;

import javax.swing.JOptionPane;

public class Funcionarios{
    private String nome_funcionario;
    private String cpf_funcionario;

    public void cadastrar_funcionario(){
        this.nome_funcionario = JOptionPane.showInputDialog("Nome do Funcionário");
        this.cpf_funcionario = JOptionPane.showInputDialog("CPF do Funcionário");
    }

    public void exibir_funcionario(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome_funcionario + "\n Cpf: " + this.cpf_funcionario);
    }
}
