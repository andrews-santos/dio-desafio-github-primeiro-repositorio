package Set;
import java.util.*;

/*O método HashSet traz a lista fora de ordem*/

public class set001 {
    public static void main(String[] args) {
        
        Set<carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new carro("Ford"));
        hashSetCarros.add(new carro("Chevrolet"));
        hashSetCarros.add(new carro("Fiat"));
        hashSetCarros.add(new carro("Peugeot"));
        hashSetCarros.add(new carro("Jac"));

        System.out.println(hashSetCarros);


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