/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2;

/**
 *
 * @author Admin
 */
public class Exer1 {     public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
                somaColunas[j] += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
            }
        }
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSoma dos numeros impares: " + somaImpares);
        System.out.println("Resultado das somas das colunas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Coluna " + i + ": " + somaColunas[i]);
        }
        System.out.println("Soma das linhas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }
    }
}