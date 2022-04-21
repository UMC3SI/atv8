/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;

/**
 *
 * @author Bruno Rodrigues Moreira (11211501661@alunos.umc.br)
 */
public class Faturamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos vão ser cadastrados?");
        int n = sc.nextInt();
        sc.nextLine();
        
        //Array de objetos
        Produto[] produtos = new Produto[n];        
        
        //For para instaciar os objetos
        for (int i = 0; i < n; i++) {
            //Cadastra os dados do produto
            System.out.println("\nProduto " + (i+1));
            System.out.println("Qual o código do produto");
            int cod = sc.nextInt();
            sc.nextLine();
            System.out.println("Qual a descrição do produto?");
            String descr = sc.nextLine();
            System.out.println("Qual seu valor unitário");
            double valor = sc.nextDouble();
            System.out.println("Quantos foram vendidos");
            int qtd = sc.nextInt();
            sc.nextLine();
            
            //Instancia do produto 
            produtos[i] = new Produto(cod, descr, valor, qtd);
            produtos[i].calcularTotal();
        }

        //For para imprimir os dados
        for(int i = 0; i<n;i++){
            produtos[i].imprimir();
        }
        
        //Imprimir o total
        System.out.println("\nO total de vendas é: " + Produto.getTotal());
        
    }

}
