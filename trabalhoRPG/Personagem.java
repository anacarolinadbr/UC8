/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoRPG;

/**
 *
 * @author sesia
 */
public abstract class Personagem {
   
    String nome;
    int vida;
    int mana;
    int forca;
    int agilidade;
    protected int bonusAcerto = 0;

    public Personagem(String nome, int vida, int mana, int forca, int agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.agilidade = agilidade;
    }

    // método
    public abstract String usarHabilidade(Personagem inimigo);

    
    public String atacar(Personagem inimigo) {
        String aviso = nome + " ataca " + inimigo.nome + "!\n";

        if (calcularAcerto(inimigo)) {
            //Para calcular o dano pega a força e + 1 dado de 6 lado
            int dano = forca + Dados.rolar(1, 6);
            inimigo.vida -= dano;
            aviso += "O ataque acerta e causa " + dano + " de dano";
        } else {
            aviso += "O ataque falhou!";
        }
        return aviso;
    }

     
     
    // 
    public boolean calcularAcerto(Personagem inimigo) {
        //chance base de 50 e quanto mais agilidade o personagem ter
        //mais chanc e terá
        int chance = 50 + (this.agilidade - inimigo.agilidade) * 5;
        chance += bonusAcerto;
        //A chance não pode ser maior que 95 e nem menor do que 10
        if (chance < 10) chance = 10;
        if (chance > 95) chance = 95;
        // vai limpar
        bonusAcerto = 0; 
        //Gerar um numero aleatorio de 1 a 100 para simular a sorte
        int sorte = (int)(Math.random() * 100) + 1;
        //Se o número de sorte for menor ou igual à chance de fuga, vai dar certo a fuga
        return sorte <= chance;
    }

    // Usando a classe dados
    //isso vai permitir criar varivaies aleatorias
    public int rolarDados(int qtd, int lados) {
        return Dados.rolar(qtd, lados);
    }


    public String fugir(Personagem inimigo) {
        //Mesma coisa do chance de Acerti
        int chanceFuga = 50 + (this.agilidade - inimigo.agilidade) * 5;
        //A chance não pode ser maior que 95 e nem menor do que 10
        if (chanceFuga < 10) chanceFuga = 10;
        if (chanceFuga > 95) chanceFuga = 95;
        //Gerar um numero aleatorio de 1 a 100 para simular a sorte (Mesma coisa do calcularAcerto)
        int sorte = (int)(Math.random() * 100) + 1;
        if (sorte <= chanceFuga) {
            return nome + " conseguiu fugir!";
        } else {
            return nome + " tentou fugir, mas falhou!";
        }
    }
    
   
    
     // Para ver se os personagens estão vivos
    //A vida não pode ser menor do que 0
    public boolean estaVivo() { 
      return vida > 0; 
    }
    
    
    
    public String getNome() {
        return nome; 
    }
    public int getVida() {
        return vida; 
    }
    public int getMana() {
        return mana; 
    }
    public int getForca() {
        return vida; 
    }
    public int getAgilidade() {
        return mana; 
    }
    public void setVida(int vida) {
    this.vida = vida;
}

public void setMana(int mana) {
    this.mana = mana;
}

}
