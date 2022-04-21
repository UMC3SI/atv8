package padaria;

/**
 *
 * @vasconceloscaio Caio Santos de Vasconcelos <11211101570@alunos.umc.br>
 */
public class Main {

    public static void main(String[] args) {

        Produto P1 = new Produto(1, "Pão Frances", 2f, 20);
        Produto P2 = new Produto(2, "Café", 2f, 20);
        Produto P3 = new Produto(3, "Leite", 3f, 100);

        P1.CalcularTotal();
        System.out.println("Produto Desejado: " + P1.getTotal_vendas());
        P2.CalcularTotal();
        System.out.println("Produto Desejado: " + P2.getTotal_vendas());
        P3.CalcularTotal();
        System.out.println("Produto Desejado: " + P3.getTotal_vendas());

        P1.imprimir();
        P2.imprimir();
        P3.imprimir();

    }

}
