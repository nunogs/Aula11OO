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

}