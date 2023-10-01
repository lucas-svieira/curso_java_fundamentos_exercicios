package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontodeVendas {
    public static void main(String[] args){
        //Variáveis
        double total, desconto, totalDesconto, valorPago, troco;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //entrada 1
        System.out.print("Digite o valor total da mercadoria: ");
        total = teclado.nextDouble();
        System.out.print("Digite o valor de desconto em %:");
        desconto = teclado.nextDouble();
        //processamento 1
        totalDesconto = total - (desconto * total)/100;
        //saida 1
        System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto) );
        //entrada2
        System.out.println("______________________________________");
        System.out.print("Digite o valor pago pelo cliente: ");
        valorPago = teclado.nextDouble();
        //processamento2
        troco = valorPago - totalDesconto;
        //saida 2
        System.out.println("Troco: R$ " + formatador.format(troco));
        teclado.close();






    }


}
