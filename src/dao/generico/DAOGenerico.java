package dao.generico;

import java.util.List;

public interface DAOGenerico<T,K> {
    void adicionar (T entity);
    void atualizar (T entity);
    T buscarPorId(K id);
    List<T> buscarTodos();
    void remover(K id);
}
