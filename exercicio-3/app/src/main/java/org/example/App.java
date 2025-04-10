/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        char[][] tabuleiro = new char[10][10];
        inicializar_tabuleiro(tabuleiro);

        imprimir_tabuleiro(tabuleiro);

    }

    // vai inicializar o tabuleiro com pontos
    public static void inicializar_tabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                tabuleiro[i][j] = '.';
    }

    // imprime o tabuleiro formatado
    public static void imprimir_tabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}










