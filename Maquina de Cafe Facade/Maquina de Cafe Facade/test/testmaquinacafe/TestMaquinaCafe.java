/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaquinacafe;

import maquina.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author fernanda.vitorio
 */
public class TestMaquinaCafe {

    private Maquina maq;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMaquinaGeral() {
        maq = new Maquina();
        System.out.println("Criando Máquina Geral");
        maq.run();
    }

}
