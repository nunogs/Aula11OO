package com.db1.db1start;

public class Materia {

    private String nome;
    private String descricao;
    private Double cargaHoraria;
    private Professor professor;
    private Integer quantidaDedeAulas;

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidaDedeAulas) {

        testadorDeNulo(nome, "Nome");
        testadorDeNulo(descricao, "Descricao");
        testadorDeNulo(cargaHoraria, "Carga horaria");
        testadorDeNulo(professor, "Professor");
        testadorDeNulo(quantidaDedeAulas, "Quantidade de aulas");
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidaDedeAulas = quantidaDedeAulas;
    }

    public Materia() {

    }

    private void testadorDeNulo(Object variavel, String campo) {
        if (variavel == null) {
            throw new CampoNaoPodeSerNulo( campo +" não pode ser nulo");
        }
    }

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