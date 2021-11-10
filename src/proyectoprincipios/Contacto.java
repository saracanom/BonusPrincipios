/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprincipios;

/**
 *
 * @author EQUIPO
 */
public class Contacto
{
    private String nombre;
    private String telefono;
    private String correo;

    /**
     * Constructor for objects of class Contacto
     */
    public Contacto(String nombre, String telefono,String correo)
    {
    this.nombre = nombre;
    this.telefono = telefono;
    this.correo = correo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
        public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
        public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
        public String getTelefono(){
        return telefono;
    }
    
        public String getCorreo(){
        return correo;
    }
}