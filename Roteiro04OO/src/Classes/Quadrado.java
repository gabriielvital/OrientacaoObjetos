package Classes;

public class Quadrado {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    private Ponto p4;
    public Quadrado() {
        setP1(new Ponto());
        setP2(new Ponto());
        setP3(new Ponto());
        setP4(new Ponto());
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

    public Ponto getP4() {
        return p4;
    }

    public void setP4(Ponto p4) {
        this.p4 = p4;
    }
    public void imprimir(){
        System.out.println("Os pontos são:");
        this.p1.imprimir();
        this.p2.imprimir();
        this.p3.imprimir();
        this.p4.imprimir();
    }
/*
        a distancia é base * altura
 */
    public double area(){
        return p1.distancia(getP2()) * p2.distancia(getP3());
    }

    public double perimetro(){
        return p1.distancia(getP2()) + p2.distancia(getP3()) + p3.distancia(getP4()) + p4.distancia(getP1());
    }

    public void verificarQuadrado(){
        double hipotenusa,catetoAdj,catetoOpst;
        hipotenusa = p1.distancia(getP3());
        catetoAdj = p1.distancia(getP2());
        catetoOpst = p2.distancia(getP3());

        if(Math.pow(hipotenusa,2) == (Math.pow(catetoAdj,2)+Math.pow(catetoOpst,2))){
            System.out.println("É quadrado!");
        }else{
            System.out.println("Não é quadrado!");
        }
    }
}
