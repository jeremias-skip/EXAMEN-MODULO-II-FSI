/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.unjfsc.fsi.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEIgv;
import pe.unjfsc.fsi.logica.CLLogica;

/**
 *
 * @author SAMYR
 */
public class Tarea {
private static final Logger LOG=LoggerFactory.getLogger("Tarea");
    public static void main(String[] args) {
          LOG.info("TEXTO");
        
        CEDatos  a=new CEDatos();
        CEIgv   c=new CEIgv ();
        CLLogica b=new CLLogica();
        
        a.setImporte(4.66);
        c.getIgv();
         c.getTotal();
        
              b.igv(c);
        LOG.info("resultado"+a+c+b);
        
    }
}
