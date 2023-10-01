package poo;

public class Aviao  extends Carro{
    double envergadura;

    void aterrizar(){
        System.out.println("--------____________");
    }

    @Override
    void acelerar() { System.out.println("__________---------");}
}
