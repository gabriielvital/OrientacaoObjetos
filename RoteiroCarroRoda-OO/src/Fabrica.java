import Classes.Carro;
import Classes.Roda;

public class Fabrica {
    public static void main(String[] args ){
        System.out.println("Hello World!");
        Carro c1;
        c1 = new Carro();
        c1.preencher();
        System.out.println(c1.getMotor());
    }
}