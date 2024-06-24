package br.alura.comex.dao;

import br.alura.comex.interfaces.IntPedidoDao;
import br.alura.comex.models.Pedido;

import javax.persistence.EntityManager;
import java.util.List;

public class PedidoDao implements IntPedidoDao {

    private EntityManager manager;

    public PedidoDao(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void cadastra(Pedido pedido) {

    }

    @Override
    public List<Pedido> listarTodas() {
        return null;
    }

    @Override
    public Pedido buscarID(Long id) {
        return null;
    }

    @Override
    public void alterar(Long id, Pedido pedido) {

    }

    @Override
    public void remover(Long id) {

    }
}
