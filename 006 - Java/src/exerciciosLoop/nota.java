package exerciciosLoop;
import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite a Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida !! Digite novamente.\nDigite a Nota: ");
            nota = scan.nextInt();
        }
        
        if(nota >= 0 | nota <= 10) {
            System.out.println("Nota "+nota+" recebida com sucesso, Obrigado !");
        }

    }
        
    
}
