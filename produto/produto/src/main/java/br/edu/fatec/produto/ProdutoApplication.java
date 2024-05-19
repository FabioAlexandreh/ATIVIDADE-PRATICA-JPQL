package br.edu.fatec.produto;

import br.edu.fatec.produto.model.Categoria;
import br.edu.fatec.produto.model.Produto;
import br.edu.fatec.produto.repository.CategoriaRepository;
import br.edu.fatec.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProdutoApplication implements CommandLineRunner {
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("OK");
//		Categoria categoria1 = new Categoria("Televisão");
//		Produto produto1 = new Produto("LG",5000.00,"SmartTV");
//		categoria1.setProduto(produto1);
//		categoriaRepository.save(categoria1);

//		Categoria c1 = categoriaRepository.findAllById(3);
//		Produto p1 = new Produto("Sansung",6000.00,"SmartTV");
//		c1.setProduto(p1);
//		categoriaRepository.save(c1);

//		List<Produto> produtos = categoriaRepository.findAllById(3).getProduto();
//		produtos.forEach(System.out::println);

		List<Categoria> consulta = categoriaRepository.findByNomeStartingWith("");
		consulta.forEach(System.out::println);




	}
}
