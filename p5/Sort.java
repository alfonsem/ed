package p5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alfonso Esteve
 */
public class Sort {
    List<Integer> list1 = new ArrayList<Integer>();
    double totalTiempo;
    double tiempoInicio;
    
    public void RunTimes(){
        //Test 1 - Ordenamos la lista con el método "Bubble Sort" y una lista ya ordenada
        System.out.println("Test 1 - Ordenamos una lista ya ordenada con el algoritmo \"bubble sort\":");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        int temp;
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        //Test 2 - Ordenamos la lista con el método "Bubble sort" y una lista desordenada
        System.out.println("Test 2 - Ordenamos una lista aleatoria con el algoritmo \"bubble sort\":");
        Random r = new Random();
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        /*for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i).toString());
        }*/
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        /*for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i).toString());
        }*/
        
        //Test 3 - Ordenamos la lista con el método "Bubble Sort" y una lista inversamente ordenada
        System.out.println("Test 3 - Ordenamos una lista inversamente ordenada con el algoritmo \"bubble sort\":");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 4 - Ordenamos la lista con el método "Bubble Sort" y una lista con todos los elementos iguales
        System.out.println("Test 3 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"bubble sort\":");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 5 - Ordenamos la lista con el método "Selection sort"
        System.out.println("Test 5 - Ordenamos una lista ya ordenada con el algoritmo \"selection sort\":");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        int first;
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 6 - Ordenamos la lista con el método "Selection sort" y una lista desordenada
        System.out.println("Test 6 - Ordenamos una lista aleatoria con el algoritmo \"selection sort\":");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 7 - Ordenamos la lista con el método "Selection sort" y una lista inversamente ordenada
        System.out.println("Test 7 - Ordenamos una lista inversamente ordenada con el algoritmo \"selection sort\":");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 8 - Ordenamos la lista con el método "Selection sort" y una lista inversamente ordenada
        System.out.println("Test 8 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"selection sort\":");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 9 - Ordenamos la lista con el método "Insertion sort"
        System.out.println("Test 9 - Ordenamos una lista ya ordenada con el algoritmo \"insertion sort\":");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 10 - Ordenamos la lista con el método "Insertion sort" y una lista desordenada
        System.out.println("Test 10 - Ordenamos una lista aleatoria con el algoritmo \"insertion sort\":");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 11 - Ordenamos la lista con el método "Insertion sort" y una lista inversamente ordenada
        System.out.println("Test 11 - Ordenamos una lista inversamente ordenada con el algoritmo \"insertion sort\":");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 12 - Ordenamos la lista con el método "Insertion sort" y una lista con todos los elementos iguales
        System.out.println("Test 12 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"insertion sort\":");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        tiempoInicio = System.nanoTime();
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 13 - Ordenamos la lista con el método "Quick sort"
        System.out.println("Test 13 - Ordenamos una lista ya ordenada con el algoritmo \"quick sort\":");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        int der = list1.size()-1;
        int izq = 0;
        tiempoInicio = System.nanoTime();
        quickSort(list1, izq, der);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 14 - Ordenamos la lista con el método "Quick sort" y una lista aleatoria
        System.out.println("Test 14 - Ordenamos una lista aleatoria con el algoritmo \"quick sort\":");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        der = list1.size()-1;
        izq = 0;
        tiempoInicio = System.nanoTime();
        quickSort(list1, izq, der);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 15 - Ordenamos la lista con el método "Quick sort" y una lista inversamente ordenada
        System.out.println("Test 15 - Ordenamos una lista inversamente ordenada con el algoritmo \"quick sort\":");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        der = list1.size()-1;
        izq = 0;
        tiempoInicio = System.nanoTime();
        quickSort(list1, izq, der);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 16 - Ordenamos la lista con el método "Quick sort" y una lista con todos los elementos iguales
        System.out.println("Test 16 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"quick sort\":");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        der = list1.size()-1;
        izq = 0;
        tiempoInicio = System.nanoTime();
        quickSort(list1, izq, der);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 17 - Ordenamos la lista con el método "Merge sort"
        System.out.println("Test 17 Ordenamos una lista ya ordenada con el algoritmo \"merge sort\":");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        MergeSort();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 18 - Ordenamos la lista con el método "Merge sort" una lista aleatoria
        System.out.println("Test 18 - Ordenamos una lista aleatoria con el algoritmo \"merge sort\":");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        tiempoInicio = System.nanoTime();
        MergeSort();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 19 - Ordenamos la lista con el método "Merge sort" una lista inversamente ordenada
        System.out.println("Test 19 - Ordenamos una lista inversamente ordenada con el algoritmo \"merge sort\":");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        tiempoInicio = System.nanoTime();
        MergeSort();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 20 - Ordenamos la lista con el método "Merge sort" una lista con todos los elementos iguales
        System.out.println("Test 20 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"merge sort\":");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        tiempoInicio = System.nanoTime();
        MergeSort();
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 21 - Buscar si existe un elemento de una lista ya ordenada (de forma binaria)
        System.out.println("Test 21 - Buscar un elemento de forma binaria en una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        int n = list1.size();
        int centro, inf=0, sup = n-1;
        int datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else{
                inf=centro+1;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 22 - Buscar si existe un elemento de una lista aleatoria (de forma binaria)
        System.out.println("Test 22 - Buscar un elemento de forma binaria en una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 23 - Buscar si existe un elemento de una lista inversamente ordenada (de forma binaria)
        System.out.println("Test 22 - Buscar un elemento de forma binaria en una lista inversamente ordenada:");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 24 - Buscar si existe un elemento de una lista con todos los elementos iguales (de forma binaria)
        System.out.println("Test 22 - Buscar un elemento de forma binaria en una lista con todos los elementos iguales:");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 25 - Buscar si existe un elemento en la lista ya ordenada (de forma secuencial)
        System.out.println("Test 25 - Buscar un elemento de forma secuencial en una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 26 - Buscar si existe un elemento en una lista aleatoria (de forma secuencial)
        System.out.println("Test 26 - Buscar un elemento de forma secuencial en una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 27 - Buscar si existe un elemento en una lista inversamente ordenada (de forma secuencial)
        System.out.println("Test 27 - Buscar un elemento de forma secuencial en una lista inversamente ordenada:");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
        
        //Test 28 - Buscar si existe un elemento en una lista inversamente ordenada (de forma secuencial)
        System.out.println("Test 28 - Buscar un elemento de forma secuencial en una lista con todos los elementos iguales:");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        datoBuscar = 5;
        tiempoInicio = System.nanoTime();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                break;
            }
        }
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("Tiempo demorado:\t %.8f Milisegundos\n",totalTiempo);
        list1.clear();
    }
    
    /**Método para ordenar un ArrayList Quick Sort
     * 
     * @param list
     * @param izq
     * @param der 
     */
    public static void quickSort(List<Integer> list, int izq, int der){
        int pivote = list.get(izq);
        int i = izq;
        int j = der;
        int aux;
        
        while(i<j){
            while(list.get(i)<=pivote && i<j) i++;
            while(list.get(j)>pivote) j--;
            if(i<j){
                aux = list.get(i);
                list.set(i, j);
                list.set(j, aux);
            }
        }
        list.set(izq, j);
        list.set(j, pivote);
        if(izq<j-1)
            quickSort(list, izq, j-1);
        if(j+1<der)
            quickSort(list, j+1, der);
    }
    
    /**Método para el algoritmo "Merge Sort" para ordenar una lista
     * 
     */
    public void MergeSort(){
        if (list1.size()>1){
            recursiveMergeSort(list1);
        }
    }

    /**Método para el algoritmo de "Merge Sort" para ordenar una lista
     * 
     * @param values
     * @return 
     */
    public static List<Integer> recursiveMergeSort( List<Integer> values){
            if (values.size() ==1){
                return values;
            }
            else {
                int mid= values.size()/2;
                List<Integer> left= new ArrayList<Integer>(mid);
                List<Integer> right=new ArrayList<Integer>(values.size()-mid);
                
                for (int i = 0; i < mid; i++) {
                    left.add(values.get(i));
                }
                for (int i = mid; i < values.size(); i++) {
                   right.add(values.get(i));
                }
                
                left=recursiveMergeSort(left);
                right=recursiveMergeSort(right);
                merge(left,right,values);
            }
            return values;
        }
    
    /**Método para el algoritmo de "Merge Sort" para ordenar una lista
     * 
     * @param left
     * @param right
     * @param values 
     */
    public static void merge (List<Integer>left,List<Integer>right,List<Integer>values){

            int i1=0;
            int i2=0;
            for (int i = 0; i < values.size(); i++) {
                if(i1==left.size()){
                    values.set(i, right.get(i2));
                    i2++;
                }
                else{
                    if (i2==right.size()){
                        values.set(i,left.get(i1));
                        i1++;
                    }
                    else{
                        if (left.get(i1)<=right.get(i2)) {
                            values.set(i,left.get(i1));
                            i1++;
                        }
                        else {
                            if (left.get(i1)>=right.get(i2)) {
                                values.set(i, right.get(i2));
                                i2++;
                            }
                        }
                    }
                }
            }
        }
    
    public void mostrarArray(List<Integer> list1){
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i).toString()+" ");
        }
        System.out.println();
    }
    
    /**Método para comprobar que todos los algoritmos funcionan correctamente
     *
     */
    public void RunTests(){
        //Test 29 - Comprobamos que el algoritmo "bubble sort" funciona con una lista ya ordenada
        System.out.println("Test 29 - Comprobamos que el algoritmo \"bubble sort\" funciona con una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        int temp;
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 30 - Comprobamos que el algoritmo "bubble sort" funciona con una lista aleatoria
        System.out.println("Test 30 - Comprobamos que el algoritmo \"bubble sort\" funciona con una lista aleatoria:");
        Random r = new Random();
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 31 - Comprobamos que el algoritmo "bubble sort" funciona con una lista inversamente ordenada
        System.out.println("Test 31 - Comprobamos que el algoritmo \"bubble sort\" funciona con una lista inversamente ordenada:");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 32 - Comprobamos que el algoritmo "bubble sort" funciona con una lista de alementos iguales
        System.out.println("Test 32 - Comprobamos que el algoritmo \"bubble sort\" funciona con una lista de alementos iguales");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                for(int j=i; j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                    temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                    }
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 33 - Comprobamos que el algoritmo "selection sort" funciona con una lista ya ordenada
        System.out.println("Test 33 - Comprobamos que el algoritmo \"selection sort\" funciona con una lista ya ordenada");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        int first;
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 34 - Comprobamos que el algoritmo "selection sort" funciona con una lista aleatoria
        System.out.println("Test 34 - Comprobamos que el algoritmo \"selection sort\" funciona con una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 35 - Comprobamos que el algoritmo "selection sort" funciona con una lista inversamente ordenada
        System.out.println("Test 34 - Comprobamos que el algoritmo \"selection sort\" funciona con una lista aleatoria:");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 36 - Comprobamos que el algoritmo "selection sort" funciona con una lista con elementos iguales
        System.out.println("Test 36 - Comprobamos que el algoritmo \"selection sort\" funciona con una lista con elementos iguales");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=0;i<list1.size()-1;i++){
                first = i;
                for(int j=i+1; j<list1.size();j++){
                    if(list1.get(j)<list1.get(first)){
                    first = j;
                    }
                    temp=list1.get(i);
                    list1.set(i, list1.get(first));
                    list1.set(first, temp);
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 37 - Comprobamos que el algoritmo "insertion sort" funciona con una lista ya ordenada
        System.out.println("Test 37 - Comprobamos que el algoritmo \"insertion sort\" funciona con una lista ya ordenada");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 38 - Comprobamos que el algoritmo "insertion sort" funciona con una lista aleatoria
        System.out.println("Test 38 - Comprobamos que el algoritmo \"insertion sort\" funciona con una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 39 - Comprobamos que el agoritmo "insertion sort" funciona con una lista inversamente ordenada
        System.out.println("Test 39 - Comprobamos que el agoritmo \"insertion sort\" funciona con una lista inversamente ordenada:");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 40 - Comprobamos que el algoritmo "insertion sort" funciona con una lista con elementos iguales
        System.out.println("Test 40 - Comprobamos que el algoritmo \"insertion sort\" funciona con una lista con elementos iguales:");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        if(list1.size()>1){
            for(int i=1;i<list1.size();i++){
                int j=i-1;
                while((j>=0)&&list1.get(j)>list1.get(j+1)){
                    temp=list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                    j--;
                }
            }
        }
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 41 - Comprobamos que el algoritmo "quick sort" funciona con una lista ya ordenada
        System.out.println("Test 41 - Comprobamos que el algoritmo \"quick sort\" funciona con una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        int der = list1.size()-1;
        int izq = 0;
        quickSort(list1, izq, der);
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 42 - Comprobamos que el algoritmo "quick sort" funciona con una lista aleatoria
        System.out.println("Test 42 - Comprobamos que el algoritmo \"quick sort\" funciona con una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        der = list1.size()-1;
        izq = 0;
        quickSort(list1, izq, der);
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 43 - Comprobamos que el algoritmo "quick sort" funciona con una lista inversamente ordenada
        System.out.println("Test 43 - Comprobamos que el algoritmo \"quick sort\" funciona con una lista inversamente ordenada:");
        for (int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        der = list1.size()-1;
        izq = 0;
        quickSort(list1, izq, der);
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 44 - Comprobamos que el algoritmo "quick sort" funciona con una lista con elementos iguales
        System.out.println("Test 44 - Comprobamos que el algoritmo \"quick sort\" funciona con una lista con elementos iguales:");
        for (int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        der = list1.size()-1;
        izq = 0;
        quickSort(list1, izq, der);
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 45 - Comprobamos que el algoritmo "merge sort" funcionia con una lista ya ordenada
        System.out.println("Test 45 - Comprobamos que el algoritmo \"merge sort\" funcionia con una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        MergeSort();
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 46 - Comprobamos que el algoritmo "merge sort" funciona con una lista aleatoria
        System.out.println("Test 46 - Comprobamos que el algoritmo \"merge sort\" funciona con una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        MergeSort();
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 47 - Comprobamos que el algoritmo "merge sort" funciona con una lista inversamete ordenada
        System.out.println("Test 47 - Comprobamos que el algoritmo \"merge sort\" funciona con una lista inversamete ordenada:");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        MergeSort();
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 48 - Comprobamos que el algoritmo "merge sort" funciona con una lista con los elementos iguales
        System.out.println("Test 48 - Comprobamos que el algoritmo \"merge sort\" funciona con una lista con los elementos iguales:");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tAntes de ordenar:\n\t");
        mostrarArray(list1);
        MergeSort();
        System.out.print("\tDespués de ordenar:\n\t");
        mostrarArray(list1);
        list1.clear();
        
        //Test 49 - Comprobamos que busca de forma binaria el elemento en una lista ordenada 
        System.out.println("Test 49 - Comprobamos que busca de forma binaria el elemento en una lista ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        boolean encontrado = false;
        int n = list1.size();
        int centro, inf=0, sup = n-1;
        int datoBuscar = 5;
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                encontrado = true;
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else{
                inf=centro+1;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 50 - Comprobamos que busca de forma binaria el elemento en una lista aleatoria
        System.out.println("Test 50 - Comprobamos que busca de forma binaria el elemento en una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 5;
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                encontrado = true;
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 51 - Comprobamos que busca de forma binaria el elemento en una lista inversamente ordenada
        System.out.println("Test 51 - Comprobamos que busca de forma binaria el elemento en una lista inversamente ordenada:");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 5;
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                encontrado = true;
                break;
            }else if (5 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 52 - Comprobamos que busca de forma binaria el elemento en una lista con los elemntos iguales
        System.out.println("Test 52 - Buscar un elemento de forma binaria en una lista con todos los elementos iguales:");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        n = list1.size();
        inf=0;
        sup = n-1;
        datoBuscar = 2;
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list1.get(centro)==datoBuscar){
                encontrado = true;
                break;
            }else if (2 < list1.get(centro)){
                sup = centro-1;
            }else {
                inf=centro+1;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 53 - Comprobamos que busca de forma secuencial el elemento en una lista ya ordenada
        System.out.println("Test 53 - Comprobamos que busca de forma secuencial el elemento en una lista ya ordenada:");
        for (int i=0; i<10; i++){
            list1.add(i);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        datoBuscar = 5;
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 54 - Comprobamos que busca de forma secuencial el elemento en una lista aleatoria
        System.out.println("Test 54 - Comprobamos que busca de forma secuencial el elemento en una lista aleatoria:");
        for(int i=0; i<10; i++){
            int aleatorio = r.nextInt(500);
            list1.add(aleatorio);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        datoBuscar = 5;
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 55 - Comprobamos que busca de forma secuencial el elemento en una lista inversamente ordenada
        System.out.println("Test 55 - Comprobamos que busca de forma secuencial el elemento en una lista inversamente ordenada:");
        for(int i=9; i>=0; i--){
            list1.add(i);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        datoBuscar = 5;
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
        
        //Test 5 - Comprobamos que busca de forma secuencial el elemento en una lista con los elementos iguales
        System.out.println("Test 5 - Comprobamos que busca de forma secuencial el elemento en una lista con los elementos iguales:");
        for(int i=0; i<10; i++){
            list1.add(2);
        }
        System.out.print("\tMostramos el array:\n\t");
        mostrarArray(list1);
        encontrado = false;
        datoBuscar = 5;
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)==datoBuscar){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("\tElemeto "+datoBuscar+" encontrado");
        }else{
            System.out.println("\tElemeto "+datoBuscar+" no encontrado");
        }
        list1.clear();
    }
}
