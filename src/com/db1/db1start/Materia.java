package com.db1.db1start;

public class Materia {

    private String nome;
    private String descricao;
    private Double cargaHoraria;
    private Professor professor;
    private Integer quantidaDedeAulas;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Integer getQuantidaDedeAulas() {
        return quantidaDedeAulas;
    }

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidaDedeAulas) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidaDedeAulas = quantidaDedeAulas;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                ", quantidaDedeAulas=" + quantidaDedeAulas +
                '}';
    }
}