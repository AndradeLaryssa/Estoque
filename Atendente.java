package estoque;

import javax.swing.JOptionPane;

public class Atendente extends Funcionarios {
    private String cargo;

    public void cadastrar_atendente(){
        super.cadastrar_funcionario();
        this.cargo = "Atendente";
    }

    public void exibir_atendente(){
        super.exibir_funcionario();
        JOptionPane.showMessageDialog(null, "Cargo: " + this.cargo);
    }
}
