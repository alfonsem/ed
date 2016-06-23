/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinario;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alfonso Esteve
 */
public class Mascota {
    private int codigo;
    private String alias;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fechaNacimiento;
    private double pesoActual;
    private double pesoMedio;
    private double[] pesos = new double[10];
    private Cliente cliente;
    private ArrayList<HistorialMedico> hitoriales = new ArrayList<HistorialMedico>();
    private CalendarioVacunas vacunas;
    
    public Mascota(){
    }
    
    public Mascota(int codigo, String alias, String especie, String raza, String colorPelo, Date fechaNacimiento, double pesoActual, Cliente cliente){
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getAlias(){
        return alias;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public String getColorPelo(){
        return colorPelo;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setPesoActual(double p){
    }
    
    public double getPesoActual(){
        return pesoActual;
    }
    public void anyadirPesoNuevo(double p){
    }
    
    public void calcularPesoMedio(){
    }
    public void anyadirHistorialMedico(HistorialMedico h){
        
    }
    public CalendarioVacunas getCalendarioVacunas(){
        return vacunas;
    }
}
