/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author sesia
 */
public class Dados {
    // Vai rolar os lado e qa quantidade
    //Soma no final
    public static int rolar(int quantidade, int lados) {
        int total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += (int)(Math.random() * lados) + 1;
        }
        return total;
    }
                
}
