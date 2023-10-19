package numeropar;

import java.util.Random;

public class numeropar {

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 10;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Imprime o array de números aleatórios
        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Imprime apenas os números pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < tamanhoArray; i++) {
            if (numerosAleatorios[i] % 2 == 0) {
                System.out.print(numerosAleatorios[i] + " ");
            }
        }
    }
}
