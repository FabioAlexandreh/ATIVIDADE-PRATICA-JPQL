package edu.fatec.fatecpg.ativadade2;

import edu.fatec.fatecpg.ativadade2.model.Comentario;
import edu.fatec.fatecpg.ativadade2.model.Post;
import edu.fatec.fatecpg.ativadade2.repository.ComentarioRepository;
import edu.fatec.fatecpg.ativadade2.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ativadade2Application implements CommandLineRunner {
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private ComentarioRepository comentarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(Ativadade2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ok!");

// 		**CRIA O OBJETO E SALVA NO BANCO**

//		Post post = new Post("Artigo 3", "KKKKKKKKKKKKKKKKKKKKKK");
//		Comentario comentario1 = new Comentario("Amei","Muito bom o artigo");
//		post.setComentario(comentario1);
//		postRepository.save(post);

//		**ADD COMENTARIO AO POST**

//		Post cm1 = postRepository.findAllById(2);
//		Comentario comentario1 = new Comentario("Odiei","Post Lixo");
//		cm1.setComentario(comentario1);
//		postRepository.save(cm1);

// 		**LISTANDO TODOS OS POST + COMENTARIOS**
//		List<Post> comentarios = postRepository.findAll();
//		comentarios.forEach(System.out::println);

// 		**LISTANDO O COMENTARIO POR UM ID **
//		Comentario cm = comentarioRepository.findAllById(1);
//		System.out.println(cm);

//		**LISTANDO OS COMENTARIOS DO POST POR UM ID DO POST **
//		Post cm = postRepository.findAllById(1);
//		System.out.println(cm);

// 		**LISTANDO O POST por uma palavra **
//		List<Post> consulta = postRepository.findPostByWord("bla");
//		consulta.forEach(System.out::println);





	}
}
