package exerciciosLoop;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class ForFatorial {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe um número para cálculo do Fatorial: ");
        int fatorial = input.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);


    }
    
}
