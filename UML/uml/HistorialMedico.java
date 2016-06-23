/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinario;

import java.util.Date;

/**
 *
 * @author Alfonso Esteve
 */
public class HistorialMedico {
    private Date fecha;
    private Mascota mascota;
    private Enfermedad enfermedad;
    
    public HistorialMedico(){
    }
    
    public HistorialMedico(Date fecha, Mascota mascota, Enfermedad enfermedad){
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public Mascota getMascota(){
        return mascota;
    }
    
    public Enfermedad getEnfermedad(){
        return enfermedad;
    }
}
