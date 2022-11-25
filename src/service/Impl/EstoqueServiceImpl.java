package service.Impl;

import dao.EstoqueDAO;

import model.ProdutosEstoque;
import service.EstoqueService;

import java.util.List;
import java.util.stream.Collectors;

public class EstoqueServiceImpl extends AbstractCrudServiceImpl<ProdutosEstoque, Integer> implements EstoqueService {

    public EstoqueServiceImpl(EstoqueDAO dao) {
        super(dao);
    }


    @Override
    public List<ProdutosEstoque> buscarPorCategoria(Class clazz) {
        return buscarTodos().stream().filter(p -> p.getProduto().getClass().equals(clazz))
                .collect(Collectors.toList());
    }
}
