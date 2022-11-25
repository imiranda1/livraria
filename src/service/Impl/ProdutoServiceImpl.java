package service.Impl;

import dao.generico.DAOGenerico;
import model.Produto;
import service.ProdutoService;

public class ProdutoServiceImpl extends AbstractCrudServiceImpl<Produto, Integer> implements ProdutoService {
    public ProdutoServiceImpl(DAOGenerico<Produto, Integer> dao) {
        super(dao);
    }
}
