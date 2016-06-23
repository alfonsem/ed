/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinario;

import java.util.ArrayList;

/**
 *
 * @author Alfonso Esteve
 */
public class Enfermedad {
    private String nombre;
    private String descripcion;
    private ArrayList<HistorialMedico> historiales = new ArrayList<HistorialMedico>();
    private ArrayList<CalendarioVacunas> vacunas = new ArrayList<CalendarioVacunas>();
    
    public Enfermedad(){
    }
    
    public Enfermedad(String nombre, String enfermedad){
    }
    
    public String geetNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void anyadirHistorialMedico(HistorialMedico h){
    }
    
    public void anyadirCalendarioVacunas(CalendarioVacunas c){
    }
}
