package com.db1.db1start;

public class Aluno extends Pessoa {

    public Double nota;

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
