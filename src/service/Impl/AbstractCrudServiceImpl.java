package service.Impl;

import dao.generico.DAOGenerico;
import service.CrudService;

import java.util.List;

public abstract class AbstractCrudServiceImpl<T,K> implements CrudService<T, K> {

    private DAOGenerico<T,K> dao;

    public AbstractCrudServiceImpl(DAOGenerico<T, K> dao) {
        this.dao = dao;
    }

    @Override
    public void adicionar(T entity) {
        dao.adicionar(entity);
    }

    @Override
    public void atualizar(T entity) {
        dao.atualizar(entity);

    }

    @Override
    public T buscarPorId(K id) {
        return dao.buscarPorId(id);
    }

    @Override
    public List<T> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public void remover(K id) {
        dao.remover(id);
    }
}
