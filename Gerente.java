package estoque;

import javax.swing.JOptionPane;

public class Gerente extends Funcionarios {
    private String cargo;

    public void cadastrar_gerente(){
        super.cadastrar_funcionario();
        this.cargo = "Gerente";
    }

    public void exibir_gerente(){
        super.exibir_funcionario();
        JOptionPane.showMessageDialog(null, "Cargo: " + this.cargo);
    }
}
