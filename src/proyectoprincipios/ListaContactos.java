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
import java.util.*;
public class ListaContactos
{
     protected static ArrayList<Contacto>listaContactos = new ArrayList<Contacto>();
    public static void agregarContacto(Contacto contacto){
       listaContactos.add(contacto);  
    }
    
    public static void modificarContacto(int p){
    int opcion;    
    do{    
    Scanner scan = new Scanner(System.in);
    System.out.println("======================");
    System.out.println("1. Modificar nombre");
    System.out.println("2. Modificar telefono");
    System.out.println("3. Modificar correo");
    System.out.println("9. Salir:)");
    System.out.println("Por favor digite su opcion");
     opcion = scan.nextInt();
     switch(opcion){
         case 1 :
             System.out.println("Ingrese el nuevo nombre");
             String nombre = scan.next();
             ListaContactos.listaContactos.get(p).setNombre(nombre);
             break;
         case 2: 
             System.out.println("Ingrese el nuevo telefono");
             String telefono = scan.next();
             ListaContactos.listaContactos.get(p).setTelefono(telefono);
             break;
         case 3:
             System.out.println("ingrese el nuevo correo");
             String correo = scan.next();
             ListaContactos.listaContactos.get(p).setCorreo(correo);
             break;
             
             
     }
    
}   
    while(opcion !=9);
    }
    
    public static void eliminarContacto(int p){
        ListaContactos.listaContactos.remove(p);
        
    }
    public static void mostrarContactos(){
        for(int i = 0; i < ListaContactos.listaContactos.size();i++){
            System.out.println("Contacto "+(i+1)+":");
            System.out.println("Nombre: "+ListaContactos.listaContactos.get(i).getNombre());
            System.out.println("Teléfono: "+ListaContactos.listaContactos.get(i).getTelefono());
            System.out.println("Correo: "+ListaContactos.listaContactos.get(i).getCorreo());
            System.out.println("======================");
        }
    }
}
