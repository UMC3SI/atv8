package padaria;

/**
 *
 * @vasconceloscaio Caio Santos de Vasconcelos <11211101570@alunos.umc.br>
 */
public class Produto {

    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;

    public Produto(int codigo, String descricao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public void setTotal_vendas(double total_vendas) {
        this.total_vendas = total_vendas;
    }

    void CalcularTotal() {
        this.total_vendas = valor_unit * qtd_vendida;
    }

    String total_vendas() {
        return null;

    }

    public void imprimir() {
        System.out.println();
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor Unitário: " + this.valor_unit);
        System.out.println("Quantidade Vendida: " + this.qtd_vendida);
        System.out.println("Total de Vendas: " + this.total_vendas);
    }
}
