/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_victorcurz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Albumes implements Serializable {
    private String nombre,fecha_p,generoM,format,Aliasp;
    private static final long SerialVersionUID=759L;
    ArrayList<Canciones>canciones=new ArrayList();
//Constructor
    public Albumes(String nombre, String fecha_p, String generoM, String format, String Aliasp) {
        this.nombre = nombre;
        this.fecha_p = fecha_p;
        this.generoM = generoM;
        this.format = format;
        this.Aliasp = Aliasp;
    }
    
//Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public String getGeneroM() {
        return generoM;
    }

    public void setGeneroM(String generoM) {
        this.generoM = generoM;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAliasp() {
        return Aliasp;
    }

    public void setAliasp(String Aliasp) {
        this.Aliasp = Aliasp;
          
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
    
    
//ToString
    @Override
    public String toString() {
        return "Nombre del Album: " + nombre + " , fecha Publicacion: " + fecha_p + " , genero de Musica: " + generoM + " , Formato: " + format + ", Alias del productor: " + Aliasp;
    }
}
