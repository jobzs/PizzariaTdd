/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTDDPizzaria;

import pizzariatest.Pedido;
import org.junit.Test;
import static org.junit.Assert.*;
import pizzariatest.Ingrediente;
import pizzariatest.Pizza;

/**
 *
 * @author Job
 */
public class PedidoTest {

    public PedidoTest() {
    }

    @Test
    public void abrePedidoCom1PizzaEVerificaValor() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        //System.out.println("Custo:" + pizzaMussarela.obterPreco());
        double resultado = 23.00;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        System.out.println("Custo com uma Pizza:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.00000);
    }
    
    @Test
    public void abrePedidoCom2PizzaEVerificaValor() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        Ingrediente bacon = new Ingrediente("bacon", 3.0, 5.0);

        Pizza pizzaBacon = new Pizza();
        pizzaBacon.adicionarIngrediente(tomate);
        pizzaBacon.adicionarIngrediente(bacon);
        pizzaBacon.adicionarIngrediente(massa);

        

        double resultado = 56.00;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBacon);
        System.out.println("Custo com duas Pizzas:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.00000);
    }
    
    

    @Test
    public void abrePedidoCom3PizzaEVerificaValor() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        Ingrediente bacon = new Ingrediente("bacon", 3.0, 5.0);

        Pizza pizzaBacon = new Pizza();
        pizzaBacon.adicionarIngrediente(tomate);
        pizzaBacon.adicionarIngrediente(bacon);
        pizzaBacon.adicionarIngrediente(massa);

        Ingrediente brocolis = new Ingrediente("brocolis", 3.0, 3.0);

        Pizza pizzaBrocolis = new Pizza();
        pizzaBrocolis.adicionarIngrediente(tomate);
        pizzaBrocolis.adicionarIngrediente(brocolis);
        pizzaBrocolis.adicionarIngrediente(massa);

        double resultado = 83.00;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBacon);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBrocolis);
        System.out.println("Custo com três Pizzas:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.00000);
    }
    
    @Test
    public void abrePedidoCom1PizzaEVerificaValorComImposto() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        //System.out.println("Custo:" + pizzaMussarela.obterPreco());
        double resultado = 24.15;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        
        pedidoPizzaDeMussarela.setImposto(5.0);
        System.out.println("Custo com uma Pizza com imposto:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.00000);
    }
    
    @Test
    public void abrePedidoCom2PizzaEVerificaValorComImposto() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        Ingrediente bacon = new Ingrediente("bacon", 3.0, 5.0);

        Pizza pizzaBacon = new Pizza();
        pizzaBacon.adicionarIngrediente(tomate);
        pizzaBacon.adicionarIngrediente(bacon);
        pizzaBacon.adicionarIngrediente(massa);

        

        double resultado = 58.80;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBacon);
        
        pedidoPizzaDeMussarela.setImposto(5.0);
        System.out.println("Custo com duas Pizzas com imposto:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.00000);
    }

    @Test
    public void abrePedidoCom3PizzaEVerificaValorComImposto() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        Ingrediente mussarela = new Ingrediente("mussarela", 1.0, 5.0);
        Ingrediente massa = new Ingrediente("massa", 2.0, 3.0);

        Pizza pizzaMussarela = new Pizza();
        pizzaMussarela.adicionarIngrediente(tomate);
        pizzaMussarela.adicionarIngrediente(mussarela);
        pizzaMussarela.adicionarIngrediente(massa);

        Ingrediente bacon = new Ingrediente("bacon", 3.0, 5.0);

        Pizza pizzaBacon = new Pizza();
        pizzaBacon.adicionarIngrediente(tomate);
        pizzaBacon.adicionarIngrediente(bacon);
        pizzaBacon.adicionarIngrediente(massa);

        Ingrediente brocolis = new Ingrediente("brocolis", 3.0, 3.0);

        Pizza pizzaBrocolis = new Pizza();
        pizzaBrocolis.adicionarIngrediente(tomate);
        pizzaBrocolis.adicionarIngrediente(brocolis);
        pizzaBrocolis.adicionarIngrediente(massa);

        double resultado = 87.15;

        Pedido pedidoPizzaDeMussarela = new Pedido();
        pedidoPizzaDeMussarela.adicionarPizza(pizzaMussarela);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBacon);
        pedidoPizzaDeMussarela.adicionarPizza(pizzaBrocolis);
        
        pedidoPizzaDeMussarela.setImposto(5.0);
        System.out.println("Custo com três Pizzas com impostos:" + pedidoPizzaDeMussarela.obterPrecoPizza());
        assertEquals(resultado, pedidoPizzaDeMussarela.obterPrecoPizza(), 0.0001);
    }
}

