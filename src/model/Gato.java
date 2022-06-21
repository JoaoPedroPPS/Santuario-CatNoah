/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pepej
 */
public class Gato implements Comparable<Gato> {
    private String nome;
    private double peso;
    private String cor;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public int compareTo(Gato outroGato){
      return this.getNome().
              compareTo(outroGato.getNome());
    }
    
    @Override
    public boolean equals(Object g) {
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;

        Gato outroGato = (Gato) g;

        return this.nome != null ? (outroGato.nome).equals(this.nome) : outroGato.nome == null;
    }

    @Override
    public String toString() {
        return "\nnome= " + nome + "\npeso= " + peso + "\ncor= " + cor + "\nidade= " + idade + '}';
    }
    
    
}
