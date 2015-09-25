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
public class Acucar extends CafeDecorator {

	public Acucar(Cafe cafe) {
		super(cafe);
	}

	@Override
	public void preparar() {
		System.out.println("Café com açucar");
		super.preparar();
	}
	
	@Override
	public int getPreco() {
		return 5 + super.getPreco();
	}

}