package poo;

public class Camaro {
    public static void main(String[]args){

        Carro camaro = new Carro();
        camaro.ano = 2012;
        camaro.cor = "amarelo";
        System.out.println("Carro: Ferrari");
        System.out.println("Ano: " +camaro.ano);
        System.out.println("Cor: " + camaro.cor);
        camaro.ligar();
        camaro.acelerar();

    }

}
