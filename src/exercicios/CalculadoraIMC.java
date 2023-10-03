package exercicios;


import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        //Variáveis
        double imc, peso, altura;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //Entradas
        System.out.println("Calculadora de IMC:");
        System.out.print("Digite o seu peso atual em kg: ");
        peso = teclado.nextDouble();
        System.out.print("Digite a sua altura atual: ");
        altura = teclado.nextDouble();
        teclado.close();
        //processamento
        imc = peso / (altura * altura);
        //saida1
        System.out.println("IMC: " + formatador.format(imc));
        //demais saidas
        if (imc < 18.5){
            System.out.println("Você está no peso ideal");
        }else if (imc < 25 ) {
            System.out.println("Você está no peso ideal");
        }else if (imc < 30) {
            System.out.println("Você está levemente acima do peso");
        }else if (imc < 35 ) {
            System.out.println("Obesidade grau I");
        }else if (imc < 40) {
            System.out.println("Obesidade grau II (severa)");
        }else{
            System.out.println("Obesidade III (morbída)");
        }


    }
}
