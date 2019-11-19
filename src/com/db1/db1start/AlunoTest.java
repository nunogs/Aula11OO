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

}