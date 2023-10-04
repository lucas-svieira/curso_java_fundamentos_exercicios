package array;

public class Array2 {
    public static void main(String[] args) {
        String[][] agenda = {{"José", "91234-1234", "professorjoseassis@gmail.com"}, {"Bill", "2222-2222", "bill@outlook.com"},
        {"linus", "99999-9999", "tux@linux.com"}};
        //a linha abaixo recupera telefone de josé
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("___________________________________________");
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);

            }
          }
        }
    }