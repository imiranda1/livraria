package model;

import dao.Teste;

import java.math.BigDecimal;

public abstract class Produto extends Teste {
    private Integer id;
    private String nome;
    private Double preco;
    private Boolean classificacaoAdulto;

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }



    public Produto() {
    }

    public Produto(Integer id, String nome, Double preco, Boolean classificacaoAdulto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.classificacaoAdulto = classificacaoAdulto;
    }

    public Boolean getClassificacaoAdulto() {
        return classificacaoAdulto;
    }

    public void setClassificacaoAdulto(Boolean classificacaoAdulto) {
        this.classificacaoAdulto = classificacaoAdulto;
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
