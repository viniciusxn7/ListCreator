import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String reason = "";
        String item = "";

        while(!reason.equalsIgnoreCase("S")){

            System.out.println("==========================================\n" +
                    "Bem-Vindo ao sistema de listas, oque gostaria de fazer?\n" +
                    "==========================================\n" +
                    "A = Adicionar um item\n" +
                    "M = Mostrar minha lista\n" +
                    "R = Remover intem da lista\n" +
                    "Q = Quantidade de itens\n" +
                    "S = Sair");

            reason = input.nextLine();

            if(reason.equalsIgnoreCase("A")){
                System.out.println("Qual seria o item?");
                item = input.nextLine();
                System.out.println(item + " adicionado ");
                list.add(item);
            }
            else if(reason.equalsIgnoreCase("M")){
                System.out.println(list.toString());
            }
            else if(reason.equalsIgnoreCase("R")){
                System.out.println("Qual item que deseja remover?");
                String ItemParaRemover = input.nextLine();
                list.remove(ItemParaRemover);
                System.out.println("Agora sua lista está desta maneira" + list.toString());
            }
            else  if(reason.equalsIgnoreCase("Q")){
                System.out.println("sua lista tem " + list.toArray().length + " items");
            }
            else{
                System.out.println("Comando não encontrado");
            }
        }

    }
}