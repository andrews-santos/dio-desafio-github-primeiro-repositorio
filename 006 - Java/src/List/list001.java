package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;





public class list001 {

    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Relação das 7 notas:");
        System.out.println(notas.toString());
        
        System.out.println("Exibindo a posição da nota 5.0:");
        System.out.println(notas.indexOf(5d));
        
        System.out.println("Adicionando nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substituindo a nota 5 pela nota 6:");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Conferindo se a nota 5.0 está na lista:" );
        System.out.println(notas.contains(5d));

        System.out.println("Exibindo a terceira nota adicionada:" );
        System.out.println(notas.get(2));

        System.out.println("Exibindo menor nota:" );
        System.out.println(Collections.min(notas));

        System.out.println("Exibindo maior nota:" );
        System.out.println(Collections.max(notas));


        System.out.println("Exibindo a soma das notas:" );
            Iterator <Double> iterator = notas.iterator(); 
            Double soma = 0D;
            while(iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
            }
            System.out.println(soma);

            System.out.println("Exibindo a media das notas:" );
            System.out.println(soma/notas.size());

            System.out.println("Removendo a nota da porsição 0:" );
            System.out.println(notas.remove(0));

            System.out.println(notas);
            System.out.println("Removendo a nota 0.0:" );
            System.out.println(notas.remove(0D));

            System.out.println(notas);
            System.out.println("Removendo as notas menores que 7" );
                Iterator <Double> iterator2 = notas.iterator();
                    while(iterator2.hasNext()){
                        Double next = iterator2.next();
                        if (next < 7 ) iterator2.remove();
                    }
            System.out.println(notas);

            System.out.println("Apagando a Lista..." );
            notas.clear();
            System.out.println("Checando, a lista está vazia ? :" + notas.isEmpty() );

    }

    
}