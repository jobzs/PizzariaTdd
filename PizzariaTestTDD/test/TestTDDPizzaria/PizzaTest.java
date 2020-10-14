/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTDDPizzaria;

import pizzariatest.Pizza;
import pizzariatest.Ingrediente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Job
 */
public class PizzaTest {

    public PizzaTest() {
    }

    @Test
    public void PizzaMussarela() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        //System.out.println("Custo:" + pizzaMussarela.obterPreco());
        double resultado = 23.00;
        assertEquals(resultado, pizzaMussarela.obterPreco(), 0.0000000);
    }
    
    @Test
    public void PizzaBacon() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente bacon = new Ingrediente("bacon", 3.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaBacon = new Pizza();
        pizzaBacon.adicionarIngrediente(tomate);
        pizzaBacon.adicionarIngrediente(bacon);
        pizzaBacon.adicionarIngrediente(massa);

        double resultado = 33.00;
        assertEquals(resultado, pizzaBacon.obterPreco(), 0.00000001);
    }
}
