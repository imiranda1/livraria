package dao.impl;

import dao.CaixaDAO;
import dao.EstoqueDAO;
import model.ProdutoVenda;
import model.ProdutosEstoque;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CaixaDAOImpl implements CaixaDAO {

    private List<ProdutoVenda> caixa = new ArrayList<>();

    @Override
    public void adicionar(ProdutoVenda p) {
        caixa.add(p);
    }

    @Override
    public void atualizar(ProdutoVenda p) {
        caixa.add(p);
    }

    @Override
    public ProdutoVenda buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<ProdutoVenda> buscarTodos() {
        return null;
    }

    @Override
    public void remover(Integer id) {

    }


    @Override
    public Double calcularTotalCaixa() {
     return caixa.stream().mapToDouble((p)->p.getProduto().getPreco()*p.getQuantidade()).sum();
    }
}
