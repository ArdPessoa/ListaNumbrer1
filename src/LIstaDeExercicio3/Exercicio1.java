package LIstaDeExercicio3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma nota :(0 - 10)");
        int nota = scan.nextInt();


        while (nota < 0 || nota > 10){
            System.out.print("Nota invalida, repita");
            nota = scan.nextInt();
        }


System.out.println("Obriagdo pela avaliação!");
    }
}
