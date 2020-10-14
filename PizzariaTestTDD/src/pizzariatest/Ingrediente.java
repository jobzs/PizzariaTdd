/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariatest;

/**
 *
 * @author Job
 */
public class Ingrediente {

    public String nomeDoIngrediente;
    public Double quantidaKgdoIngrediente;
    public Double custoDoIngrediente;
    
    public Ingrediente(String nomeDoIngrediente, Double custoPesoIngrediente, Double custoDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
        this.quantidaKgdoIngrediente = custoPesoIngrediente;
        this.custoDoIngrediente = custoDoIngrediente;
    }

    public String getNomeDoIngrediente() {
        return nomeDoIngrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    public Double getCustoDoIngrediente() {
        return custoDoIngrediente;
    }

    public void setCustoDoIngrediente(Double custoDoIngrediente) {
        this.custoDoIngrediente = custoDoIngrediente;
    }

    public Double getCustoPesoIngrediente() {
        return quantidaKgdoIngrediente;
    }

    public void setCustoPesoIngrediente(Double custoPesoIngrediente) {
        this.quantidaKgdoIngrediente = custoPesoIngrediente;
    }
    
    public Double valorFinalDoIngrediente() {       
               
        Double valor =  quantidaKgdoIngrediente*custoDoIngrediente;
        return valor;
        
    }
    
    public String ingredientesVazios() {
        
        String vazio;
        
        if(nomeDoIngrediente.isEmpty() || quantidaKgdoIngrediente.equals(0.0) || custoDoIngrediente.equals(0.0)){
        vazio = "Esta Vazio";
        return vazio;
        }else{
        vazio = "Não esta Vazio";
        return vazio;
        }
    }

}
