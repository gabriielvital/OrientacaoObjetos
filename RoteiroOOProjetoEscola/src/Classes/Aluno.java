package Classes;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private int matricula;
    private int anoDeIngresso;
    public Aluno(){
        this.setNome("");
        this.setSexo(';');
        this.setMatricula(0);
        this.setAnoDeIngresso(0);
    }
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("*************** Preenchendo Aluno **************");
        System.out.println("Informe o nome:");
        setNome(ler.next());
        System.out.println("Informe o sexo:");
        setSexo(ler.next().charAt(0));
        System.out.println("Informe a matricula:");
        setMatricula(Integer.parseInt(ler.next()));
        System.out.println("Informe o ano de ingresso:");
        setAnoDeIngresso(Integer.parseInt(ler.next()));
        System.out.println("-------------------------------------------------");
    }

    public void copiar(Aluno outro){
        setNome(outro.getNome());
        setIdade(outro.getIdade());
        setMatricula(outro.getMatricula());
        setSexo(outro.getSexo());
        setAnoDeIngresso(outro.getAnoDeIngresso());
    }
    public void imprimir(){
        System.out.println("------------------ Dados do Aluno --------------");
        System.out.println("Nome : " + getNome());
        System.out.println("Idade : " + getIdade());
        System.out.println("Sexo : " + getSexo());
        System.out.println("Matricula : " + getMatricula());
        System.out.println("Ano de Ingresso : " + getAnoDeIngresso());
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
