/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescola.Classes;

import java.util.Scanner;


public class Pessoa {
    protected String nome;
    protected char sexo;
    protected int idade;
    
    public Pessoa(){
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
    }
    
        public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome:");
        this.nome = leitor.next();
        System.out.println("Informe o sexo:");
        this.sexo = leitor.next().charAt(0);
        System.out.println("Informe a idade:");
        this.idade = leitor.nextInt();
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}