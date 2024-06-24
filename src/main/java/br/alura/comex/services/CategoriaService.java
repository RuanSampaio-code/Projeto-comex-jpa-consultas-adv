package br.alura.comex.services;

import br.alura.comex.dao.CategoriaDao;
import br.alura.comex.models.Categoria;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaService {

    EntityManager em ;

    private CategoriaDao categoriaDao;


    public CategoriaService(EntityManager entityManager){
        this.categoriaDao =  new CategoriaDao(entityManager );
    }

    public void efetuaCadastroDeCategoria(Categoria categoria) {

    }
    public List<Categoria> listarTodas() {

        return this.categoriaDao.listarTodas();
    }


    public Categoria buscarID(Long id) {
        Categoria busca = categoriaDao.buscarID(id);
        if(busca==null){
            System.out.println("Categoria não encontrada com o ID informado.");

        }
        return busca;
    }




    public void removerCategoria(Long id) {
        categoriaDao.remover(id);
    }


    public void alteracaoDeCategoria(Long id, Categoria categoriaAlterada) {
        this.categoriaDao.alterar(id, categoriaAlterada);
    }
}
