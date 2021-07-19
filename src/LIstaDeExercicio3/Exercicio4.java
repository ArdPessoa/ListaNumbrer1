package LIstaDeExercicio3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pA = 80000;
        int pB = 200000;
        int cont = 0;

        while (pA < pB){
            pA += (pA/100) * 3;
            pB += (pB/100) * 1.5;
            cont++;
        }
        System.out.println("População: " + pA);
        System.out.println("População: " + pB);
        System.out.println("Qtd anos:  " + cont);
    }

}
