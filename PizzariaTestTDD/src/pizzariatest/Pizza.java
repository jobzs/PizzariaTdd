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
public class Pizza  {

    String nomeDaPizza;

    public String getNomeDaPizza() {
        return nomeDaPizza;
    }
    
    List<Ingrediente> ingredientesDaPizza = new ArrayList<>();

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientesDaPizza.add(ingrediente);
    }

    public void listarIngrdientes() {
        for (int i = 0; i < ingredientesDaPizza.size(); i++) {
            Ingrediente ing = ingredientesDaPizza.get(i);
            System.out.println("Ingrediente:" + ing.getNomeDoIngrediente());
        }
    }

    public double obterPreco() {
        double x = 0;
        for (int j = 0; j < ingredientesDaPizza.size(); j++) {
            Ingrediente ing2 = ingredientesDaPizza.get(j);
            x = x + ing2.valorFinalDoIngrediente();
        }
        return x;
    }
}
