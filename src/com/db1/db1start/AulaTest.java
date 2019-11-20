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
        Professor professor = new Professor("123@gmail.com", "Ivãn Vanko");
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
    @Test
    public void deveCriarExecaoComDatalNulo(){
        try{
            new Aula( null , new Materia(), new ArrayList<Aluno>());
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Data não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarExecaoComMaterialNulo(){
        try{
            new Aula( new Date() , null, new ArrayList<Aluno>());
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Materia não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarExecaoComAlunoNulo(){
        try{
            new Aula( new Date() , new Materia(), null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Alunos não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveTestarPrecencaDoAluno(){

    }

}