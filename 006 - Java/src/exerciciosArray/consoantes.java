package exerciciosArray;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] aConsoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = input.next();

            if( !(
                letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") 
            )

            ){
                aConsoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        }while(count < aConsoantes.length);
        System.out.println("Consoantes: ");
        for (String novo : aConsoantes){
            if (novo != null)
            System.out.println(novo); 
        }
        System.out.println("quantidadeConsoantes "+ quantidadeConsoantes);
    }
    
    
}
