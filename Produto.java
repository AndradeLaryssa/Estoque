package estoque;

import javax.swing.JOptionPane;

public class Produto {
    private String codigo_produto;
    private String nome_produto;
    private Familia familia = new Familia();
    private Categoria categoria = new Categoria();
            
    
    public void cadastrar_produto() {
        this.codigo_produto = JOptionPane.showInputDialog("Código do produto: ");
        this.nome_produto = JOptionPane.showInputDialog("Nome do produto: ");
        familia.cadastrar_familia();
        categoria.cadastrar_categoria();
    }
    public void exibir_produto() {
        JOptionPane.showMessageDialog(null, "Código: " + this.codigo_produto + "\n Nome: " + this.nome_produto);
        familia.exibir_familia();
        categoria.exibir_categoria();
    }
}
