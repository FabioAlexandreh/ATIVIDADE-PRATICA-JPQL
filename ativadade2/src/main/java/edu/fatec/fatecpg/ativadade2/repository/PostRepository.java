package edu.fatec.fatecpg.ativadade2.repository;

import edu.fatec.fatecpg.ativadade2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findAllById(int id);

    @Query("SELECT p FROM Post p WHERE p.titulo LIKE %:palavra% OR p.conteudo LIKE %:palavra%")
    List<Post> findPostByWord (String palavra);
}
