/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

import java.util.ArrayList;
import java.util.Iterator;
import moedas.Moeda;

/**
 *
 * @author fernanda.vitorio
 */
public class DepositarMoeda {

    private Iterator<Moeda> moedas;
    private ArrayList<Moeda> listaMoedas;
    private float soma;

    public DepositarMoeda() {
        listaMoedas = new ArrayList<Moeda>();
        soma = 0.0f;
    }

    public float depositarMoeda(Moeda moeda) {
        listaMoedas.add(moeda);
        soma += moeda.valor();
        return soma;
    }

    public Iterator<Moeda> getTroco() {
        // TODO Auto-generated method stub
        return null;
    }

}
