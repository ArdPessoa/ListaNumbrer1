package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
            System.out.println("Informe o numero");
        double num1 = Scan.nextDouble();
        if (num1 < 0) {
            System.out.println("O valor é negativo");
        } else if (num1 >= 0) {
            System.out.println("O valor é positivo");
        }
    }
}
