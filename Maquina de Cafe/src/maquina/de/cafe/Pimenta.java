/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina.de.cafe;

/**
 *
 * @author fernanda.vitorio
 */
public class Pimenta extends CafeDecorator {

    public Pimenta(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Café com pimenta!");
    }

    @Override
    public int getPreco() {
        return 5 + super.getPreco();
    }

}
