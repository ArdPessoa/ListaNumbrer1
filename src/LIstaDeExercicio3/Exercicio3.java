package LIstaDeExercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        boolean infoValida = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.next();
        while (nome.length() <= 3) {
            System.out.println("Nome invalido, insira novemente seu nome");
            nome = scan.next();
        }
        System.out.println("idade");
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida, insira novamnete");
            idade = scan.nextInt();
        }
        System.out.println("Salário");
        int sala = scan.nextInt();
        while (sala <= 0) {
            System.out.println("Salário invalido, insira novamente");
            sala = scan.nextInt();
        }

        boolean ff;
        do {
            System.out.println("Qual seu sexo F/M");
            String sx = scan.next();
            if (sx.equalsIgnoreCase("f") || sx.equalsIgnoreCase("m")) {

            } else System.out.println("O sexo precisa ser definido como F ou M");
            sx = scan.next();
        }
        while (ff = false);

        do {
            System.out.println("Qual seu estado civil");
            String es = scan.next();
            if (es.equalsIgnoreCase("c") || es.equalsIgnoreCase("s") ||
                    es.equalsIgnoreCase("v") || es.equalsIgnoreCase("d")) {
            } else {
                System.out.println("O estado civil precisa ser colocado como 's' 'd' 'c' 'v' ");
                es = scan.next();
            }
        } while (ff);
        System.out.println("Obrigado pela confiaça");
    }
}



    
    
    
