package com.db1.db1start;

public class Professor extends Pessoa {

    protected Double salario;

    public Professor(String email, String nome) {
        super(email, nome);
    }

    public Professor() {

    }

    public Double getSalario() {
        return salario;
    }
}
