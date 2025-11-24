/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

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
        //Vai verificar se tem mana suficiente e depois tirar essa amna para usar a habilidade
        if (this.mana >= 1) {
            this.mana -= 1;
        //Pega a força do barbaro, soma com um dado de 6 lados e vai multiplicar por 1,5
        int dano = (int)((this.forca + Dados.rolar(1, 6)) * 1.5);
        //Int para virar número inteiro
            inimigo.vida -= dano;
            return nome + " entra em FÚRIA e causa " + dano + " de dano!";
        } else {
            return nome + " não tem mana suficiente!";
        }
    }
     
    
}
