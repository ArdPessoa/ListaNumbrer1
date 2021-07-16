package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String let1 = scan.next();
        switch (let1) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("A letra é uma vogal");
                break;
            default:
                System.out.println("É uma consoante");
        }
    }
}
