package exercicios;
import java.util.Scanner;

public class CalculadoraFuelCarroFlex {
    public static void main(String[] args){
        //Variáveis
        double alcool, gasolina;
        //objetos
        Scanner teclado = new Scanner(System.in);
        //entrada
        System.out.println("Alcool x Gasolina:");
        System.out.print("Informe o valor do alcool: ");
        alcool = teclado.nextDouble();
        System.out.print("Informe o valor da gasolina: ");
        gasolina = teclado.nextDouble();
        teclado.close();
        //logica
        if (alcool < 0.7 * gasolina){
            System.out.println("Vale a pena você abastecer com alcool!!");
        }else {
            System.out.println("Vale mais a pena você abastecer com gasolina");
        }

    }
}
