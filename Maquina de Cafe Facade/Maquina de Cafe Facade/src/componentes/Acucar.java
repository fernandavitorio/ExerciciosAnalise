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
public class Acucar extends Cafe {


	@Override
	public void preparar() {
		System.out.println("Selecionada a opção café com açucar.");
	}
	
	@Override
	public float getPreco() {
		return 0.25f;
	}

}