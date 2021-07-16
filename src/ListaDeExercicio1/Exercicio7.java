package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe um lado do quadrado ");
        double raio = Scan.nextDouble();
        double result = Math.pow(raio, 2);
        System.out.println("A área é " + result);
        double res = result * 2;
        System.out.println(res);

    }
}

