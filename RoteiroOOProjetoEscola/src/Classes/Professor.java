package Classes;

import java.util.Locale;
import java.util.Scanner;

public class Professor {
    private String nome;
    private char sexo;
    private int idade;
    private String cpf;

    public Professor(){
        this.setNome("");
        this.setSexo('M');
        this.setIdade(0);
        this.setCpf("000.000.000-00");
    }
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("******* Preenchendo Professor *********");
        System.out.println("Informe o nome:");
        this.nome = leitor.next();
        System.out.println("Informe o sexo:");
        this.sexo = leitor.next().charAt(0);
        System.out.println("Informe a idade:");
        this.idade = leitor.nextInt();
        System.out.println("Informe o CPF:");
        this.cpf = leitor.next();
    }
    public void imprimir(){
        System.out.println("----------- Dados do professor ------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Sexo" + this.sexo);
        System.out.println("Idade:" + this.idade);
        System.out.println("CPF:" + this.cpf);
        System.out.println("-------------------------------------------");
    }

    public void copiar(Professor outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
