package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {
    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        Aluno aluno = new Aluno("maiko.cunha@bd1.com.br" ,"Maiko Cunha");
        String email = "maiko.cunha@bd1.com.br";
        String nome = "Maiko Cunha";
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }

    @Test
    public void deveCriarExecaoComEmailNulo(){
        try{
            new Aluno( null , "Jhow");
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveCriarExecaoComNomeNulo(){
        try{
            new Aluno( "jhow@gmail.com", null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
}