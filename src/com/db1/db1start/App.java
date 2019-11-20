package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ("maiko.cunha@bd1.com.br" ,"Maiko Cunha");

        Aluno aluno2 = new Aluno ("joao.silva@bd1.com.br", "João Silva");

        Professor professor = new Professor("igor.silva@bd1.com.br", "Igor Silva");

        Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo, Herança" ,
                10.5, professor ,
                3);

        List<Aluno> alunos= new ArrayList<Aluno>();
        Date data = new Date();

        alunos.addAll(Arrays.asList(aluno1,aluno2));
        Aula aula = new Aula(data , materia, alunos);

        System.out.println(aula);


    }
}
