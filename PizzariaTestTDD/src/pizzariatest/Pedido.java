/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Job
 */
public class Pedido extends Pizza {

    String numeroDoPedido;
    double imposto;

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    List<Pizza> saborPizza = new ArrayList<>();

    public void adicionarPizza(Pizza pizza) {
        saborPizza.add(pizza);
    }

    public void listarPizza() {
        for (int i = 0; i < saborPizza.size(); i++) {
            Pizza pizz = saborPizza.get(i);
            System.out.println("Pizza:" + pizz.getNomeDaPizza());
        }
    }

    public double obterPrecoPizza() {
        double x = 0;
        for (int j = 0; j < saborPizza.size(); j++) {
            Pizza pizz2 = saborPizza.get(j);
            x = x + pizz2.obterPreco();
        }
        return x+((getImposto()/100)*x);
    }

}
