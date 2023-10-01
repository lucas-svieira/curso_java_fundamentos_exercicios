package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regrade3 {
    public static void main(String[] args){
        //variaveis
        double x, y, valor;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //Entrada
        System.out.println("Regra de 3");
        System.out.println("x% de y = valor");
        System.out.println("Digite o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = teclado.nextDouble();
        //processamento
        valor = (x * y) / 100;
        System.out.println(x + "% de " + y + " = " +  formatador.format(valor));




    }


}
