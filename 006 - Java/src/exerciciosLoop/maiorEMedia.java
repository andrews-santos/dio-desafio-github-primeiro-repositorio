package exerciciosLoop;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class maiorEMedia {
    public static void main(String[] args) {
        int numero=0;
        int maior=0;
        int soma=0;
        int media=0;
        int count=0;
        Scanner input = new Scanner(System.in);
        

        do{
            System.out.println("Numero: ");
            numero = input.nextInt();
            count++;
            
            soma = soma + numero;

            if (numero > maior) maior = numero;

            System.out.println(maior);
        }while(count<5);
        media=(soma/count);
            System.out.println("Maior: " + maior);
            System.out.println("Média: " + media);

    }
}
