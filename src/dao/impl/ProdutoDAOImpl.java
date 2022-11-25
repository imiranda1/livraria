package dao.impl;

import dao.ProdutoDAO;
import model.Livro;
import model.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {

    private HashMap<Integer, Produto> produtosMock = new HashMap<>();

    @Override
    public void adicionar(Produto produto) {
        produtosMock.put(produto.getId(),produto);
    }

    @Override
    public void atualizar(Produto produto) {
        produtosMock.put(produto.getId(),produto);
    }

    @Override
    public Produto buscarPorId(Integer id) {
        if (produtosMock.containsKey(id)){
            return produtosMock.get(id);
        }
        return null;
    }

    @Override
    public List<Produto> buscarTodos() {
        return new ArrayList(produtosMock.values());
    }

    @Override
    public void remover(Integer id) {
        if(produtosMock.containsKey(id)){
            produtosMock.remove(id);
        }
    }
}
