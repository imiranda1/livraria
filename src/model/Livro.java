package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Livro extends Produto {
    private List<String> generos = new ArrayList<>();
    private String escritor;
    private String editora;

    public Livro(int i, String s, Double s1) {
        super(i, s, s1);
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void addGenero(String... genero) {
        this.generos.addAll(List.of(genero));
    }

    public void addGenero(String genero) {
        this.generos.add(genero);
    }

    public List<String> getGeneros() {
        return List.copyOf(generos);
    }

    @Override
    public String toString() {
        return '\n' +"-----------------------------" + '\n' +
                "Livro:" + getNome() + '\n' +
                "id:" + getId() + '\n' +
                "preco:" + getPreco() + '\n' +
                "generos:" + generos + '\n' +
                "escritor:" + escritor + '\n' +
                "editora:" + editora + '\n' +
                "-----------------------------";

    }
}
