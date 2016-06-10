
package crewmanagement;

/**
 * Clase Turn
 * @author Alfonso Esteve
 */
public class Turn {
    
    String aDay;
    int aInitHour, aFinishHour;
    
    /**
     * Constructor vacio
     */
    public Turn(){
        
    }
    
    /**
     * Constructor dando com paramatro el día
     * @param aDay 
     */
    public Turn(String aDay){
        try{
            this.aDay = aDay.toUpperCase();
        }catch(Exception e){
            this.aDay = null;
        }
    }
    
    /**
     * Constructor dando como parametros el día, la hora de inicio y la hora de salida
     * @param aDay
     * @param aInitHour
     * @param aFinishHour 
     */
    public Turn(String aDay, int aInitHour, int aFinishHour){
        try{
            this.aDay = aDay.toUpperCase();
        if (aInitHour>=0 && aInitHour<=23){
            this.aInitHour = aInitHour;
        }else{
            //System.out.println("Has introducido mal la hora de inicio");
        }
        if (aFinishHour>=0 && aFinishHour<=23){
            this.aFinishHour = aFinishHour;
        }else{
            //System.out.println("Has introducido mal la hora de salida");
        }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    /**
     * Métdo para pasarle el día
     * @param aDay 
     */
    public void setDay(String aDay){
        //Lo pasamos a mayúsculas
        try{
            this.aDay = aDay.toUpperCase();
        }catch(Exception e){
            this.aDay = null;
        }
    }
    
    /**
     * Método que devuelve el día
     * @return 
     */
    public String getDay(){
        return aDay;
    }
    
    /**
     * Método para pasarle la hora de inicio
     * @param aInitHour 
     */
    public void setInitHour(int aInitHour){
        //Comprobamos que sea una una válida, entre 0 y 23
        try{
            if (aInitHour>=0 && aInitHour<=23){
            this.aInitHour = aInitHour;
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    /**
     * Métdo que devuelve la hora de inicio
     * @return 
     */
    public int getInitHour(){
        return aInitHour;
    }
    
    /**
     * Método para pasarle la hora de salida
     * @param aFinishHour 
     */
    public void setFinishHour(int aFinishHour){
        //Comprobamos que sea una hora válida, entre 0 y 23
        try{
            if (aFinishHour>=0 && aFinishHour<=23){
            this.aFinishHour = aFinishHour;
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    /**
     * Método que devuelve la hora de salida
     * @return 
     */
    public int getFinishHour(){
        return aFinishHour;
    }
}
