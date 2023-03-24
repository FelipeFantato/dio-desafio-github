package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validadeCalculoIdade(){

        Pessoa pessoa = new Pessoa("Jose", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(3,pessoa.getIdade());
    }
    @Test
    void deveRetornarSeEMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Jose", LocalDate.of(2001, 1, 1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }
}
