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
public class PrincipalCamion {
static void imprimirCamiones(Camion[] camiones){
for(int i=0;i<camiones.length;i++){
    if(camiones[i]!=null){System.out.println(camiones[i].toString(camiones[i]));
    
}
    else {
        continue;
    }}}
public static int cantidadcamiones;

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Cuantos camiones desea almacenar");
        int cantidadCamiones=scan.nextInt();
        cantidadcamiones=cantidadCamiones;
        System.out.println("¿Que desea hacer?"+"\n"+"0 salir"+"\n"+"1 imprime los camiones"+"\n"+"2 agrega camiones"+"\n"+"3 eliminar camiones"+"\n"+"4 modificar");      
        
        for(int i=scan.nextInt();i!=0;i=scan.nextInt()){
            
        
        switch(i){
            case 1: PrincipalCamion.imprimirCamiones(ArrayCamiones.camiones);
                break;
            case 2: System.out.println("Ingrese carga y kilometros del camion");
            int carga=scan.nextInt();
            int km=scan.nextInt();
            Camion c=new Camion(carga,km);
               ArrayCamiones.agregar(c);
               break;
            case 3: System.out.println("Ingrese la posicion del camion a eliminar");
            int el=scan.nextInt();
            ArrayCamiones.eliminar(el);
            break;
            case 4:System.out.println("Ingrese posicion a modificar");
            int p=scan.nextInt();
            ArrayCamiones.modificar(p);
        }
            System.out.println("Que desea hacer");
        }   
    }

}
