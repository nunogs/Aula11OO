package com.db1.db1start;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Professor professor;
    public Integer quantidaDedeAulas;

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