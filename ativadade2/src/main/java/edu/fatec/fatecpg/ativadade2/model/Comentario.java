package edu.fatec.fatecpg.ativadade2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Comentario;
    private String titulo;
    private String comentario;
    @ManyToOne
    private Post post;


    public Comentario(){}

    public Comentario(String titulo, String comentario) {
        this.titulo = titulo;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getId() {
        return Id_Comentario;
    }

    public void setId(Long id) {
        Id_Comentario = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "Id_Comentario=" + Id_Comentario +
                ", titulo='" + titulo + '\'' +
                ", comentario='" + comentario +'}';
    }
}
