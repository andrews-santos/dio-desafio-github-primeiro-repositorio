package exerciciosLoop;
import java.util.Scanner;

public class nomeIdade {
    public static void main(String[]args){
        Scanner texto = new Scanner(System.in);

        String nome;
        String idade;
        
        while (true) {
            
          
            System.out.println("Digite o nome ou 0 Para encerrar a aplicação: ");
            nome = texto.next();

            if (nome.equals("0"))break; 
           
            System.out.println("Digite a idade: ");
            idade = texto.next(); 
           
            
        }
      
    
    }
    
}
