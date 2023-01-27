package Classes;

public class Ponto {
    private double x;
    private double y;
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void imprimir(){
        System.out.println("O Ponto é: ("+ this.getX() +","+ this.getY() +")");
    }
    /*
        Distancia = raiz de x²+y²
     */
    public double distancia(Ponto outro) {
        double distancia = 0;
        distancia = (Math.sqrt(Math.pow(outro.getX(),2) - Math.pow(this.x,2))+(Math.pow(outro.getY(),2) - Math.pow(this.y,2)));
        return distancia;
    }
}