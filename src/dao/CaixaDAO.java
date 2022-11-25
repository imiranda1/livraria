package dao;

import dao.generico.DAOGenerico;
import model.ProdutoVenda;
import model.ProdutosEstoque;

import java.math.BigDecimal;

public interface CaixaDAO extends DAOGenerico<ProdutoVenda,Integer> {

    Double calcularTotalCaixa();
}
