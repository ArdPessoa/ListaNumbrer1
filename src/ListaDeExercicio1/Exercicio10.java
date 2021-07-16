package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus  Celsius?");
        float temp = Scan.nextFloat();
        System.out.println((temp * 1.8) + 32);
    }
}

