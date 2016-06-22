package p5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfonso Esteve
 */
public class Sort {
    List<Integer> listaAleatoria = new ArrayList<Integer>();
    List<Integer> listaOrdenada = new ArrayList<Integer>();
    List<Integer> listaInversa = new ArrayList<Integer>();
    List<Integer> listaIgual = new ArrayList<Integer>();
    double totalTiempo = 0;
    double tiempoInicio;
    int media=100;  //Veces que pasaré los test para calcular una media
    int posicion;
    int temp;
    int first;
    int tamanyoAntes, tamanyoDespues;
    /**
     * 
     * @param args 
     */
    /*public static void main(String[] args) {
        Sort sort = new Sort();
        sort.RunTimes();
        sort.RunTests();
    }*/
    /**
     * Para llenar las listas, ordenada, inversa, aleatoria e igual
     */
    public void llenarArrayLists(){
        for(int i=0; i<1000; i++){
            listaOrdenada.add(i);
        }
        for(int i=999; i>=0; i--){
            listaInversa.add(i);
        }
        for(int i=0; i<1000;i++){
            listaAleatoria.add((int) (Math.random() * 1000));
        }
        for (int i=0; i<1000; i++){
            listaIgual.add(20);
        }
    }
    /**
     * Algoritmo de ordenación Bubble Sort
     * @param list 
     */
    private void bubbleSort(List<Integer> list){
        if(list.size()>1){
            for(int i=0;i<list.size()-1;i++){
                for(int j=i; j<list.size();j++){
                    if(list.get(i)>list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    }
                }
            }
        }
    }
    /**
     * Algoritmo de ordenación Selection Sort
     * @param list 
     */
    private void selectionSort(List<Integer> list){
        if(list.size()>1){
            for(int i=0;i<list.size()-1;i++){
                first = i;
                for(int j=i+1; j<list.size();j++){
                    if(list.get(j)<list.get(first)){
                    first = j;
                    }
                    temp=list.get(i);
                    list.set(i, list.get(first));
                    list.set(first, temp);
                }
            }
        }
    }
    /**
     * Algoritmo de ordenación Insertion Sort
     * @param list 
     */
    private void insertionSort(List<Integer> list){
        if(list.size()>1){
            for(int i=1;i<list.size();i++){
                int j=i-1;
                while((j>=0)&&list.get(j)>list.get(j+1)){
                    temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    j--;
                }
            }
        }
    }
    /**
     * Algoritmo de ordenación Quick Sort
     * @param list 
     */
    private void QuickSort(List<Integer> list){
               
        if (list.size()>1) // compruebo que sea mayor de 1 la lista para que no de error en caso contrario
        {
            recursiveQuickSort(list,0,list.size()-1);
        }
    }
    /**
     * Algortimo de ordenación Quick Sort recursivo
     * @param arr
     * @param left
     * @param right 
     */
    private void recursiveQuickSort(List<Integer> arr, int left, int right) {
          int index = partition(arr, left, right);
          if (left < index - 1)
                recursiveQuickSort(arr, left, index - 1);
          if (index < right)
                recursiveQuickSort(arr, index, right);
    }
    /**
     * Método Partition para ayudar en el Quick Sort
     * @param arr
     * @param left
     * @param right
     * @return 
     */
    private int partition(List<Integer> arr, int left, int right){
        int i = left, j = right;
        int tmp;
        int pivot = arr.get((left + right) / 2);

        while (i <= j) {               
            while (arr.get(i) < pivot){
                i++;
            } 
            while (arr.get(j) > pivot){
                j--;
            }
            if (i <= j) {
                tmp =  arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }
    /**Algotirmo de ordenación Merge Sort
     * 
     */
    private void MergeSort(List<Integer> list){
        if (list.size()>1){
            recursiveMergeSort(list);
        }
    }
    /**Algoritmo de ordenación Merge Sort recursivo
     * 
     * @param values
     * @return 
     */
    private List<Integer> recursiveMergeSort( List<Integer> values){
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
    /**Método Merge para ayudar en el algoritmo de ordenación Merge Sort
     * 
     * @param left
     * @param right
     * @param values 
     */
    private void merge (List<Integer>left,List<Integer>right,List<Integer>values){
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
    /**
     * Donde pasamos los test para calcular los tiempos de ordenación de cada uno de los algoritmos
     */
    public void RunTimes(){
        System.out.println("Tiempo que tarda cada una de estas acciones en realizarse:");
        System.out.println("----------------------------------------------------------");
        llenarArrayLists();
        //Test 1
        System.out.print("Test 1 - Ordenamos una lista aleatoria con el algoritmo \"bubble sort\":");
        tiempoInicio = System.nanoTime();
        bubbleSort(listaAleatoria);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 2
        System.out.print("Test 2 - Ordenamos una lista creciente con el algoritmo \"bubble sort\":");
        tiempoInicio = System.nanoTime();
        bubbleSort(listaOrdenada);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 3
        System.out.print("Test 3 - Ordenamos una lista decreciente con el algoritmo \"bubble sort\":");
        tiempoInicio = System.nanoTime();
        bubbleSort(listaInversa);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                             %.8f ms\n",totalTiempo);
        //Test 4
        System.out.print("Test 4 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"bubble sort\":");
        tiempoInicio = System.nanoTime();
        bubbleSort(listaIgual);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("         %.8f ms\n",totalTiempo);
        //Test 5
        System.out.print("Test 5 - Ordenamos una lista aleatoria con el algoritmo \"selection sort\":");
        tiempoInicio = System.nanoTime();
        selectionSort(listaAleatoria);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                            %.8f ms\n",totalTiempo);
        //Test 6
        System.out.print("Test 6 - Ordenamos una lista creciente con el algoritmo \"selection sort\":");
        tiempoInicio = System.nanoTime();
        selectionSort(listaOrdenada);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                            %.8f ms\n",totalTiempo);
        //Test 7
        System.out.print("Test 7 - Ordenamos una lista decreciente con el algoritmo \"selection sort\":");
        tiempoInicio = System.nanoTime();
        selectionSort(listaInversa);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                          %.8f ms\n",totalTiempo);
        //Test 8
        System.out.print("Test 8 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"selection sort\":");
        tiempoInicio = System.nanoTime();
        selectionSort(listaIgual);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("      %.8f ms\n",totalTiempo);
        //Test 9
        System.out.print("Test 9 - Ordenamos una lista aleatoria con el algoritmo \"insertion sort\":");
        tiempoInicio = System.nanoTime();
        insertionSort(listaAleatoria);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                            %.8f ms\n",totalTiempo);
        //Test 10
        System.out.print("Test 10 - Ordenamos una lista creciente con el algoritmo \"insertion sort\":");
        tiempoInicio = System.nanoTime();
        insertionSort(listaOrdenada);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                           %.8f ms\n",totalTiempo);
        //Test 11
        System.out.print("Test 11 - Ordenamos una lista decreciente con el algoritmo \"insertion sort\":");
        tiempoInicio = System.nanoTime();
        insertionSort(listaInversa);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                         %.8f ms\n",totalTiempo);
        //Test 12
        System.out.print("Test 12 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"insertion sort\":");
        tiempoInicio = System.nanoTime();
        insertionSort(listaIgual);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("     %.8f ms\n",totalTiempo);
        //Test 13
        System.out.print("Test 13 - Ordenamos una lista aleatoria con el algoritmo \"quick sort\":");
        tiempoInicio = System.nanoTime();
        QuickSort(listaAleatoria);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 14
        System.out.print("Test 14 - Ordenamos una lista creciente con el algoritmo \"quick sort\":");
        tiempoInicio = System.nanoTime();
        QuickSort(listaOrdenada);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 15
        System.out.print("Test 15 - Ordenamos una lista decreciente con el algoritmo \"quick sort\":");
        tiempoInicio = System.nanoTime();
        QuickSort(listaInversa);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                             %.8f ms\n",totalTiempo);
        //Test 16
        System.out.print("Test 16 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"quick sort\":");
        tiempoInicio = System.nanoTime();
        QuickSort(listaIgual);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("         %.8f ms\n",totalTiempo);
        //Test 17
        System.out.print("Test 17 - Ordenamos una lista aleatoria con el algoritmo \"merge sort\":");
        tiempoInicio = System.nanoTime();
        MergeSort(listaAleatoria);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 18
        System.out.print("Test 18 - Ordenamos una lista creciente con el algoritmo \"merge sort\":");
        tiempoInicio = System.nanoTime();
        MergeSort(listaOrdenada);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                               %.8f ms\n",totalTiempo);
        //Test 19
        System.out.print("Test 19 - Ordenamos una lista decreciente con el algoritmo \"mergee sort\":");
        tiempoInicio = System.nanoTime();
        MergeSort(listaInversa);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("                            %.8f ms\n",totalTiempo);
        //Test 20
        System.out.print("Test 20 - Ordenamos una lista con todos los elementos iguales con el algoritmo \"mergee sort\":");
        tiempoInicio = System.nanoTime();
        MergeSort(listaIgual);
        totalTiempo = (System.nanoTime() - tiempoInicio)/1000000;
        System.out.printf("        %.8f ms\n",totalTiempo);
    }
    /**
     * Para comprobar si están ordenados correctamente
     * @param list
     * @param tamanyoAntes
     * @param tamanyoDespues 
     */
    private void comprobarOrdenacion(List<Integer> list, int tamanyoAntes, int tamanyoDespues){
        boolean valido = true;
        if(tamanyoAntes!=tamanyoDespues){ //Miramos si tiene el mismo tamaño antes y después de la ordenación
            valido =false;
        }else{
            for (int i = 0; i < list.size()-1; i++) { //Comprobamos que cada elemento está ordenado
                if (list.get(i) > list.get(i+1)) { 
                    valido = false;
                    break;
                }
            } 
        }
        if(valido){
            System.out.print("OK\n");
        }else{
            System.out.print("No es correcto\n");
        }
    }
    /**
     * Donde pasamos cada uno de los tests para comprobar que cada uno de los algoritmos está ordenado
     */
    public void RunTests(){
        System.out.println();
        System.out.println("Comprobamos que los algoritmos funcionan correctamente con los siguientes tests:");
        System.out.println("--------------------------------------------------------------------------------");
        //Test 1
        llenarArrayLists();
        System.out.print("Test 1 - Comprobamos si la ordenación de una lista aleatoria con el método \"bubble sort\" es correcta: ");
        tamanyoAntes = listaAleatoria.size();
        bubbleSort(listaAleatoria);
        tamanyoDespues = listaAleatoria.size();
        comprobarOrdenacion(listaAleatoria, tamanyoAntes, tamanyoDespues);
        //Test 2
        System.out.print("Test 2 - Comprobamos si la ordenación de una lista creciente con el método \"bubble sort\" es correcta: ");
        tamanyoAntes = listaOrdenada.size();
        bubbleSort(listaOrdenada);
        tamanyoDespues = listaOrdenada.size();
        comprobarOrdenacion(listaOrdenada, tamanyoAntes, tamanyoDespues);
        //Test 3
        System.out.print("Test 3 - Comprobamos si la ordenación de una lista decreciente con el método \"bubble sort\" es correcta: ");
        tamanyoAntes = listaInversa.size();
        bubbleSort(listaInversa);
        tamanyoDespues = listaInversa.size();
        comprobarOrdenacion(listaInversa, tamanyoAntes, tamanyoDespues);
        //Test 4
        System.out.print("Test 4 - Comprobamos si la ordenación de una lista con todos los elementos iguales con el método \"bubble sort\" es correcta: ");
        tamanyoAntes = listaIgual.size();
        bubbleSort(listaIgual);
        tamanyoDespues = listaIgual.size();
        comprobarOrdenacion(listaIgual,tamanyoAntes, tamanyoDespues);
        //Test 5
        System.out.print("Test 5 - Comprobamos si la ordenación de una lista aleatoria con el método \"selection sort\" es correcta: ");
        tamanyoAntes = listaAleatoria.size();
        selectionSort(listaAleatoria);
        tamanyoDespues = listaAleatoria.size();
        comprobarOrdenacion(listaAleatoria, tamanyoAntes, tamanyoDespues);
        //Test 6
        System.out.print("Test 6 - Comprobamos si la ordenación de una lista creciente con el método \"selection sort\" es correcta: ");
        tamanyoAntes = listaOrdenada.size();
        selectionSort(listaOrdenada);
        tamanyoDespues = listaOrdenada.size();
        comprobarOrdenacion(listaOrdenada, tamanyoAntes, tamanyoDespues);
        //Test 7
        System.out.print("Test 7 - Comprobamos si la ordenación de una lista decreciente con el método \"selection sort\" es correcta: ");
        tamanyoAntes = listaInversa.size();
        selectionSort(listaInversa);
        tamanyoDespues = listaInversa.size();
        comprobarOrdenacion(listaInversa, tamanyoAntes, tamanyoDespues);
        //Test 8
        System.out.print("Test 8 - Comprobamos si la ordenación de una lista con todos los elementos iguales con el método \"selection sort\" es correcta: ");
        tamanyoAntes = listaIgual.size();
        selectionSort(listaIgual);
        tamanyoDespues = listaIgual.size();
        comprobarOrdenacion(listaIgual,tamanyoAntes, tamanyoDespues);
        //Test 9
        llenarArrayLists();
        System.out.print("Test 9 - Comprobamos si la ordenación de una lista aleatoria con el método \"insertion sort\" es correcta: ");
        tamanyoAntes = listaAleatoria.size();
        insertionSort(listaAleatoria);
        tamanyoDespues = listaAleatoria.size();
        comprobarOrdenacion(listaAleatoria, tamanyoAntes, tamanyoDespues);
        //Test 10
        System.out.print("Test 10 - Comprobamos si la ordenación de una lista creciente con el método \"insertion sort\" es correcta: ");
        tamanyoAntes = listaOrdenada.size();
        insertionSort(listaOrdenada);
        tamanyoDespues = listaOrdenada.size();
        comprobarOrdenacion(listaOrdenada, tamanyoAntes, tamanyoDespues);
        //Test 11
        System.out.print("Test 11 - Comprobamos si la ordenación de una lista decreciente con el método \"insertion sort\" es correcta: ");
        tamanyoAntes = listaInversa.size();
        insertionSort(listaInversa);
        tamanyoDespues = listaInversa.size();
        comprobarOrdenacion(listaInversa, tamanyoAntes, tamanyoDespues);
        //Test 12
        System.out.print("Test 4 - Comprobamos si la ordenación de una lista con todos los elementos iguales con el método \"insertion sort\" es correcta: ");
        tamanyoAntes = listaIgual.size();
        insertionSort(listaIgual);
        tamanyoDespues = listaIgual.size();
        comprobarOrdenacion(listaIgual,tamanyoAntes, tamanyoDespues);
        //Test 13
        llenarArrayLists();
        System.out.print("Test 13 - Comprobamos si la ordenación de una lista aleatoria con el método \"quick sort\" es correcta: ");
        tamanyoAntes = listaAleatoria.size();
        QuickSort(listaAleatoria);
        tamanyoDespues = listaAleatoria.size();
        comprobarOrdenacion(listaAleatoria, tamanyoAntes, tamanyoDespues);
        //Test 14
        System.out.print("Test 14 - Comprobamos si la ordenación de una lista creciente con el método \"quick sort\" es correcta: ");
        tamanyoAntes = listaOrdenada.size();
        QuickSort(listaOrdenada);
        tamanyoDespues = listaOrdenada.size();
        comprobarOrdenacion(listaOrdenada, tamanyoAntes, tamanyoDespues);
        //Test 15
        System.out.print("Test 15 - Comprobamos si la ordenación de una lista decreciente con el método \"quick sort\" es correcta: ");
        tamanyoAntes = listaInversa.size();
        QuickSort(listaInversa);
        tamanyoDespues = listaInversa.size();
        comprobarOrdenacion(listaInversa, tamanyoAntes, tamanyoDespues);
        //Test 16
        System.out.print("Test 16 - Comprobamos si la ordenación de una lista con todos los elementos iguales con el método \"quick sort\" es correcta: ");
        tamanyoAntes = listaIgual.size();
        QuickSort(listaIgual);
        tamanyoDespues = listaIgual.size();
        comprobarOrdenacion(listaIgual,tamanyoAntes, tamanyoDespues);
        //Test 17
        llenarArrayLists();
        System.out.print("Test 17 - Comprobamos si la ordenación de una lista aleatoria con el método \"merge sort\" es correcta: ");
        tamanyoAntes = listaAleatoria.size();
        MergeSort(listaAleatoria);
        tamanyoDespues = listaAleatoria.size();
        comprobarOrdenacion(listaAleatoria, tamanyoAntes, tamanyoDespues);
        //Test 18
        System.out.print("Test 18 - Comprobamos si la ordenación de una lista creciente con el método \"merge sort\" es correcta: ");
        tamanyoAntes = listaOrdenada.size();
        MergeSort(listaOrdenada);
        tamanyoDespues = listaOrdenada.size();
        comprobarOrdenacion(listaOrdenada, tamanyoAntes, tamanyoDespues);
        //Test 19
        System.out.print("Test 19 - Comprobamos si la ordenación de una lista decreciente con el método \"merge sort\" es correcta: ");
        tamanyoAntes = listaInversa.size();
        MergeSort(listaInversa);
        tamanyoDespues = listaInversa.size();
        comprobarOrdenacion(listaInversa, tamanyoAntes, tamanyoDespues);
        //Test 20
        System.out.print("Test 20 - Comprobamos si la ordenación de una lista con todos los elementos iguales con el método \"merge sort\" es correcta: ");
        tamanyoAntes = listaIgual.size();
        MergeSort(listaIgual);
        tamanyoDespues = listaIgual.size();
        comprobarOrdenacion(listaIgual,tamanyoAntes, tamanyoDespues);
    }
}
