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
import java.util.Scanner;
public class ArrayCamiones {
   static Camion[] camiones=new Camion[PrincipalCamion.cantidadcamiones];
    
    static public void agregar(Camion c){
        for(int i=0;i<camiones.length;i++){
            if(camiones[i] ==null){
                camiones[i]=new Camion(c);
                break;
            }else{
                continue;
            }
            
        }
    }
    static public void modificar(int p){
        System.out.println("ingrese valor a modificar(carga o km y el valor que desea ingresar poner");
        Scanner scan=new Scanner(System.in);
        String tipo=scan.next();
        int valor=scan.nextInt();
         if(tipo.equalsIgnoreCase("carga")){
            camiones[p].setCarga(valor);
        }else if(tipo.equalsIgnoreCase("KM")||tipo.equalsIgnoreCase("kilometros")){
            camiones[p].setKm(valor);
        }
    }
    static public void eliminar(int p){
        camiones[p]=null;
    }
}