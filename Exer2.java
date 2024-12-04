/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2;
import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class Exer2 {    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        int pares = 0, impares = 0;
        boolean temRepetidos = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                if (!elementos.add(matriz[i][j])) {
                    temRepetidos = true;
                }
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        
        System.out.println("Matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nA matriz possui elementos repetidos? " + (temRepetidos ? "Sim" : "Não"));
        System.out.println("Numeros pares: " + pares);
        System.out.println("umeros impares: " + impares);
    }
}