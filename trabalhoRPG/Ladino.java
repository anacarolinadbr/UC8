/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public class Ladino extends Personagem {
     public Ladino(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    //RN21: Habilidade Evasão concede 70% de chance de escapar de um combate ou 30% de chance de contra-atacar.
    public String usarHabilidade(Personagem inimigo) {
        double sorte = Math.random() * 100;
        //Com os 70 de chance o perosnagem vai escapar 
        if (sorte <= 70) {
            inimigo.vida = 0;
            return nome + " usa evasao e escapa do combate!";
        } else {
            int dano = (forca + Dados.rolar(1, 6)) / 2;
            inimigo.vida -= dano;
            return nome + " contra ataca e causa " + dano + " de dano";
        }
    }
}
