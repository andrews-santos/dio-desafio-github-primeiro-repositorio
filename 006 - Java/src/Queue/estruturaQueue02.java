package Queue;
import java.util.LinkedList;
import java.util.Queue;



public class estruturaQueue02 {
    public static void main(String[] args) {
        
       
        Queue<carro> queueCarro = new LinkedList<carro>(); 
            
            queueCarro.add(new carro("Ford"));
            queueCarro.add(new carro("Fiat"));
            queueCarro.add(new carro("Peugeot"));
            queueCarro.add(new carro("Jac"));


        System.out.println("Inicial Queue " + queueCarro);
  
        queueCarro.remove(new carro("Peugeot"));
  
        System.out.println("Depois do Remove " + queueCarro);
  
        //o método poll() também é usado para remover a cabeça e devolvê-la. 
        System.out.println("Poll Method " + queueCarro.poll());
  
        System.out.println("Final Queue " + queueCarro);



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