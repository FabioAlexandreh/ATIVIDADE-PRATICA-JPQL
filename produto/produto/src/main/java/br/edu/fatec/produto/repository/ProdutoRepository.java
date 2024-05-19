package br.edu.fatec.produto.repository;


import br.edu.fatec.produto.model.Categoria;
import br.edu.fatec.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    Produto findAllById(int id);
}
