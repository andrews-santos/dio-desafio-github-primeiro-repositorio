package stack;
import java.util.Stack;



public class stack {
    public static void main(String[] args) {
        Stack<carro> stackCarros = new Stack<>();
        stackCarros.push(new carro("Ford"));
        stackCarros.push(new carro("Chevrolet"));
        stackCarros.push(new carro("Fiat"));
        stackCarros.push(new carro("Peugeot"));
        stackCarros.push(new carro("Jac"));
     
       
        //System.out.println(stackCarros);
        
         // Checking for the element "Ford" (Retorna a Posição[iniciando do 1]; se não encontrar retorna -1)
        System.out.println("Does the stack contains 'Ford'? "+ stackCarros.search(new carro("Ford")));
        
        
        //método pop() . O elemento é retirado do topo da pilha e é removido da mesma
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);


        //Para recuperar ou buscar o primeiro elemento do Stack (Não Remove do Stack)
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        //Verifica se a Stack está vazia
        System.out.println("Está vazia ?");
        System.out.println(stackCarros.empty());

      
    
    }
    
}



class carro {
    String marca;
/*gerando os gets */
    public String getMarca() {
        return marca;
    }
/*gerando os sets */   
    public void setMarca(String marca) {
        this.marca = marca;
    }

 /*Generate hashcod and equals */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        carro other = (carro) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

/* Generate Constructor */
    public carro(String marca) {
        this.marca = marca;
    }


  /* Generate toString */
    @Override
    public String toString() {
        return "carro [marca=" + marca + "]";
    }
    
}