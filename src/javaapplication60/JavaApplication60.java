/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication60;

/**
 *
 * @author Siloe
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int nota [][] = {{7,8,9},{90,4,5},{2,3,4}}; 
        System.out.println("la diagonal principal es " + diagonal(nota));
          
    }
    public static String diagonal(int matriz[][]){
        String resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado + matriz[i][i] + String.valueOf(matriz[i][i]);
        }
        return resultado;
    }
}
