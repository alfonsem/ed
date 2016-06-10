package crewmanagement;

/**
 * Clase Employee
 *
 * @author Alfonso Esteve
 */
public class Employee {

    String aName, aSurname, DNI, aFullName, name, surname;
    int turnCount, anIndex;
    boolean nameInUpperCase, surnameInUpperCase;
    Turn[] turns = new Turn[7];
    int contador = 0;

    /**
     * Constructor vacío
     */
    public Employee() {
        //turns = new Turn[7];
    }

    /**
     * Constructor dando el nombre y apellido
     *
     * @param aName
     * @param aSurname
     */
    public Employee(String aName, String aSurname) {
        try{
            this.aName = aName;
        }catch(Exception e){
            this.aName = "";
        }
        try{
            this.aSurname = aSurname;
        }catch(Exception e){
            this.aSurname = "";
        }
    }

    /**
     * Constructor pasandole el DNI, nombre y apellido Al mismo tiempo
     * comprobamos si el DNI es válido
     *
     * @param aDNI
     * @param aName
     * @param aSurname
     */
    public Employee(String aDNI, String aName, String aSurname) {
        validarDNI(aDNI);
        this.aName = aName;
        this.aSurname = aSurname;
    }

    /**
     * Método para pasarle el nombre
     *
     * @param aName
     */
    public void setName(String aName) {
        try {
            this.aName = aName;
        } catch (Exception e) {
            this.aName = "";
        }
    }

    /**
     * Método que devuelve el nombre
     *
     * @return aName
     */
    public String getName() {
        return aName;
    }

    /**
     * Mé0tdo para pasarle el apellido
     *
     * @param aSurname
     */
    public void setSurname(String aSurname) {
        try {
            this.aSurname = aSurname;
        } catch (Exception e) {
            this.aSurname = "";
        }
    }

    /**
     * Método que devuelve el apellido
     *
     * @return sSurname
     */
    public String getSurname() {
        return aSurname;
    }

    /**
     * Método que devuelve el nombre completo y depende de si es falso y
     * verdadero lo devuelve en mayúsculas
     *
     * @param nameInUpperCase
     * @param surnameInUpperCase
     * @return (nombre completo)
     */
    public String getFullName(boolean nameInUpperCase, boolean surnameInUpperCase) {
        //String name, surname;    
        this.nameInUpperCase = nameInUpperCase;
        this.surnameInUpperCase = surnameInUpperCase;
        if ((nameInUpperCase == true)&&(surnameInUpperCase == true)) {
            try{
                name=getName().toUpperCase();
            }catch(Exception e){
                name = "";
            }
            try{
                surname=getSurname().toUpperCase();
            }catch(Exception e){
                surname = "";
            }
        } else if ((nameInUpperCase == false)&&(surnameInUpperCase == true)) {
            if(getName()==null){
                name="";
            }else
                name=getName();
            try{
                surname = getSurname().toUpperCase();
            }catch(Exception e){
                surname = "";
            }
        }else if ((nameInUpperCase == false)&&(surnameInUpperCase == false)) {
            if(getName()==null){
                    name="";
                }else
                    name=getName();
            if(getSurname()==null){
                surname= "";
            }else
                surname=getSurname();
        }else if ((nameInUpperCase == true)&&(surnameInUpperCase == false)) {
            try{
                name=getName().toUpperCase();
            }catch(Exception e){
                name = "";
            }
            if(getSurname()==null){
                surname= "";
            }else
                surname=getSurname();
        }
        return (name +", "+surname);
    }

    /**
     * Método para pasarle el DNI
     *
     * @param DNI
     */
    public void setDNI(String DNI) {
        validarDNI(DNI);
    }

    /**
     * Método que te devuelve el DNI
     *
     * @return DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Método para añadir un turno
     *
     * @param turn
     */
    public void addTurn(Turn turn) {
        if(turn!=null){
            if(contador<7){
                turns[contador] = turn;
                contador++;
            }
        }
    }

    /**
     * Método que borra un turno según el día que le pasemos
     *
     * @param aDay
     */
    public void removeTurn(String aDay) {
        String day = aDay;
        if (contador > 0){
            for (int i = 0; i < contador; i++) {
                if (turns[i].getDay().equalsIgnoreCase(day)) {
                    for(int j=i; j<contador; j++){
                        turns[j] = turns [j+1];
                        contador--;
                    }
                }
            }
        }
    }

    /**
     * Método que devuelve el número de turnos
     *
     * @return contador
     */
    public int getTurnCount() {
        return contador;
    }

    /**
     * Método que devuelve un turno según el índice que le pasemos
     *
     * @param anIndex
     * @return turn
     */
    public Turn getTurnAt(int anIndex) {
        if(anIndex >= contador){
            return null;
        }
        else{
            return turns[anIndex];
        }

    }

    /**
     * Método que devuelve un array con los turnos
     *
     * @return turns
     */
    public Turn[] getTurns() {
        if (contador > 0) {
            Turn[] turnosTemporal = new Turn[contador];
            for (int i = 0; i < contador; i++) {
                turnosTemporal[i] = turns[i]; 
            }
            return turnosTemporal;
        }
        else return null;

    }

    /**
     * Método para validar el DNI
     *
     * @param aDNI
     */
    public void validarDNI(String aDNI) {
        try {
            //Separamos el DNI en letras sueltas
            char[] arrayDNI = aDNI.toCharArray();

            //Comprobamos que tiene nueve digitos
            if (aDNI.length() != 9) {
                this.DNI=null;
                //System.out.println("Has introducido un DNI incorrecto");
            } else {
                //Pasamos el DNI anterior separado sin la letra final
                String bDNI = "";
                for (int i = 0; i < arrayDNI.length - 1; i++) {
                    bDNI = bDNI + "" + arrayDNI[i];
                }

                //Lo convertimos en número para comprobar que es un DNI válido
                int nDNI = Integer.parseInt(bDNI);

                //Según sea el resto de la división entre 23 así será su letra
                int opcion = nDNI % 23;
                switch (opcion) {
                    case 0:
                        if ('t' == arrayDNI[8] || 'T' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 1:
                        if ('r' == arrayDNI[8] || 'R' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 2:
                        if ('w' == arrayDNI[8] || 'W' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 3:
                        if ('a' == arrayDNI[8] || 'A' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 4:
                        if ('g' == arrayDNI[8] || 'G' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 5:
                        if ('m' == arrayDNI[8] || 'M' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 6:
                        if ('y' == arrayDNI[8] || 'Y' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 7:
                        if ('f' == arrayDNI[8] || 'F' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                           //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 8:
                        if ('p' == arrayDNI[8] || 'P' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 9:
                        if ('d' == arrayDNI[8] || 'D' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 10:
                        if ('x' == arrayDNI[8] || 'X' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 11:
                        if ('b' == arrayDNI[8] || 'B' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 12:
                        if ('n' == arrayDNI[8] || 'N' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 13:
                        if ('j' == arrayDNI[8] || 'J' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 14:
                        if ('z' == arrayDNI[8] || 'Z' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 15:
                        if ('s' == arrayDNI[8] || 'S' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 16:
                        if ('q' == arrayDNI[8] || 'Q' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 17:
                        if ('v' == arrayDNI[8] || 'V' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 18:
                        if ('h' == arrayDNI[8] || 'H' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 19:
                        if ('l' == arrayDNI[8] || 'L' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 20:
                        if ('c' == arrayDNI[8] || 'C' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                           //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 21:
                        if ('k' == arrayDNI[8] || 'K' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    case 22:
                        if ('e' == arrayDNI[8] || 'E' == arrayDNI[8]) {
                            this.DNI = aDNI;
                        } else {
                            this.DNI=null;
                            //System.out.println("El DNI no es válido");
                        }
                        break;
                    default:
                        this.DNI=null;
                        //System.out.println("El DNI no es válido");
                        break;
                }
            }
        } catch (Exception e) {
            this.DNI = null;
        }
    }
}
