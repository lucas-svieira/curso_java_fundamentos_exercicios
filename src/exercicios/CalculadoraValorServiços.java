package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraValorServiços {
    public static void main(String[] args){
        //Variáveis
        double hora, remuneracao, custo, cargaHoraria;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //Entrada
        System.out.print("Digite a meta de remuneração mensal: ");
        remuneracao = teclado.nextDouble();
        System.out.print("Digite seu total de gastos com custos:  ");
        custo = teclado.nextDouble();
        System.out.print("Digite a carga horária do serviço: ");
        cargaHoraria = teclado.nextDouble();
        //processamento
        hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
        //saída
        System.out.println("O valor de sua hora de serviço é: " + formatador.format(hora));
        teclado.close();

    }
}
