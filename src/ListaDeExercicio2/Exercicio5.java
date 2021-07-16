package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno");
        double nt1 = scan.nextDouble();

        System.out.println("Informe a segunda nota");
        double nt2 = scan.nextDouble();

        double media = (nt1 + nt2) / 2;
        System.out.println("A media foi " + media);
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
