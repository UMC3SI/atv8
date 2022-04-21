/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8;


/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Gustavo Monteiro - 11211100223@alunos.umc.br
 */
public class Faturamento {
    public static void main(String[] args){
        
        Produto p1 = new Produto(1,"pão francês",2.0,8);
        p1.calcularTotal();
        System.out.println("o(s) " + p1.getQtd_vendida() +" " + p1.getDescricao()+"(s) vale(m) " +  p1.getTotal_vendas() + " reais");
        
        Produto p2 = new Produto(2,"pão de queijo",4.0,6);
        p2.calcularTotal();
        System.out.println("o(s) " + p2.getQtd_vendida() +" " + p2.getDescricao()+"(s) vale(m) " +  p2.getTotal_vendas() + " reais");
        
        Produto p3 = new Produto(3,"pão de mel",1.0,7);
        p3.calcularTotal();
        System.out.println("o(s) " + p3.getQtd_vendida() +" " + p3.getDescricao()+"(s) vale(m) " +  p3.getTotal_vendas() + " reais");
        
        Produto p4 = new Produto(4,"pão de leite",3.5,5);
        p4.calcularTotal();
        System.out.println("o(s) " + p4.getQtd_vendida() +" " + p4.getDescricao()+"(s) vale(m) " +  p4.getTotal_vendas() + " reais");
        
        Produto p5 = new Produto(5,"pão de forma",1.5,10);
        p5.calcularTotal();
        System.out.println("o(s) " + p5.getQtd_vendida() +" " + p5.getDescricao()+"(s) vale(m) " +  p5.getTotal_vendas() + " reais");
        
        Produto p6 = new Produto(6,"pão de hot-dog",4.5,5);
        p6.calcularTotal();
        System.out.println("o(s) " + p6.getQtd_vendida() +" " + p6.getDescricao()+"(s) vale(m) " +  p6.getTotal_vendas() + " reais");
        
        Produto p7 = new Produto(7,"pão de hambúrguer",5.0,4);
        p7.calcularTotal();
        System.out.println("o(s) " + p7.getQtd_vendida() +" " + p7.getDescricao()+"(s) vale(m) " +  p7.getTotal_vendas() + " reais");
        
        Produto[] produtos = {p1, p2, p3, p4, p5, p6, p7};
        Carrinho c = new Carrinho(produtos);
        c.calcular_carrinho();
        System.out.println("O valor total da compra é " + c.getTotal_produtos() + " reais");
    }
}
