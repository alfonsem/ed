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
public class Persona {
    private String nombre;
    private String DNI;
    private String apellidos;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public Persona(){
    }
    
    public Persona(String nombre, String DNI, String apellidos){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getDNI(){
        return DNI;
    }
    
    public void anyadirCliente(Cliente c){
    }
    
    public void borrarCliente(int index){
    }
}
