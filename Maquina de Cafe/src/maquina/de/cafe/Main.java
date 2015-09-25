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
public class Main {

    public static void main(String[] args) {

        Cafe cafe = new Pimenta(new Creme(new Creme(new CafeSimples())));

        System.out.println(cafe.getPreco());
        cafe.preparar();

    }

}
