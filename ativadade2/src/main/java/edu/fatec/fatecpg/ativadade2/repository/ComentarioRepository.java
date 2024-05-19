package edu.fatec.fatecpg.ativadade2.repository;

import edu.fatec.fatecpg.ativadade2.model.Comentario;
import edu.fatec.fatecpg.ativadade2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    Comentario findAllById(int id);
}
