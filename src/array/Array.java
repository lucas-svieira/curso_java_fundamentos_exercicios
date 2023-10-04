package array;

public class Array {
    public static void main(String[] args){
        String[] carros ={"ferrari", "gol", "uno", "fusca", "golf"};
        System.out.println("Tamanho do array: " +carros.length);
        System.out.println("Carro: " +carros[3]);
        carros[3] = "camaro";
        System.out.println("Carro: " +carros[3]);
        System.out.println("____________________________________________");
        System.out.println("Carros");
        for (int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
    }
}
