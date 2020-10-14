/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTDDPizzaria;

import pizzariatest.Ingrediente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Job
 */
public class IngredientesTest {
    
    public IngredientesTest() {
        
    }

    @Test
    public void ingredienteTomate() {
        Ingrediente tomate = new Ingrediente("tomate", 4.0, 3.0);
        double resultado = 12.0;
        assertEquals(resultado, tomate.valorFinalDoIngrediente(), 0.0000000);
    }
    
    @Test
    public void ingredienteTestNull() {
        
        Ingrediente bacon = new Ingrediente("Bacon" , 3.00, 1.00);
        
         assertEquals("Não esta Vazio", bacon.ingredientesVazios());   
        
    }
    
     @Test
    public void ingredienteTestNull2() {
        
        Ingrediente bacon = new Ingrediente("" , 1.00, 1.00);
        
         assertEquals("Esta Vazio", bacon.ingredientesVazios());   
        
    }

}
