package LIstaDeExercicio3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pA;
        double pB = 0;
        double taxaA;
        double taxaB;

        boolean valido = false;
        do{
            System.out.println("Entre com a população A: ");
            pA = scan.nextDouble();
            if(pA > 0){
                valido = true;
            }else {
                System.out.println("População A precisar ser maior que 0");
            }
        }while (!valido);

        int cont = 0;

        valido = false;
        do{
            System.out.println("Entre com a população B: ");
            pA = scan.nextDouble();
            if(pA > 0){
                valido = true;
            }else {
                System.out.println("População B precisar ser maior que 0");
            }
        }while (!valido);

        valido = false;
        do{
            System.out.println("Entre com a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();
            if(taxaA  > 0){
                valido = true;
            }else {
                System.out.println("taxa de crescimento precisar ser maior que 0");
            }
        }while (!valido);

        valido = false;
        do{
            System.out.println("Entre com a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();
            if(taxaB  > 0){
                valido = true;
            }else {
                System.out.println("taxa de crescimento precisar ser maior que 0");
            }
        }while (!valido);

        
        while (pA<pB){
            pA += (pA/100) * taxaA;
            pB += (pB/100) * taxaB;
            cont++;
        }
        System.out.println("População: " + pA);
        System.out.println("População: " + pB);
        System.out.println("Qtd anos:  " + cont);
    }
}
