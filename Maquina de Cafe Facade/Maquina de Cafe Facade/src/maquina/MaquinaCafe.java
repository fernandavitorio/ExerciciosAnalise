/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

/**
 *
 * @author fernanda.vitorio
 */
import java.util.Iterator;

public interface MaquinaCafe {

    String cafeSimples();

    String cafeComCreme();

    String cafeComAcucar();

    String cafeComCremeAcucar();

    float depositarMoeda(Moeda m);

    Iterator<Moeda> getTroco();
}
