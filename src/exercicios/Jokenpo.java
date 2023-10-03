package exercicios;

import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args){
        int jogador, computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("__________________JokenPô__________________");
        System.out.println("");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite a opção desejada: ");
        jogador = teclado.nextInt();
        System.out.println("");
        //processamento
        switch (jogador){
            case 1:
                System.out.println("Você escolheu Pedra");
                break;
            case 2:
                System.out.println("Você escolheu Papel");
                break;
            case 3:
                System.out.println("Você escolheu Tesoura");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();
        //logica do computador
        computador = (int)(Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu Pedra");
                break;
            case 2:
                System.out.println("Computador escolheu Papel");
                break;
            case 3:
                System.out.println("Computador escolheu Tesoura");
                break;
        }
        //lógica para determinar o vencedor
        System.out.println("");
        if (jogador == computador){
            System.out.println("EMPATE");
        }else {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)||
                    (jogador == 3 && computador == 2 )){
                System.out.println("VOCÊ VENCEU");


            }else {
                System.out.println("COMPUTADOR VENCEU");
            }
        }
    }
}

