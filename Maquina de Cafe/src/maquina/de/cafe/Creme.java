/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina.de.cafe;

import java.time.Clock;

/**
 *
 * @author fernanda.vitorio
 */
public class Creme extends CafeDecorator {

    public Creme(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Café com creme!");
    }

    @Override
    public int getPreco() {
        return 1 + super.getPreco();
    }
}
