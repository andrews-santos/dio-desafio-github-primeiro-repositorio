import metodos.exercicio01.calculadora;
import metodos.exercicio01.emprestimo;
import metodos.exercicio01.mensagem;
import metodos.sobrecarga.quadrilatero;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Exercício Calculadora */
            System.out.println("Exercício calculadora");
            calculadora.soma(50, 90);
            calculadora.subtracao(85, 35);
            calculadora.multiplicacao(8, 18);
            calculadora.divisao(10, 12);

        /* Exercício Mensagem */
            System.out.println("Exercício Mensagem");
            mensagem.obterMensagem(3);
            mensagem.obterMensagem(13);
            mensagem.obterMensagem(20);    
         
         /* Exercício Empréstimo */
         System.out.println("Exercício Empréstimo");   
         emprestimo.calcular(6000, 3); 
         emprestimo.calcular(6000, emprestimo.getDuasParcelas()); 
       
        /* Exercício Sobrecarga */
        System.out.println("Exercício Sobrecarga");  
        quadrilatero.area(3);
        quadrilatero.area(2f);
        quadrilatero.area(5d);
        quadrilatero.area(7,8,9);
        quadrilatero.area(5f,5f);

    }
}
