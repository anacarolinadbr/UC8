/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public class Mago extends Personagem {
      public Mago(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    //RN17: Habilidade Magia causa dano mágico equivalente a (forca * 2) + rolagem de dado, consome 2 de mana.
    public String usarHabilidade(Personagem inimigo) {
        //Vai perder duas manas
        if (this.mana >= 2) {
            this.mana -= 2;
            int dano = (this.forca * 2) + Dados.rolar(1, 6);
            inimigo.vida -= dano;
            return nome + " lança uma magua e causa " + dano + " de danoo";
        } else {
            return nome + " não tem mana suficiente";
        }
    }
}
