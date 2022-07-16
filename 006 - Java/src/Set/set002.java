package Set;
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class set002 {
    public static void main(String[] args) {
        Set<carro>hashSetCarro = new HashSet<>();

        hashSetCarro.add(new carro("Ford"));
        hashSetCarro.add(new carro("Fiat"));
        hashSetCarro.add(new carro("Peugeot"));
        hashSetCarro.add(new carro("Jac"));

        System.out.println(hashSetCarro);


    }

    
}






class carro implements Comparable<carro>{

    private String marca;

    /*gerando os gets */
    public String getMarca() {
        return marca;
    }
    /*gerando os sets */   
        public void setMarca(String marca) {
            this.marca = marca;
        }

    /* Generate Constructor */
        public carro(String marca) {
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
 

  /* Generate toString */
    @Override
        public String toString() {
            return "carro [marca=" + marca + "]";
        }

  /* Generate Comparable */
    @Override
    public int compareTo(carro o) {
        if(this.marca.length() < o.getMarca().length()){
            return -1;
        }else if(this.marca.length() > o.getMarca().length()){
            return 1;
        }
        return 0;
    }


}



