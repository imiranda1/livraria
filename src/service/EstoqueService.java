package service;

import model.Livro;
import model.ProdutosEstoque;

import java.util.List;

public interface EstoqueService extends CrudService<ProdutosEstoque,Integer> {

    List<ProdutosEstoque> buscarPorCategoria(Class clazz);
}
