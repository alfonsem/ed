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
public class Cliente {
    private int codigo;
    private String apellido;
    private int cuentaBancaria;
    private String direccion;
    private int telefono;
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    
    public Cliente(){
    }
    
    public Cliente(int codigo, String apellido, int cuentaBancaria, String direccion, int telefono){
    }
    
    public void anyadirPersona(Persona p){
    }
    
    public void setCuentaBancaria(int cuenta){
    }
    
    public int getCuentaBancaria(){
        return cuentaBancaria;
    }
    
    public void setDireccion(String d){
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setTelefono(int t){
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void borrarPersona(int index){
    }
    
    public void anyadirMascota(Mascota m){
    }
    
    public void borrarMascota(int index){
    }
}
