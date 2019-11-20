package com.db1.db1start;

import java.util.Date;
import java.util.List;

public class Aula {
    private Date data;
    private Materia materia;
    private List<Aluno> alunos;

    public Aula(Date data, Materia materia, List<Aluno> alunos) {
        verificadorDeNulo(data, "Data");
        verificadorDeNulo(materia, "Materia");
        verificadorDeNulo(alunos, "Alunos");
        this.data = data;
        this.materia = materia;
        this.alunos = alunos;
    }

    public Date getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    private void verificadorDeNulo(Object variavel, String campo) {
        if (variavel == null) {
            throw new CampoNaoPodeSerNulo( campo +" não pode ser nulo");
        }
    }
    @Override
    public String toString() {
        return "Aula{" +
                "data=" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}
