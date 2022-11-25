package service.Impl;

import dao.CaixaDAO;
import dao.EstoqueDAO;
import dao.impl.CaixaDAOImpl;
import dao.impl.EstoqueDAOImpl;
import model.Comprador;
import model.ProdutoVenda;
import model.ProdutosEstoque;

public class VendaService implements service.VendaService {


    @Override
    public void realizarVenda(ProdutoVenda pv, EstoqueDAO estoqueDAO, CaixaDAO caixaDAO) {
        ProdutosEstoque pe = estoqueDAO.buscarPorId(pv.getProduto().getId());
        pe.setQuantidade(pe.getQuantidade()- pv.getQuantidade());
        estoqueDAO.atualizar(pe);
        caixaDAO.adicionar(pv);
    }

    @Override
    public void realizarVenda(ProdutoVenda pv, EstoqueDAO estoqueDAO, CaixaDAO caixaDAO, Comprador comprador) {
        if (pv.getProduto().getClassificacaoAdulto() && comprador.getIdade() > 18) {
            ProdutosEstoque pe = estoqueDAO.buscarPorId(pv.getProduto().getId());
            pe.setQuantidade(pe.getQuantidade() - pv.getQuantidade());
            estoqueDAO.atualizar(pe);
            caixaDAO.adicionar(pv);
        }
        else{
            throw new RuntimeException("Não é possível realizar a venda");
        }
    }
}
