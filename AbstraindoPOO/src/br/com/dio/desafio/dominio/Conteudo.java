package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    /*
    OS SEUS FILHOS VAO TER ACESSO
     */
    protected static final  double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
