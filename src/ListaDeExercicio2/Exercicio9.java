package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numéro ");
        float num1 = scan.nextFloat();

        System.out.println("Digite o segundo numéro ");
        float num2 = scan.nextFloat();

        System.out.println("Digite o terceiro numéro ");
        float num3 = scan.nextFloat();

        if (num1>num2 & num2>num3){
            System.out.println(num1 +"-" +num2+"-"+num3);
        }else if (num1>num2 & num3>num2){
            System.out.println(num1 +"-" +num3 +"-");
        }else if (num2>num1 & num1>num3){
            System.out.println(num2 +"-" +num1 +"-"+num3);
        }else if (num2>num1 & num3>num1){
            System.out.println(num2 +"-" +num3 +"-" +num1);
        }else if (num3>num2 & num2>num1){
            System.out.println(num3 +"-" + num2 +"-" +num1);
        }else if (num3>num1 & num1>num2){
            System.out.println(num3 + "-" +num1 +"-" +num2);
        }else if (num1==num2 & num2==num3){

            System.out.println(num1 +"-"+ num2 +"-" +num3);

        }else if (num1 == num2 & num1>num3){
            System.out.println(num1 +"-" + num2 + "-" +num3);
        }else if (num1 == num3 & num1>num2){
            System.out.println(num1+"-" +num3+"-" +num2);
        }
        else if (num2 == num3 & num2>num1){
            System.out.println(num2 +"-"+num3+"-" +num1);
        }else if (num2 == num1 & num1>num3){
            System.out.println(num2 +"-" + num1 +"-" +num3);
        }else if (num3 == num1 & num3>num2 ){
            System.out.println(num3 +"-" +num1 +"-" +num2);
        }else if (num3 ==num2 & num3>num1){
            System.out.println(num3 +"-"+ num2 +"-" +num1);
        }



    }
}
