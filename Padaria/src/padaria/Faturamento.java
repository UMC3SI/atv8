/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria;

/**
 * Autor Leonardo Piacentini Bugmann RGM 11211100076
 * co autor Renata Cristina da Silva RGM 11211100766
 */
public class Faturamento {
    public static void main(String[] args){
        Padaria p0 = new Padaria(1,"Pão",0.70,30);
        p0.calcularTotal();
        System.out.println(" numero do item: "+ p0.getCodigo() +  " produto" + p0.getDescricao() +" valor: " + p0.getValor_unit() + " quantidade vendida "+p0.getQtd_vendida()+" total vendido: "+ p0.getTotal_vendas());
        Padaria p1 = new Padaria(2,"Baguette",2,5);
        p1.calcularTotal();
        System.out.println(" numero do item: "+ p1.getCodigo() +  " produto" + p1.getDescricao() +" valor: " + p1.getValor_unit() + " quantidade vendida "+p1.getQtd_vendida()+"total vendido: "+ p1.getTotal_vendas());
        Padaria p2 = new Padaria(3,"Sonho",1.50,8);
        p2.calcularTotal();
        System.out.println(" numero do item: "+ p2.getCodigo() +  " produto" + p2.getDescricao() +" valor: " + p2.getValor_unit() + " quantidade vendida "+p2.getQtd_vendida()+" total vendido: "+ p2.getTotal_vendas());
        Padaria p3 = new Padaria(4,"Café",2,9);
        p3.calcularTotal();
        System.out.println(" numero do item: "+ p3.getCodigo() +  " produto" + p3.getDescricao() +" valor: " + p3.getValor_unit() + " quantidade vendida "+p3.getQtd_vendida()+" total vendido: "+ p3.getTotal_vendas());
        Padaria p4 = new Padaria(5,"Suco",3.15,4);
        p4.calcularTotal();
        System.out.println(" numero do item: "+ p4.getCodigo() +  " produto" + p4.getDescricao() +" valor: " + p4.getValor_unit() + " quantidade vendida "+p4.getQtd_vendida()+" total vendido: "+ p4.getTotal_vendas());
        Padaria p5 = new Padaria(6,"Salgado",7,5);
        p5.calcularTotal();
        System.out.println(" numero do item: "+ p5.getCodigo() +  " produto" + p5.getDescricao() +" valor: " + p5.getValor_unit() + " quantidade vendida "+p5.getQtd_vendida()+" total vendido: "+ p5.getTotal_vendas());
        Padaria p6 = new Padaria(7,"Bala",0.25,19);
        p6.calcularTotal();
        System.out.println(" numero do item: "+ p6.getCodigo() +  " produto" + p6.getDescricao() +" valor: " + p6.getValor_unit() + " quantidade vendida "+p6.getQtd_vendida()+" total vendido: "+ p6.getTotal_vendas());
        Padaria p7 = new Padaria(8,"Sorvete",12,4);
        p7.calcularTotal();
        System.out.println(" numero do item: "+ p7.getCodigo() +  " produto" + p7.getDescricao() +" valor: " + p7.getValor_unit() + " quantidade vendida "+p7.getQtd_vendida()+" total vendido: "+ p7.getTotal_vendas());
        Padaria p8 = new Padaria(9,"Pão de queijo",4,13);
        p8.calcularTotal();
        System.out.println(" numero do item: "+ p8.getCodigo() +  " produto" + p8.getDescricao() +" valor: " + p8.getValor_unit() + " quantidade vendida "+p8.getQtd_vendida()+" total vendido: "+ p8.getTotal_vendas());
        Padaria p9 = new Padaria(10,"Pf -prato feito",15.50,7);
        p9.calcularTotal();
        System.out.println(" numero do item: "+ p9.getCodigo() +  " produto" + p9.getDescricao() +" valor: " + p9.getValor_unit() + " quantidade vendida "+p9.getQtd_vendida() +" total vendido: "+ p9.getTotal_vendas());
        
        Padaria[] produtos = {p0, p1, p2, p3, p4, p5, p6, p7, p8, p9};
        Carrinho c = new Carrinho(produtos);
        c.calcular_carrinho();
        System.out.println("O valor total da compra é " + c.getTotal_produtos() + " reais");
    }
    
}
