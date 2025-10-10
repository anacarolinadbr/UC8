/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetorev01;

/**
 *
 * @author ANACAROLINADAMBROSBE
 */
public class Pessoa {
    private String nome; //Atributo do tipo String
    private int idade; //Atributo do tipo idade(numeros inteiros)
    private double peso; //Atributo do tipo double (numeros com casas decimais)

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void andar(){
        System.out.println(this.nome +"A pessoa esta andando.");
    }
    
    public static void falar(){
        System.out.println("Blablablabla");
    }
}
