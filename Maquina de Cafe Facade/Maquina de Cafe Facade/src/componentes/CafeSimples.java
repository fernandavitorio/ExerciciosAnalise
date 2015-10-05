/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author fernanda.vitorio
 */
public class CafeSimples extends Cafe {

    @Override
    public void preparar() {
        System.out.println("Café preto!");

    }

    @Override
    public int getPreco() {
        return 3;
    }

}
