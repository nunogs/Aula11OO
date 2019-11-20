package com.db1.db1start;

public abstract class Pessoa {

    protected String email;
    protected String nome;

    public Pessoa() {
    }

    public Pessoa(String email, String nome) {

        verificadorDeNulo(email, "Email");
        verificadorDeNulo(nome, "Nome");

        this.email = email;
        this.nome = nome;
    }

    private void verificadorDeNulo(Object variavel, String campo) {
        if (variavel == null) {
            throw new CampoNaoPodeSerNulo( campo +" não pode ser nulo");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}