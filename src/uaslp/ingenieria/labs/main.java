package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.List;

//import java.util.List;


public class main {

    // Inner classes: Agrega clases dentro de otra, en este ejemplo es node, iterator y reverseIterator en LinkedList.
    // Outer classes

     public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();
        // Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes no pueden ser cambiadas o alteradas

        List<Integer> lista1 = new LinkedList<>();
        List<String> lista2 = new LinkedList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);
        lista1.add(100);

        lista2.add(" Hola ");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming ");
        lista2.add(" Adios");

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        it = lista1.getReverseIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<String> itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }
    }
}