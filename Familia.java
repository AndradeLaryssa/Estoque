package estoque;

import javax.swing.JOptionPane;

public class Familia{
    private String nome_familia;
    private String tipo_familia;

    public void cadastrar_familia(){
        this.nome_familia = JOptionPane.showInputDialog("Nome da Família");
        this.tipo_familia = JOptionPane.showInputDialog("Tipo da Família");
    }

    public void exibir_familia(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome_familia + "\n Tipo: " + this.tipo_familia);
    }
}
