package estoque;

import javax.swing.JOptionPane;

public class Categoria{
    private String nome_categoria;
    private String tipo_categoria;
    private String descricao_categoria;

    public void cadastrar_categoria(){
        this.nome_categoria = JOptionPane.showInputDialog("Nome da Categoria");
        this.tipo_categoria = JOptionPane.showInputDialog("Tipo da Categoria");
        this.descricao_categoria = JOptionPane.showInputDialog("Descrição da Categoria");
    }

    public void exibir_categoria(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome_categoria + "\n Tipo: " + this.tipo_categoria + "\n Descrição: " + this.descricao_categoria);
    }
}
