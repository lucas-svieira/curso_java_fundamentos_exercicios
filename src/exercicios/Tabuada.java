package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //variável
        int valor;
        //objeto
        Scanner teclado = new Scanner(System.in);
        //entrada
        System.out.print("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        teclado.close();
        //processo
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}





