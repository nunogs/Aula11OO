package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MateriaTest {

    @Test
    public void deveCrirarMateriaPeloConstrutor(){
        String nome = "POO";
        String descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        Double cargaHoraria = 10.5;
        Professor professor = new Professor("igor.silva@bd1.com.br", "Igor Silva");
        Integer quantidaDedeAulas  = 3;
        Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo, Herança" ,
                10.5, professor ,
                3);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(professor, materia.getProfessor());
        Assert.assertEquals(quantidaDedeAulas, materia.getQuantidaDedeAulas());
    }

    @Test
    public void deveCriarExecaoComNomeNulo(){
        try{
            new Materia( null , "ABS" ,
                    10.5, new Professor() ,
                    3);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarExecaoComDescricaoNulo(){
        try{
            new Materia( "POO", null,
                    10.5, new Professor() ,
                    3);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Descricao não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarExecaoComCargaHorariaNulo(){
        try{
            new Materia( "POO", "ABS",
                    null, new Professor() ,
                    3);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Carga horaria não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarExecaoComProfessorNulo(){
        try{
            new Materia( "POO", "ABS",
                    10.5, null ,
                    3);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveCriarExecaoComQuantidadeDeAulasNulo(){
        try{
            new Materia( "POO", "ABS",
                    10.5, new Professor() ,
                    null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de aulas não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
}