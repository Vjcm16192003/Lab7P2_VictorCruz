/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_victorcurz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Admin_Playlists {
     private ArrayList<Playlists> listaPlaylists = new ArrayList();
    private File archivo = null;
    
    public Admin_Playlists(String path) {
        archivo = new File(path);
    }

    public ArrayList<Playlists> getListaPlaylists() {
        return listaPlaylists;
    }

    public void setListaPlaylists(ArrayList<Playlists> listaPlaylists) {
        this.listaPlaylists= listaPlaylists;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //extra mutador
    public void setPlayList(Playlists p) {
        this.listaPlaylists.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaPlaylists = new ArrayList();
            Playlists temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Playlists) objeto.readObject()) != null) {
                        listaPlaylists.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Playlists t : listaPlaylists) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
