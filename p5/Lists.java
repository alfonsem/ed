package p5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alfonso Esteve
 */
public class Lists {
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new LinkedList<Integer>();
    double totalTiempo;
    double tiempoInicio;
    
    /**
     * 
     * @param args 
     */
    /*public static void main(String[] args) {
        Lists list = new Lists();
        list.RunTimes();
    }*/
    
    /**Método donde paso los test para la mediciones
     * 
     */
    public void RunTimes(){
        for (int i=0; i<1000; i++){
            list1.add(i);
        }
        for (int i=0; i<1000; i++){
            list2.add(i);
        }
        //Test 1 - Insertar un elemento al final de la lista
        tiempoInicio = System.nanoTime();
        list1.add(1000,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 1:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.add(1000,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 2 -  Insertar un elemento al primcipio de la lista
        tiempoInicio = System.nanoTime();
        list1.add(0,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 2:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.add(0,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 3 - Insertar en mitad de la lista
        tiempoInicio = System.nanoTime();
        list1.add(500,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 3:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.add(500,1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 4 - Borrar un elemento del final de la lista
        tiempoInicio = System.nanoTime();
        list1.remove(1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 4:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(1000);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 5 - Borrar un elemento del principio de la lista
        tiempoInicio = System.nanoTime();
        list1.remove(0);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 5:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(0);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 6 - Borrar un elemento de en medio de la lista
        tiempoInicio = System.nanoTime();
        list1.remove(500);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 6:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(500);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 7 - Borrar un elemento del final de la lista por su valor
        tiempoInicio = System.nanoTime();
        list1.remove(990);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 7:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(990);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 8 - Borrar un elemento del principio de la lista por su valor
        tiempoInicio = System.nanoTime();
        list1.remove(4);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 8:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(4);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 9 - Borrar un elemento de en medio de la lista por su valor
        tiempoInicio = System.nanoTime();
        list1.remove(500);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 9:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.remove(500);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 10 - Vaciado completo de la lista
        tiempoInicio = System.nanoTime();
        list1.clear();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 10:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.clear();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 11 - Buscar si existe un elemnto de la lista
        tiempoInicio = System.nanoTime();
        list1.contains(50);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 11:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        list2.contains(50);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 12 - Buscar si existe un elemento en la lista (sin utilizar ningún método de lista)
        //Vuelvo a dar datos a el ArrayList y al LinkedList
        for (int i=0; i<1000; i++){
            list1.add(i);
        }
        for (int i=0; i<1000; i++){
            list2.add(i);
        }
        
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list1.size(); i++){
            if(i==110){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.println("Test 12:");
        System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
        
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list2.size(); i++){
            if(i==110){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
        
        //Test 13 - Buscar si existe un elemento de la lista (de forma binaria)
        int n = list1.size();
        int centro, inf=0, sup = n-1;
        int datoBuscar = 50;
        tiempoInicio = System.nanoTime();
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
                System.out.println("Test 13:");
                System.out.printf("Tiempo demorado para ArrayList:\t %.8f Milisegundos\n",totalTiempo);
                break;
            }else if (50 < list1.get(centro)){
                sup = centro-1;
            }else{
                inf=centro+1;
            }
        }
        tiempoInicio = System.nanoTime();
        
        n = list2.size();
        inf = 0;
        sup = n-1;
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list2.get(centro)==datoBuscar){
                totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
                System.out.printf("Tiempo demorado para LinkedList:\t %.8f Milisegundos\n",totalTiempo);
                break;
            }else if (50 < list2.get(centro)){
                sup = centro-1;
            }else{
                inf=centro+1;
            }
        }
    }
}

