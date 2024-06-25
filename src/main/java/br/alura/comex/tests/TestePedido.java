package br.alura.comex.tests;

import br.alura.comex.models.Pedido;
import br.alura.comex.models.Produto;
import br.alura.comex.services.PedidoService;
import br.alura.comex.services.ProdutoService;
import br.alura.comex.util.JPAUUtil;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class TestePedido {
    private static PedidoService pedidoService;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        EntityManager em = JPAUUtil.getEntityManager();
        System.out.println("BEM VINDOS AO PROJETO COMEX - CADASTRO DE PEDIDOS");

        pedidoService = new PedidoService(em);
        var opc = exibirMenu();

        while ( opc != 6){
            switch (opc) {
                case 1:
                    listarTodasPedidos();
                    break;
                case 2:
                    criarPedido();
                    break;
                case 3:
                    deletarPedido();
                    break;
                case 4:
                    atualizarPedido();
                    break;
                case 5:
                    buscarPedido();
                    break;
            }

            opc = exibirMenu();
        }

    }

    private static int exibirMenu(){

        System.out.println("""
                Escolha uma opcao :
                1 - Listar todos as Produtos
                2 - Criar uma Produtos
                3 - Deletar uma Produto
                4 - Atualizar uma Produto
                5 - Listar uma Produto
                6 - Finalizar operacoes
       
                """);

        return teclado.nextInt();

    }

    public static void listarTodasPedidos(){
        List<Pedido> produtos = pedidoService.listarCadastroDePedidos();

        produtos.stream()
                .forEach(System.out::println);
    }

    public static void efetuaCadastroDePedidos(){

    }


}
