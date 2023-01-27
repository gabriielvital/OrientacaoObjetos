package Classes;

import java.util.Scanner;

public class Roda {
    //atributos
    private double raio;
    private String material;
    private double peso;
    private double suporteMax;
    //metodos
    public Roda(){
        this.setRaio(0.0);
        this.setMaterial("");
        this.setPeso(0.0);
        this.setSuporteMax(0.0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSuporteMax() {
        return suporteMax;
    }

    public void setSuporteMax(double suporteMax) {
        this.suporteMax = suporteMax;
    }

    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe os dados da roda");
        System.out.printf("Raio:");
        this.raio = ler.nextDouble();
        System.out.printf("Material");
        this.material = ler.next();
        System.out.printf("Peso:");
        this.peso = ler.nextDouble();
        System.out.printf("Suporte Máximo:");
        this.suporteMax = ler.nextDouble();
    }
    public void copiar(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.suporteMax = outra.getSuporteMax();
    }
}
