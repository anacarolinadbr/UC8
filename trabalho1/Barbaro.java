/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author sesia
 */
public class Barbaro extends Personagem {
     
   public Barbaro(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }

   
   //RN15: Habilidade Fúria aumenta o dano físico em 50% por um turno (custa 1 de mana).
    public String usarHabilidade(Personagem inimigo) {
        //Vai diminuir a mana
        if (this.mana >= 1) {
            this.mana -= 1;
            int dano = (int)((this.forca + Dados.rolar(1, 6)) * 1.5);
            inimigo.vida -= dano;
            return nome + " entra em FÚRIA e causa " + dano + " de dano!";
        } else {
            return nome + " não tem mana suficiente!";
        }
    }
     
    
}
