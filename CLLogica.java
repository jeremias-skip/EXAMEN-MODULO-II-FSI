/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.logica;

import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEIgv;


public class CLLogica {
    
     private static final Logger LOG = LoggerFactory.getLogger("CLLogica");

       public CEIgv igv(CEIgv poEntrada) {
        LOG.info("[fsi]Objeto Entrante : {}", poEntrada);

         CEDatos poSalida = new CEDatos();  
       
         double a=poSalida.getImporte();
         double c=a*0.18;
         double x=a+c;
         
        poEntrada.setIgv(c);
         
         poEntrada.setTotal(x);
         
        LOG.info("[fsi]Objeto De Salida : {}", poEntrada);
        
        return poEntrada;
    }
}
