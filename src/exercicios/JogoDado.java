package exercicios;

import java.util.Scanner;

public class JogoDado {
    public static void main(String[] args){
        //variáveis
        char opcao = 's';

        //objetos
        Scanner teclado = new Scanner(System.in);

        //Processo
        while  (opcao == 's') {
            System.out.println("Lançamento do DADO..................");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.println("Deseja lançar o dado novamente (s/n)?");
            opcao = teclado.next().charAt(0);
            
        }

    }
}
