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
public class Camion {

    /**
     * @param args the command line arguments
     */
    int carga;
    int km;

    public int getCarga() {
        return carga;
    }
    public Camion(int n,int m){
        this.carga=n;
        this.km=m;
    }
    public Camion(Camion c){
        this.carga=c.getCarga();
       this.km= c.getKm();
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    static String toString (Camion c){
        int carga=c.getCarga();
        int km=c.getKm();
        String info=("Carga: "+carga+" Kilometros:"+km );
        return info;
    }
    
    
}