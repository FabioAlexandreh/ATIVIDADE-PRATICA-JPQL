package edu.fatec.fatecpg.ativadade2.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    private String conteudo;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comentario> comentario = new ArrayList<>();

    public Post (){}

    public Post(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        comentario.setPost(this);
        this.comentario.add(comentario);
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", comentario=" + comentario +
                '}';
    }
}
