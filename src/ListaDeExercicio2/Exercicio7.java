package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numéro");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo numéro");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro numéro");
        double num3 = scan.nextDouble();

        if (num1 > num2 & num1 > num3) {
            System.out.println("O maior numéro é o " + num1);
        } else if (num2 > num1 & num2 > num3) {
            System.out.println("O maior numéro é o " + num2);
        } else if (num3 > num1 & num3 > num2) {
            System.out.println("O maior numéro é o " + num3);
        }


        if (num1 < num2 & num1 < num3) {
            System.out.println("O menor numéro é o " + num1);
        } else if (num2 < num1 & num2 < num3) {
            System.out.println("O menor numéro é o " + num2);
        } else if (num3 < num2 & num3 < num1) {
            System.out.println("O menor numéro é o " + num3);
        } else if (num1 == num2 & num1 < num3) {
            System.out.println("O primeiro e o segundo valor são iguais");
        } else if (num2 == num3 & num2 < num1) {
            System.out.println("O Segundo e o terceiro valor são iguais");
        } else if (num1 == num3 & num1 < num2) {
            System.out.println("O primeiro e o terceiro valor são iguais");
        } else if (num1 == num2 & num2 == num3) {
            System.out.println("Todos os valores são iguais");
        }
    }
}


