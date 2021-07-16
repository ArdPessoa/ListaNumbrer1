package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço da marca 1");
        float marca1 = scan.nextFloat();

        System.out.println("Digite o preço da marca 2");
        float marca2 = scan.nextFloat();

        System.out.println("Digite o preço da marca 3");
        float marca3 = scan.nextFloat();

        if (marca1<marca2 & marca1<marca3){
            System.out.println("O produto mais barato é o da marca 1");
        }else if (marca2<marca1 & marca2<marca3){
            System.out.println("O produto mais barato é da marca 2");
        }else if (marca3<marca1 & marca3<marca2){
            System.out.println("O produto mais barato é o da marca 3");
        }else if (marca1==marca2 & marca1<marca3){
            System.out.println("O produto da marca 1 e o da marca 2 tem o mesmo valor");
        }else if (marca2==marca3 & marca2<marca1){
            System.out.println("O produto da marca 2 e o da marca 3 tem o mesmo valor");
        }else if (marca1==marca3 & marca1<marca2){
            System.out.println("O produto da marca 1 e o da marca 3 tem o mesmo valor");
        }else if (marca1==marca2 & marca2==marca3){
            System.out.println("Todos os produtos tem o mesmo preço");
        }

    }
}
