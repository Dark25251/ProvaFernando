package com.aula.classe;

public class Jogos {
    private Integer id;
    private String nome;
    private String genero;

    public Jogos(Integer id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public Jogos() {

    }

    public Integer getId(int i) {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return nome;
    }
}
