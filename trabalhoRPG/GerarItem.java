/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public class GerarItem {
    public static Item gerarItensAtributos() {
        //Vai gerar um numero de 0 a 1
        //0 vai ser o item de cura
        //1 vai ser o item de mana 
        //Usar Item (poções de cura ou mana)
        int sorte = (int) (Math.random() * 2); 
        Item itemGerado;

        
        switch (sorte) {
            //Poção de cura  vai ser 2 dados de 6 lados
            //Outros atributos em 0
            case 0 -> itemGerado = new Item(
                    "Poção de Cura",
                    Dados.rolar(2, 6),0,0,0);

            case 1 -> itemGerado = new Item(
            //Poçao Mana vai ser 1 dados de 6 lados
                    "Poção de Mana",0, Dados.rolar(1, 6),0,0);
            default -> itemGerado = null;
        }

        return itemGerado;
    }
}

