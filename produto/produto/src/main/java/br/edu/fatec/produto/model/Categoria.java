package br.edu.fatec.produto.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Produto> produto = new ArrayList<>();

    public Categoria(String titulo) {
        this.titulo = titulo;
    }
    public Categoria(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        produto.setCategoria(this);
        this.produto.add(produto);
    }
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", produto=" + produto +
                '}';
    }


}
