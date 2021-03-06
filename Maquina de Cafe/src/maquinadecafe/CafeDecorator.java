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
public abstract class CafeDecorator extends Cafe {

    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public void preparar() {
        cafe.preparar();
    }

    public int getPreco() {
        return cafe.getPreco();
    }
}
