package List;
import java.util.ArrayList;
import java.util.List;



public class list003 {
    public static void main(String[] args) {
        
        List<carro> listCarros = new ArrayList<>();

        listCarros.add(new carro("Ford"));
        listCarros.add(new carro("Chevrolet"));
        listCarros.add(new carro("Fiat"));
        listCarros.add(new carro("Peugeot"));
        listCarros.add(new carro("Jac"));

        System.out.println(listCarros);

        System.out.println("Demonstrar quem está no indice 2: ");
        System.out.println(listCarros.get(2));

        System.out.println("Em qual índice  está o Jac ?");
        System.out.println(listCarros.indexOf(new carro("Jac")));

        System.out.println("Removendo o Índice 3...");
        System.out.println(listCarros.remove(3));
        System.out.println(listCarros);


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