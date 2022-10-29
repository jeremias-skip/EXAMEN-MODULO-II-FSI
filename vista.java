/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.unjfsc.fsi.view;

import com.sun.corba.se.impl.encoding.CachedCodeBase;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEIgv;
import pe.unjfsc.fsi.logica.CLLogica;

/**
 *
 * @author SAMYR
 */
public class vista extends javax.swing.JFrame {
 private static final Logger LOG = LoggerFactory.getLogger("vista");
    public vista() {
        initComponents();
        
           DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("N°");
        model.addColumn("empresa");
        model.addColumn("ruc");
        model.addColumn("Direccion");
        model.addColumn("Ubicacion");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        model.addColumn("Comprobante");
        model.addColumn("N°Comprobante");
        model.addColumn("Categoria");
        model.addColumn("Importe");
        
        model.addRow(new Object[]{"1","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","VILLA","13/01/2022","14:50:48","BOLETA DE VENTA ELECTRÓNICA","B226-09-02151737","Liviano","4,66"});
        model.addRow(new Object[]{"2","RUTAS DE LIMA SAC","20550372640","Panamericana Sur Km 45 Punta Negra","PUNTA NEGRA","13/01/2022","6:34:08","BOLETA DE VENTA ELECTRÓNICA","B606-07-027382087","Liviano","4,66"});
        model.addRow(new Object[]{"3","RUTAS DE LIMA SAC","20550372640","Panamericana Sur Km 45 Punta Negra","PUNTA NEGRA","11/01/2022","15:41:23","BOLETA DE VENTA ELECTRÓNICA","B603-04-02594878","Liviano","4,66"});
        model.addRow(new Object[]{"4","RUTAS DE LIMA SAC","20550372640","Panamericana Sur Km 45 Punta Negra","PUNTA NEGRA","8/01/2022","4:51:20","BOLETA DE VENTA ELECTRÓNICA","B611-02-00899858","Liviano","4,66"});
        model.addRow(new Object[]{"5","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","VILLA","8/01/2022","10:10:59","BOLETA DE VENTA ELECTRÓNICA","B228-01-00388249","Liviano","4,66"});
        model.addRow(new Object[]{"6","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","VILLA","7/01/2022","3:59:18","BOLETA DE VENTA ELECTRÓNICA","B209-10-04410184","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"8","RUTAS DE LIMA SAC","20550372640","Panamericana Sur Km 45 Punta Negra","PUNTA NEGRA","24/12/2021","16:03:15","BOLETA DE VENTA ELECTRÓNICA","B605-06-03468361","Liviano","4,66"});
        model.addRow(new Object[]{"9","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","VILLA","24/12/2021","18:03:43","BOLETA DE VENTA ELECTRÓNICA","B201-01-01181858","Liviano","4,66"});
        model.addRow(new Object[]{"10","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","VILLA","25/12/2021","17:48:04","BOLETA DE VENTA ELECTRÓNICA","B228-01-00381664","Liviano","4,66"});
     /*   model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
        model.addRow(new Object[]{"7","RUTAS DE LIMA SAC","20550372640","Panamericana Sur KM 19 - Villa El Salvador","ACCESO SAN PEDRO","30/12/2021","10:17:39","BOLETA DE VENTA ELECTRÓNICA","B305-02-00996256","Liviano","4,66"});
    */
        
        table.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        importe = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 127, 1061, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTROS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 41, -1, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 410, 340));

        importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importeActionPerformed(evt);
            }
        });
        getContentPane().add(importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        CEIgv a=new   CEIgv();
       CEDatos b=new    CEDatos();
         CLLogica e=new  CLLogica ();
        LOG.info("entrada ,"+a);
        
     
       b.setImporte(Integer.valueOf(this.importe.getText()));
      
      double igv =b.getImporte()*0.18;
      double total=igv+4.66;
      
       DefaultTableModel mode2 = new DefaultTableModel();
        
          
        LOG.info("entrada ,"+e);
        mode2.addColumn("igv");
        mode2.addColumn("total");
        mode2.addRow(new Object[]{igv,total});
        
       
    tabla2.setModel(mode2);
   /* for (int i = 0; i < tabla2.getRowCount(); i++) {
     
                 i-=1;
}*/
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }
    private void Clear_Table(){

}
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField importe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
