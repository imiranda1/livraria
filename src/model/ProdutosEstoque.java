package model;

public class ProdutosEstoque {
    private Produto produto;
    private Integer quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutosEstoque(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\n"+"Produto:" + produto.getNome() +
                " | categoria:" + produto.getClass().getSimpleName()+
                " | quantidade:" + quantidade +"\n";
    }
}
