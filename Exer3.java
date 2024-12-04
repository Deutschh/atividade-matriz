/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2;

/**
 *
 * @author Admin
 */
public class Exer3 {      public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.random() * 100; 
            }
        }
       
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nValores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }
        System.out.println("\n\nValores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][3 - i]);
        }
    }
}