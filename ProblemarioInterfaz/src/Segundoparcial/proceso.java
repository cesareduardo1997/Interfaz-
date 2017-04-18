/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segundoparcial;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author Cesar
 */
public class proceso  extends Thread{

    private JTextField edt;
    private JProgressBar prog;

    public proceso(JTextField edt, JProgressBar prog) {
        this.edt = edt;
        this.prog = prog;
    }

    
    
    
public void run(){
    for(int i=0;i<10;i++){
         edt.setText( (String.valueOf(i)));
         prog.setValue(i);
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        }
}
    
}
