package com.mycompany.projetoescola.Classes;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private Professor ministrante;
    private Aluno[] lstAlunos;

    public Disciplina(){
        this.nome = "";
        this.semestre = 0;
        this.ministrante = new Professor();
        this.horario = "0h";
        this.lstAlunos = new Aluno[3];
        for(int i=0;i<40;i++){
            this.lstAlunos[i] = new Aluno();
        }
    }

    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("------- Preenchendo Disciplina ----------");
        System.out.println("Informe o nome : ");
        setNome(ler.next());
        System.out.println("Informe o semestre : ");
        setSemestre(Integer.parseInt(ler.next()));
        System.out.println("Informe o horário : ");
        setHorario(ler.next());

        ministrante.preencher();

        for(int i=0;i<3;i++){
            lstAlunos[i].preencher();
        }

    }
    public void copiar(Disciplina outra){
        setNome(outra.getNome());
        setSemestre(outra.getSemestre());
        setHorario(outra.getHorario());
        setMinistrante(outra.getMinistrante());
        for (int i=0;i<3;i++){
            this.lstAlunos[i].copiar(outra.getLstAlunos()[i]);
        }
    }

    public void imprimir(){
        System.out.println("----- Dados da Disciplina -------");
        System.out.println("Nome : " + getNome());
        System.out.println("Semestre : " + getSemestre());
        System.out.println("Horario : " + getHorario());
        ministrante.imprimir();
        for(int i=0;i<3;i++){
            lstAlunos[i].imprimir();
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Professor ministrante) {
        this.ministrante = ministrante;
    }

    public Aluno[] getLstAlunos() {
        return lstAlunos;
    }

    public void setLstAlunos(Aluno[] lstAlunos) {
        this.lstAlunos = lstAlunos;
    }
}