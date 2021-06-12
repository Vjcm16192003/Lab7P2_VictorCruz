/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_victorcurz;

import javax.swing.JProgressBar;

/**
 *
 * @author Victor Jafet Cruz
 */
public class HiloDuracion extends Thread{
    private JProgressBar progBar;
    private boolean avanzar;
    private boolean vive;

    public HiloDuracion(JProgressBar progBar) {
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue() + 1);
                progBar.setString(Integer.toString(progBar.getValue()) + " Minutos");

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }
    
}
