package dao.impl;

import dao.EstoqueDAO;
import model.ProdutosEstoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EstoqueDAOImpl implements EstoqueDAO {

    private HashMap<Integer, ProdutosEstoque> estoque = new HashMap<>();

    @Override
    public void adicionar(ProdutosEstoque p) {
        estoque.put(p.getProduto().getId(),p);
    }

    @Override
    public void atualizar(ProdutosEstoque p) {
        estoque.put(p.getProduto().getId(),p);
    }


    public ProdutosEstoque buscarPorId(Integer id) {
        if (estoque.containsKey(id)){
            return estoque.get(id);
        }
        return null;
    }

    @Override
    public List<ProdutosEstoque> buscarTodos() {
        return new ArrayList(estoque.values());
    }

    @Override
    public void remover(Integer id) {
        if(estoque.containsKey(id)){
            estoque.remove(id);
        }
    }
}
