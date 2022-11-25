package service;

import java.util.List;

public interface CrudService<T,K> {
    void adicionar (T entity);
    void atualizar (T entity);
    T buscarPorId(K id);
    List<T> buscarTodos();
    void remover(K id);
}
