package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class AulaTest {

    @Test
    public void deveCriarAulaPeloConstrutor(){
        Professor professor = new Professor("igor.silva@bd1.com.br", "Igor Silva");
        Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo, Herança" ,
                10.5, professor ,
                3);
        List<Aluno> alunos= new ArrayList<Aluno>();
        Date data = new Date();
        Aula aula = new Aula(data , materia, alunos);
        Assert.assertEquals(data , aula.getData());
        Assert.assertEquals(materia , aula.getMateria());
        Assert.assertEquals(alunos, aula.getAlunos());

    }

}