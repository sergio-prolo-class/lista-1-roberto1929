package org.example;

public class App {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Uso correto: gradle run --args <cor1> <cor2> <cor3> <cor4>");
            System.out.println("Exemplo: gradle run --args vermelho vermelho marrom dourado");
            return;
        }
            String cor1 = args[0].toLowerCase();
            String cor2 = args[1].toLowerCase();
            String cor3 = args[2].toLowerCase();
            String cor4 = args[3].toLowerCase();

            int faixa1 = get_valor_digito(cor1);
            int faixa2 = get_valor_digito(cor2);
            double multiplicador = get_multiplicador(cor3);
            double tolerancia = get_tolerancia(cor4);

        if (faixa1 == -1 || faixa2 == -1 || multiplicador == 0) {
            System.out.println("Erro: uma ou mais cores são inválidas.");
            return;
        }

            double resistencia = (faixa1 * 10 + faixa2) * multiplicador;

        String[] unidades = {"", "k", "M", "G", "T", "P"};
        int unidade_index = 0;

        while (resistencia >= 1000 && unidade_index < unidades.length - 1) {
            resistencia /= 1000;
            unidade_index++;
        }

        System.out.printf("Resistência: %.2f %s Ohms", resistencia, unidades[unidade_index]);

        if (tolerancia > 0) {
            System.out.printf(" ( +- %.2f%%)", tolerancia);
        }

    }

    private static int get_valor_digito(String cor) {
        switch (cor) {
            case "preto":   return 0;
            case "marrom":  return 1;
            case "vermelho": return 2;
            case "laranja": return 3;
            case "amarelo": return 4;
            case "verde":   return 5;
            case "azul":    return 6;
            case "violeta": return 7;
            case "cinza":   return 8;
            case "branco":  return 9;
            default:
                System.out.println("A cor '" + cor + "' é inválida");
                return -1;
        }
    }

    private static double get_multiplicador(String cor) {
        switch (cor) {
            case "preto":   return 1;
            case "marrom":  return 10;
            case "vermelho": return 100;
            case "laranja": return 1000;
            case "amarelo": return 10000;
            case "verde":   return 100000;
            case "azul":    return 1000000;
            case "violeta": return 10000000;
            case "cinza":   return 100000000;
            case "branco": return 1000000000;
            case "dourado": return 0.1;
            case "prateado": return 0.01;
            default:
                System.out.println("A cor '" + cor + "' inválida para multiplicador");
                return -1;
        }
    }

    private static double get_tolerancia(String cor) {
        switch (cor) {
            case "marrom":  return 1;
            case "vermelho": return 2;
            case "verde":   return 0.5;
            case "azul":    return 0.25;
            case "violeta": return 0.1;
            case "dourado": return 5;
            case "prateado": return 10;
            default:
                System.out.println("A cor '" + cor + "' inválida para a tolerancia");
                return 0;
        }
    }
}