package array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> contatos = new ArrayList<>();
        contatos.add("José de Assis");
        contatos.add("99999-9999");
        contatos.add("ze@email.com");
        contatos.add("Robson Vaamond");
        contatos.add("55555-4444");
        contatos.add("vava@email.com");
System.out.println(contatos);
System.out.println("Email José de Assis: " + contatos.get(2));
System.out.println("Tamano da array: " + contatos.size());
for (int i = 0; i < contatos.size(); i++) {
    System.out.println(contatos.get(i));
        }

    }
}
