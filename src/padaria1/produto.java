/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria1;

/**
 *
 * @author gabriel ferri (11211102207.alunos.umc.br)
 */
public class produto {
    
        private int codigo;
        private String descriçao;
        private double valor_unit;
        private int qtd_vendida;
        private double total_vendas;

    public produto(int codigo, String descriçao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descriçao = descriçao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }

    public int getQtd_vendida() {
        return qtd_vendida;
    }

    public void setQtd_vendida(int qtd_vendida) {
        this.qtd_vendida = qtd_vendida;
    }

    public double getTotal_vendas() {
        return total_vendas;
    }
        
       
         
}
