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
public class Principal
{
    
    public static void menuPrincipal(){
       int opcion;
       do {
        System.out.println("======================");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Modificar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Ver todos los contactos");
        System.out.println("9. Salir:)");
        System.out.println("Por favor digite su opcion");   
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        switch(opcion){
            case 1 :
                System.out.println("Ingrese el nombre");
                String nombre = scan.next();
                System.out.println("Ingrese el telefono");
                String telefono = scan.next();
                System.out.println("Ingrese el correo");
                String correo = scan.next();
                Contacto contacto1 = new Contacto(nombre,telefono,correo);
                ListaContactos.agregarContacto(contacto1);
                break;
            case 2 : 
                System.out.println("Ingrese el contacto que desea modificar, recuerde que va de 0 hasta "+(ListaContactos.listaContactos.size()-1));
                int p = scan.nextInt();
                ListaContactos.modificarContacto(p);
                break;
            case 3:
                 System.out.println("Ingrese el contacto que desea eliminar, recuerde que va de 0 hasta "+ListaContactos.listaContactos.size());
                int tf = scan.nextInt();
                ListaContactos.eliminarContacto(tf);
                break;
            case 4:
            ListaContactos.mostrarContactos();
            break;
        }
       }
       while(opcion!=9);
    }
    public static void main(String args[]){
     menuPrincipal();   
    }
}

