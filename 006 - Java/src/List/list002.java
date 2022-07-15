package List;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;



public class list002 {
    public static void main(String[] args) {

        
        List<previsao> showTemperatura = new ArrayList<>(){{

            add(new previsao("Janeiro   ", 32));
            add(new previsao("Fevereiro ", 32));
            add(new previsao("Março     ", 31));
            add(new previsao("Abril     ", 28));
            add(new previsao("Maio      ", 27));
            add(new previsao("Junho     ", 26));
            add(new previsao("Julho     ", 27));
            add(new previsao("Agosto    ", 28));
            add(new previsao("Setembro  ", 32));
            add(new previsao("Outubro   ", 34));
            add(new previsao("Novembro  ", 32));
            add(new previsao("Dezembro  ", 33));

        }};

           
         System.out.println(showTemperatura);

      
      
   


        System.out.println("ordenando por temperatura Asc: ");
          //  showTemperatura.sort(new compararTemperatura());
         //   System.out.println(showTemperatura);
        
                /*Ou desta forma */
          //  showTemperatura.sort(Comparator.comparing(previsao::getGrauTemperatura));
          //  System.out.println(showTemperatura);


            System.out.println("ordenando por nome do mês: ");
            showTemperatura.sort(Comparator.comparing(previsao::getMes));
            System.out.println(showTemperatura);

     
    }
}


/*1º criar a classe */
class previsao {
    private String mes;
    private Integer grauTemperatura;

/*2º criar um construtor */
    public previsao(String mes, Integer grauTemperatura) {
        this.mes = mes;
        this.grauTemperatura = grauTemperatura;
    }
/*3º criar os gets */

    public String getMes() {
        return mes;
    }

    public Integer getGrauTemperatura() {
        return grauTemperatura;
    }


/*4º Para não demonstrar os dados como endereço de memória => generate ToString: */
    @Override
    public String toString() {
        return "previsao [grauTemperatura=" + grauTemperatura + ", mes=" + mes + "]";
    }
    
}


/**
 * caso necessário utilizar o comparator
 */

class compararTemperatura  implements Comparator<previsao>{

    @Override
    public int compare(previsao p1, previsao p2){
        return Integer.compare(p1.getGrauTemperatura(), p2.getGrauTemperatura());
    }
    

    
}