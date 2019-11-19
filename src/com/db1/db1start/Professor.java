package com.db1.db1start;

public class Professor extends Pessoa {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public Professor(String email, String nome) {
        super(email, nome);
    }


}
