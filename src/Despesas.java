public class Despesas extends Transacao {
    private String categoria;

    public Despesas(double valor, String data, String descricao, String categoria) {
        super(valor, data, descricao);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Despesa - Data: " + getData() + ", Descrição: " + getDescricao() + ", Valor: " + getValor() + ", Categoria: "+getCategoria());

    }
}
