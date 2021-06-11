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
public class Playlists implements Serializable {
    private ArrayList<Canciones> canciones;
    private static final long SerialVersionUID=777L;

    public Playlists(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Playlist: " + " ,Canciones: " + canciones;
    }
    
}
