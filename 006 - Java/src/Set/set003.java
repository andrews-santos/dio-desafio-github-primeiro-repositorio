package Set;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class set003 {
    public static void main(String[] args) {
        
       
        Set<carro> treeSetCarro = new TreeSet<>();

        treeSetCarro.add(new carro("Ford"));
        treeSetCarro.add(new carro("Fiat"));
        treeSetCarro.add(new carro("Peugeot"));
        treeSetCarro.add(new carro("Jac"));

        System.out.println(treeSetCarro);

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



         /* Generate Comparetor */


    @Override
    public int compareTo(carro marc) {
       if(this.marca == marc.getMarca() ){
        return 1;
       }else
        return -1;
    }
   
   
  
        




   
      /*
       
        public int compareTo(carro stu){
            return this.marca.compareTo(stu.getMarca());
        }
*/
  /* Generate Comparable */
//    @Override
//    public int compareTo(carro o) {
//        if(this.marca.length() < o.getMarca().length()){
//            return -1;
//        }else if(this.marca.length() > o.getMarca().length()){
//            return 1;
//        }
//        return 0;
//    }


}



