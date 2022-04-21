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
public class Padaria {
    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;
    
    public Padaria(int codigo, String descricao,double valor_unit, int qtd_vendida){
	        this.codigo = codigo;
                this.descricao = descricao;
                this.valor_unit = valor_unit;
                this.qtd_vendida = qtd_vendida;
        }
	public int getCodigo(){
	        return codigo;
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
	    public void calcularTotal(){
	        total_vendas = qtd_vendida * valor_unit;
	}
    
}
