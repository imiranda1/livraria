package model;

import java.math.BigDecimal;
import java.util.List;

public class Filme extends Produto{
    private String estudio;
    private List<String> diretores;
    private List<String> generos;
    private List<String> produtores;

    public Filme(int i, String filme, Double valor) {
        super(i,filme,valor);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return '\n' +"-----------------------------" + '\n' +
                "Filme:" + getNome() + '\n' +
                "id:" + getId() + '\n' +
                "preco:" + getPreco() + '\n' +
                "estudio:" + estudio + '\n' +
                "diretores:" + diretores + '\n' +
                "generos:" + generos + '\n' +
                "produtores:" + produtores + '\n' +
                "-----------------------------";

    }
}
