/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Bruno Rodrigues Moreira (11211501661@alunos.umc.br)
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;
    private static double total = 0;

    public Produto(int codigo, String descricao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public int getQtd_vendida() {
        return qtd_vendida;
    }

    public double getTotal_vendas() {
        return total_vendas;
    }
    
    public static double getTotal() {
        return total;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }

    public void setQtd_vendida(int qtd_vendida) {
        this.qtd_vendida = qtd_vendida;
    }
    
    //Total de vendas é o produto da quantidade vendida pelo valor unitário (qtd_vendida*valor_unit)
    public void calcularTotal(){
        this.total_vendas = this.qtd_vendida * this.valor_unit;
        total+= this.total_vendas;
    }
    
    public void imprimir(){
        System.out.println("================================");
        System.out.println("Código: " + this.getCodigo());        
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor unitario: R$" + this.getValor_unit());
        System.out.println("Quantidade vendida: " + this.getQtd_vendida());
        System.out.println("Total de vendas: R$" + this.getTotal_vendas());
    }
    
    
}
