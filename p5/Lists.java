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
    double totalTiempo = 0;
    double tiempoInicio;
    double tiempoMedia;
    int media=100;  //Veces que pasaré los test para calcular una media
    int posicion;
    
    /**
     * 
     * @param args 
     */
    /*public static void main(String[] args) {
        Lists list = new Lists();
        list.RunTimes();
    }*/
    
    /**
     * Para llenar los ArrayList
     */
    public void llenarArrayList(){
        list1.clear();
        for (int i = 0; i < 1000; i++) {
            list1.add(i);
        }
    }
    /**
     * Para llenar los LinkedList
     */
    public void llenarLinkedList(){
        list2.clear();
        for (int i = 0; i < 1000; i++) {
            list2.add(i);
        }
    }
    /**
     * Agregar un elemento por valor al inicio de la lista
     * @param list
     * @param valor 
     */
    private void agregarInicioList(List<Integer> list, int valor){
        list.add(0,valor);
    }
    /**
     * Agregar un elemento por valor al final de la lista
     * @param list
     * @param valor 
     */
    private void agregarFinalList(List<Integer> list, int valor){
        list.add(valor);
    }
    /**
     * Agregar un elemento por valor en el medio de la lista
     * @param list
     * @param valor 
     */
    private void agregarMitadList(List<Integer> list, int valor){
        posicion=list.size()/2;
        list.add(posicion, valor);
    }
    /**
     * Borrar un elemento del final de la lista
     * @param list 
     */
    private void borrarFinalList(List<Integer> list){
        posicion = list.size()-1;
        list.remove(posicion);
    }
    /**
     * Borrar un elemento al inicio de la lista
     * @param list 
     */
    private void borrarInicioList(List<Integer> list){
        list.remove(0);
    }
    /**
     * Borrar un elemento en medio de la lista
     * @param list 
     */
    private void borrarMedioList(List<Integer> list){
        posicion = list.size()/2;
        list.remove(posicion);
    }
    /**
     * Borrar un elemento por su valor
     * @param list
     * @param valor 
     */
    private void borrarValorList(List<Integer> list, int valor){
        list.remove(valor);
    }
    /**
     * Borrado completo de la lista
     * @param list 
     */
    private void borrarCompletoList(List<Integer> list){
        list.clear();
    }
    /**
     * Búsqueda de un elemento por su valor en la lista
     * @param list
     * @param valor 
     */
    private void busquedaElementoList(List<Integer> list, int valor){
        list.contains(valor);
    }
    /**
     * Búsqueda secuencial de un elemento por su valir en la lista
     * @param list
     * @param valor 
     */
    private void busquedaSecuencialList(List<Integer> list, int valor){
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==valor){
                break;
            }
        }
    }
    /**
     * Búsqueda binaria de un elemento por su valor en la lista
     * @param list
     * @param valor 
     */
    private void busquedaBinariaList(List<Integer> list, int valor){
        int n = list1.size();
        int centro, inf=0, sup = n-1;
        
        while(inf<=sup){
            centro = (sup+inf)/2;
            if(list.get(centro)==valor){
                break;
            }else if (valor < list.get(centro)){
                sup = centro-1;
            }else{
                inf=centro+1;
            }
        }
    }
    /**
     * Donde pasaremos los tests para comprobar los tiempos de ejecución
     */
    public void RunTimes(){
        System.out.println("Tiempo medio (en milisegundos) que tarda cada una de estas acciones en ejecutarse:");
        System.out.println("                                                                                            ArrayList          LinkedList");
        //Test 1
        System.out.print("Test 1: Insertar un elemento al final de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarFinalList(list1,1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                         %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarFinalList(list2,1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 2
        System.out.print("Test 2: Insertar un elemento al principio de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarInicioList(list1,1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                     %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarInicioList(list2,1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 3
        System.out.print("Test 3: Insertar un elemento en medio de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarMitadList(list1,i);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                         %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            agregarMitadList(list2, i);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 4
        System.out.print("Test 4: Borrar un elemento al final de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarFinalList(list1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                           %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarFinalList(list2);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 5
        System.out.print("Test 5: Borrar un elemento al principio de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarInicioList(list1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                       %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarInicioList(list2);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 6
        System.out.print("Test 6: Borrar un elemento en medio de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarMedioList(list1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                           %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarMedioList(list2);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 7
        System.out.print("Test 7: Borrar un elemento al final de la lista (por su valor):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list1,list1.get(list1.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                            %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list2,list2.get(list2.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 8
        System.out.print("Test 8: Borrar un elemento al principio de la lista (por su valor):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list1,list1.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                        %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list2,list2.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 9
        System.out.print("Test 9: Borrar un elemento en medio de la lista (por su valor):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list1,list1.get(list1.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                            %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarValorList(list2,list2.get(list2.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 10
        System.out.print("Test 10: Vaciado completo de la lista:");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarCompletoList(list1);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                                                     %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            borrarCompletoList(list2);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 11
        System.out.print("Test 11: Buscar un elemento al final de la lista (de forma secuencial):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list1,list1.get(list1.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                    %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list2, list2.get(list2.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 12
        System.out.print("Test 12: Buscar un elemento al principio de la lista (de forma secuencial):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list1,list1.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list2, list2.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 13
        System.out.print("Test 13: Buscar un elemento en el medio de la lista (de forma secuencial):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list1,list1.get(list1.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("                 %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list2, list2.get(list2.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 14
        System.out.print("Test 14: Buscar si existe un elemento inexistente en la lista (de forma secuencial):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list1,2000);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("       %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaSecuencialList(list2,200);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 15
        System.out.print("Test 15: Buscar si existe un elemento al final de la lista (de forma binaria):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list1,list1.get(list1.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("             %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list2,list2.get(list2.size()-1));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 16
        System.out.print("Test 16: Buscar si existe un elemento al principio de la lista (de forma binaria):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list1,list1.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("         %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list2,list2.get(0));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //Test 17
        System.out.print("Test 17: Buscar si existe un elemento en el medio de la lista (de forma binaria):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list1,list1.get(list1.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list2,list2.get(list2.size()/2));
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
        //est 18 
        System.out.print("Test 18: Buscar si existe un elemento inexistente en la lista (de forma binaria):");
        llenarArrayList();
        llenarLinkedList();
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list1,2000);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f",tiempoMedia);
        tiempoInicio = System.nanoTime();
        for(int i=0; i<100;i++){
            busquedaBinariaList(list2,2000);
            totalTiempo += (System.nanoTime() - tiempoInicio)/1000000;
        }
        tiempoMedia=totalTiempo/media;
        System.out.printf("          %.8f\n",tiempoMedia);
        totalTiempo=0;
    }
}

