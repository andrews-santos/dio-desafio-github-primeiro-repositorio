package Queue;
import java.util.LinkedList;
import java.util.Queue;



public class estruturaQueue {
    public static void main(String[] args) {
        
       
        Queue<carro> queueCarro = new LinkedList<carro>(); 
            
            queueCarro.add(new carro("Ford"));
            queueCarro.add(new carro("Chevrolet"));
            queueCarro.add(new carro("Fiat"));
            queueCarro.add(new carro("Peugeot"));
            queueCarro.add(new carro("Jac"));

 


            
            System.out.println(queueCarro);

            //Pega o elemento da cabeça da fila sem remover
            System.out.println(queueCarro.element());
            System.out.println(queueCarro);

            // Inserts the specified element into this queue -> Retorna false se não conseguir
            System.out.println(queueCarro.offer(new carro("Renault"))); 
            System.out.println(queueCarro);

            //Pega o elemento da cabeça da fila e se tiver vazia null -> sem remover
            System.out.println(queueCarro.peek());
            System.out.println(queueCarro);

            //Remove
            System.out.println(queueCarro.remove(new carro("Renault")));
            System.out.println("Status: ");
            System.out.println(queueCarro);

            //Remove ou retorna nulo para caso de fila vazia
            System.out.println(queueCarro.poll()); 
            System.out.println("Status: ");
            System.out.println(queueCarro);

            System.out.println("Está Vazio? ");

            System.out.println(queueCarro.isEmpty());
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