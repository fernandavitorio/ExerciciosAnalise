/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecafe;

/**
 *
 * @author fernanda.vitorio
 */
public class CafeComCreme extends CafeDecorator {

    public CafeComCreme(final Cafe cafe) {
        super(new Creme(new Acucar(cafe)));
    }

}
