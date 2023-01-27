package com.mycompany.projetoescola.Classes;

import java.util.Scanner;

public class Professor extends Pessoa{

    private String cpf;

    public Professor(){
        super();
        this.cpf = "000.000.000-00";
    }
    @Override
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("******* Preenchendo Professor *********");
        super.preencher();
        System.out.println("Informe o CPF:");
        this.cpf = leitor.next();
    }
    public void imprimir(){
        System.out.println("----------- Dados do professor ------------");
        System.out.println("Nome:" + super.nome);
        System.out.println("Sexo:" + super.sexo);
        System.out.println("Idade:" + super.idade);
        System.out.println("CPF:" + this.cpf);
        System.out.println("--------------------------------------------------");
    }
        public String imprimirParaString(){
        String saida = "";
        saida = "\n----------- Dados do professor ------------\n"
        +"Nome:" + super.nome +"\n"
        +"Sexo:" + super.sexo+"\n"
        +"Idade:" + super.idade+"\n"
        +"CPF:" + this.cpf+"\n"
        +"-------------------------------------------\n";
        return saida;
    }

    
    public void copiar(Professor outro){
        super.nome = outro.getNome();
        super.sexo = outro.getSexo();
        super.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }
    public String cabecalho(){
        return "Nome;sexo;idade;cpf\n";
    }
    public String atributoToCSV(){
        return this.nome + ";" + this.sexo + ";" + this.idade + ";" + this.cpf + "\n";
    }
    
    public void CSVToAtributo(String csv){
        String vetor[] = csv.split(";");
        this.nome = vetor[0];
        this.sexo = vetor[1].charAt(0);
        this.idade = Integer.parseInt(vetor[2]);
        this.cpf = vetor[3];
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   } 