/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public class Item {
    private String nome;
    private int curarVida;
    private int aumentarMana;
 

    public Item(String nome, int vidaCurada, int manaCurada, int buffForca, int nerfarInimigo) {
        this.nome = nome;
        this.curarVida = vidaCurada;
        this.aumentarMana = manaCurada;
    }

    public String getNome() {
        return nome;
    }

    public int getcurarVida() {
        return curarVida;
    }

    public int getaumentarMana() {
        return aumentarMana;
    }

}