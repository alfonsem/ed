/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinario;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Alfonso Esteve
 */
public class CalendarioVacunas {
    private ArrayList<Date> fechaVacunas = new ArrayList<Date>();
    private ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
    private Mascota mascota;
    
    public void anyadirFechaVacunacion(Date fecha){
    }
    
    public void anyadirEnfermedad(Enfermedad enfermedad){
    }
    public Mascota getMascota(){
        return mascota;
    }
}
