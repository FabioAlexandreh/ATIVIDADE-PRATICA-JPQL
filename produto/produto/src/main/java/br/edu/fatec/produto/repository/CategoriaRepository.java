package br.edu.fatec.produto.repository;

import br.edu.fatec.produto.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findAllById(int id);

    @Query(value = "SELECT * FROM categoria WHERE nome LIKE 'C'", nativeQuery = true)
    List<Categoria> findByNomeStartingWith(String letra);

}
