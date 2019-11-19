package com.db1.db1start;

public class Professor extends Pessoa {

    public Double salario;

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
