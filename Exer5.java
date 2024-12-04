/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exer5 {  public class Ex5 {
    public static void main(String[] args){
        double [][] matriz = {{4.5,5.2},{4.2,1}};
        int x,y;
        JOptionPane.showMessageDialog(null, "Imprimindo a matriz");
        
        for (x =0; x < 2; x++)
        {
            for (y =0; y < 2; y++)
            {
                System.out.println("mat["+x+"] [+"+y+"] = "+matriz[x][y]+ " ");
            }
        }
} } }