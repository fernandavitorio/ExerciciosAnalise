/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

import componentes.*;
import java.util.Iterator;
import java.util.Scanner;
import moedas.Moeda;

/**
 *
 * @author fernanda.vitorio
 */
public class Maquina {

    private Scanner leitor;

    public Maquina() {
        this.leitor = new Scanner(System.in);
    }

    private void exibeCafePreto() {
        Cafe cafe = new CafePreto();
        cafe.preparar();
    }

    private void exibeCafeComAcucar() {
        Cafe cafe = new Acucar();
        cafe.preparar();
    }

    private void exibeCafeComCreme() {
        Cafe cafe = new Creme();
        cafe.preparar();
    }

    private void exibeCafeCremeAcucar() {
        Cafe cafe = new CafeCremeAcucar();
        cafe.preparar();
    }

    public void run() {
        System.out.println("Escolha a opção de café desejada (1 - Café Preto, 2 - Café com Açucar, 3 - Café com Creme, 4 - Café com Creme e Açucar):");
        Integer opcao = leitor.nextInt();
        selecionaOpcao(opcao);
    }

    public Iterator<Moeda> getTroco() {
        // TODO Auto-generated method stub
        return null;
    }

    private void selecionaOpcao(Integer op) {
        switch (op) {
            case 1:
                exibeCafePreto();
                break;
            case 2:
                exibeCafeComAcucar();
                break;
            case 3:
                exibeCafeComCreme();
                break;
            case 4:
                exibeCafeCremeAcucar();
                break;
        }
    }

}
