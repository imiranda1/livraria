import dao.impl.CaixaDAOImpl;
import dao.impl.EstoqueDAOImpl;
import dao.impl.ProdutoDAOImpl;
import model.*;
import service.EstoqueService;
import service.Impl.EstoqueServiceImpl;
import service.Impl.ProdutoServiceImpl;
import service.Impl.VendaService;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ProdutoDAOImpl produtoDAO = new ProdutoDAOImpl();
        EstoqueDAOImpl estoqueDAO = new EstoqueDAOImpl();
        CaixaDAOImpl caixaDAO = new CaixaDAOImpl();

        VendaService vendaService = new VendaService();
        ProdutoServiceImpl produtoService = new ProdutoServiceImpl(produtoDAO);
        EstoqueService estoqueService = new EstoqueServiceImpl(estoqueDAO);


        Livro livro = new Livro(1,"SOLID",200.00);
        livro.setEscritor("Lincoln");
        livro.setEditora("Leiturinha");
        livro.addGenero("Ação", "Policial");

        produtoService.adicionar(livro);


        Livro livro2 = new Livro(2,"Livro Dois",100.00);
        livro2.setEscritor("Michel");
        livro2.setEditora("Leiturinha");
        livro2.addGenero("Romance");

        produtoService.adicionar(livro2);

        Filme filme = new Filme(3,"Filme",600.00);
        filme.setEstudio("Walt Disney");
        filme.setClassificacaoAdulto(Boolean.TRUE);
        produtoService.adicionar(filme);

        ProdutosEstoque pe1 = new ProdutosEstoque(livro,2);
        ProdutosEstoque pe2 = new ProdutosEstoque(livro2,5);
        ProdutosEstoque pe3 = new ProdutosEstoque(filme,10);

        estoqueService.adicionar(pe1);
        estoqueService.adicionar(pe2);
        estoqueService.adicionar(pe3);


        Produto p = produtoService.buscarPorId(2);
        p.setNome("Nome Alterado");
        produtoService.atualizar(p);

        ProdutoVenda pv = new ProdutoVenda(livro,2);

        //System.out.println(produtoService.buscarTodos());

        System.out.println(estoqueService.buscarTodos());

        ProdutoVenda pv2 = new ProdutoVenda(filme,3);

        vendaService.realizarVenda(pv,estoqueDAO,caixaDAO);
        vendaService.realizarVenda(pv2,estoqueDAO,caixaDAO);


        System.out.println(caixaDAO.calcularTotalCaixa());

        System.out.println(estoqueService.buscarTodos());


        Comprador c1 = new Comprador("Nome Sobrenome", "556749886", "57236761052", dateFormat.parse("26/07/2019") );
        vendaService.realizarVenda(pv2,estoqueDAO,caixaDAO,c1);

        System.out.println(c1.getIdade());
    }
}
