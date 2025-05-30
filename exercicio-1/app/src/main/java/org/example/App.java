/*

 * This source file was generated by the Gradle 'init' task

 */
package org.example;

public class App {

    public static void main(String[] args) {

        String forma;
        int tamanho;
        int altura;
        int largura;


        //Primeiro é feito a verificação de quantos e quais os argumentos foram passados para podermos seguir o código
        if (args.length == 2) {
            forma = args[0];
            tamanho = Integer.parseInt(args[1]);
            if (forma.equals("triangulo")) {
                imprimeTriangulo(tamanho);
            } else if (forma.equals("losango")) {
                imprimeLosango(tamanho);
            } else {
                System.out.println("Forma não detectada. Tente novamente.");
            }
        } else if (args.length == 3) {
            forma = args[0];
            altura = Integer.parseInt(args[1]);
            largura = Integer.parseInt(args[2]);
            imprimeRetangulo(altura, largura);
        } else {
            System.out.println("Por favor, passe um parâmetro de linha de comando para começar.");
        }
    }
    //função que imprime o triangulo retangulo com base no tamanho fornecido pelo usuario
    public static void imprimeTriangulo(int tamanho) {

        for (int i = 1; i <= tamanho; i++) {
            // imprime o número de espaços em branco antes do asterisco
            for (int j = 0; j < tamanho - i; j++) {
                System.out.print("  ");
            }
            // imprime o numero de asterisco na linha
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // pra pular uma linha depois de imprimir cada linha
            System.out.println();
        }
    }
    //função que imprime o losango com base no tamanho fornecido pelo usuario
    public static void imprimeLosango(int tamanho) {
        for (int i = 0; i <= tamanho; i++) {
            if (i % 2 != 0) {
                System.out.println(" ".repeat(tamanho - i) + "* ".repeat(i));
            }
        }

        for (int i = tamanho - 2; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println(" ".repeat(tamanho - i) + "* ".repeat(i));
            }
        }
    }
    //função que imprime o retangulo com meio vazio e com altura e largura especificadas
    public static void imprimeRetangulo(int altura, int largura) {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.println("* ".repeat(largura));
            } else {
                System.out.print("* ");
                System.out.print("  ".repeat(largura - 2));
                System.out.print("*\n");
            }
        }
    }
}