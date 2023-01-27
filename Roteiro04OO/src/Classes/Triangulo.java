package Classes;
import Classes.Ponto;

public class Triangulo {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    public Triangulo(){
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();
    }
    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }

    public void imprimir(){
        System.out.println("O Ponto 1 é:");
        this.p1.imprimir();
        System.out.println("O Ponto 2 é:");
        this.p2.imprimir();
        System.out.println("O Ponto 3 é:");
        this.p3.imprimir();
    }
    /*
      Determinante é: |x1 y1 1|
                      |x2 y2 1|
                      |x3 y3 1|
 */
    public double determinante(){
        double determinante = 0.0;
        determinante = (((this.getP1().getX() * this.getP2().getY() * 1) + (this.getP1().getY() * 1 * this.getP3().getX()) + (1 * this.getP2().getX() * this.getP3().getY()))-
                ((1 * this.getP2().getY() * this.getP3().getX()) + (this.getP1().getY() * this.getP2().getX() * 1) + (this.getP1().getX() * 1 * this.getP3().getY())));
        return determinante;
    }

    public double area(){
        return this.determinante()/2;
    }
    public void isColineares() {
        if (this.determinante() == 0) {
            System.out.printf("Os pontos são colineares");
        } else {
            System.out.printf("Os Pontos não são colineares");
        }
    }
    /*
        o perimetro do ponto é a soma das distancias entre os pontos p1 - p2 + p2 - p3 + p3 - p1
     */
    public double perimetro(){
        return this.p1.distancia(this.getP2()) + this.p2.distancia(this.getP3()) + this.p3.distancia(this.getP1());
    }

    public void tipo(){
        if ((this.p1.distancia(this.getP2())) == (p2.distancia(this.getP3())) &&
                 (p2.distancia(this.getP3())== (this.p3.distancia(this.getP1())))){
            System.out.println("É Equilatero");
        } else if ((this.p1.distancia(this.getP2())) == (p2.distancia(this.getP3())) ||
                (p2.distancia(this.getP3())== (this.p3.distancia(this.getP1())))) {
            System.out.println("É Isoceles");
        } else {
            System.out.println("É Escaleno");
        }
    }
}