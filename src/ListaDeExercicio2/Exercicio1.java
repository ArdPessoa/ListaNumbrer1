package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numéro");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numéro");
        double num2 = scan.nextDouble();
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        }
    }
}


