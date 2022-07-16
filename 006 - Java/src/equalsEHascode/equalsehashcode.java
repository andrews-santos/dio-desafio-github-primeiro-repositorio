package equalsEHascode;
//import java.util.Objects;
import java.util.ArrayList;
import java.util.List;




public class equalsehashcode {
    public static void main(String[] args) {
        
        List<carro> listCarros = new ArrayList<>();

        listCarros.add(new carro("Ford"));
        listCarros.add(new carro("Chevrolet"));
        listCarros.add(new carro("Fiat"));
        listCarros.add(new carro("Peugeot"));
        listCarros.add(new carro("Jac"));

       System.out.println("listCarros:");
        /*Verificando se existe Ford */
       System.out.println(listCarros.contains(new carro("Ford")));
       /*Verificando o hashCode do Ford */
       System.out.println("Ford: "+ new carro("Ford").hashCode());
       /*Verificando o hashCode do Peugeot */
       System.out.println(new carro("Peugeot").hashCode());

      


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