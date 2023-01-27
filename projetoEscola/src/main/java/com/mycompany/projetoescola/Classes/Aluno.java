package com.mycompany.projetoescola.Classes;
import java.util.Scanner;

public class Aluno extends Pessoa{
    private int matricula;
    private int anoDeIngresso;
    public Aluno(){
        super();
        this.matricula = 0;
        this.anoDeIngresso = 0;
    }
    @Override
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("*************** Preenchendo Aluno **************");
        super.preencher();
        System.out.println("Informe a matricula:");
        setMatricula(Integer.parseInt(ler.next()));
        System.out.println("Informe o ano de ingresso:");
        setAnoDeIngresso(Integer.parseInt(ler.next()));
        System.out.println("-------------------------------------------------");
    }

    public void copiar(Aluno outro){
        super.nome = outro.getNome();
        super.idade = outro.getIdade();
        super.sexo = outro.getSexo();
        setMatricula(outro.getMatricula());
        setAnoDeIngresso(outro.getAnoDeIngresso());
    }
    public void imprimir(){
        System.out.println("------------------ Dados do Aluno --------------");
        System.out.println("Nome : " + super.nome);
        System.out.println("Idade : " + super.idade);
        System.out.println("Sexo : " + super.sexo);
        System.out.println("Matricula : " + getMatricula());
        System.out.println("Ano de Ingresso : " + getAnoDeIngresso());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
}