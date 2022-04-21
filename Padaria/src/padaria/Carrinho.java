/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria;

/**
 *
 * @author alunocmc
 */
public class Carrinho {
    Padaria[] produtos;
    double total_produtos = 0;

    public Carrinho(Padaria[] produtos){
        this.produtos = produtos;
    }
    public double getTotal_produtos(){
        return total_produtos;
    }
    public void calcular_carrinho(){
        for(int i = 0; i < produtos.length; i++){
            this.total_produtos += produtos[i].getTotal_vendas();
        }
    }
}
