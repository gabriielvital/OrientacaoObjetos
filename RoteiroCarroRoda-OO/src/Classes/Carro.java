package Classes;
import Classes.Roda;
import java.util.*;

public class Carro {
    //atributos
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda[] rodas = new Roda[4];

    //métodos
    public Carro() {
        this.setFabricante("");
        this.setModelo("");
        this.setMotor(0.0);
        for (int i = 0; i < 4; i++) {
            this.rodas[i] = new Roda();
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Roda[] getRodas() {
        return this.rodas;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe os dados do carro");
        System.out.printf("\nFabricante:");
        this.fabricante = ler.nextLine();
        System.out.printf("\nModelo");
        this.modelo = ler.nextLine();
        System.out.printf("\nCor:");
        this.cor = ler.nextLine();
        System.out.printf("\nMotor:");
        this.motor = Double.parseDouble(ler.next());
        //ler.nextLine();
        this.rodas[0].preencher();
        for (int i = 1; i < 4; i++) {
            this.rodas[i].copiar(this.rodas[0]);
        }
    }
}