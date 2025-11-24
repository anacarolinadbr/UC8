/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public class Arqueiro extends Personagem {
    
        public Arqueiro(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    public String usarHabilidade(Personagem inimigo) {
        //Verifica se o personagem tem 2 manas para utilizar a habilidade
        if (this.mana >= 2) {
        //RN19: Habilidade Tiro Preciso aumenta a chance de acerto em 50% no próximo ataque
        //Diminiu duas manase aumenta o bonus de Acerto 50
            this.mana -= 2;
            this.bonusAcerto = 50; // RN19
            return nome + " Habiliddade de tiro preciso";
        } else {
            return nome + " não tem mana suficiente";
        }
    }
}
