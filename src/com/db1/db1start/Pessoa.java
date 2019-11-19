package com.db1.db1start;

public abstract class Pessoa {

    public String email;
    public String nome;

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}