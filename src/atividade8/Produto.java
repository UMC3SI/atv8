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
public class Produto {
    //criação de atributos
    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;
    
    //método construtor
    public Produto(int codigo,String descricao, double valor_unit, int qtd_vendida){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }
    
    //métodos get
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public double getValor_unit(){
        return valor_unit;
    }
    public int getQtd_vendida(){
        return qtd_vendida;
    }
    public double getTotal_vendas(){
        return total_vendas;
    }
    
    //métodos set
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setValor_unit(double valor_unit){
        this.valor_unit = valor_unit;
    }
    public void setQtd_vendida(int qtd_vendida){
        this.qtd_vendida = qtd_vendida;
    }
    
    //método para calcular o valor total das vendas
    public void calcularTotal(){
        total_vendas = qtd_vendida * valor_unit;
    }
}
