package service;

import dao.CaixaDAO;
import dao.EstoqueDAO;
import model.Comprador;
import model.ProdutoVenda;

public interface VendaService{

    void realizarVenda(ProdutoVenda pv, EstoqueDAO estoqueDAO, CaixaDAO caixaDAO);
    void realizarVenda(ProdutoVenda pv, EstoqueDAO estoqueDAO, CaixaDAO caixaDAO, Comprador comprador);

}
