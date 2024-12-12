package Intabla;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public Pantalla() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        modelo=new DefaultTableModel(){
            public boolean iscellEditable(int rowIndex, int mColIndex){
                return false;
            }
        };
        modelo=new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Total Renglon");

        tabla.setModel(modelo);
        
        tabla.getColumnModel().getColumn(0).setMaxWidth(500);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(500);
        tabla.getColumnModel().getColumn(1).setMaxWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setMaxWidth(120);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(120); // Ajuste para "Precio Unitario"
        tabla.getColumnModel().getColumn(3).setMaxWidth(150);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
        
        Vector v=new Vector();
        v.addElement("cafe");
        v.addElement(5);
        v.addElement(60);
        v.addElement(300);
        
        modelo.addRow(v);
        
        v =new Vector();
        v.addElement("leche");
        v.addElement(2);
        v.addElement(65);
        v.addElement(130);
        
        modelo.addRow(v);
        
        v = new Vector();
        v.addElement("pan");
        v.addElement(3);
        v.addElement(50);
        v.addElement(150);
    
        modelo.addRow(v);

        v = new Vector();
        v.addElement("azucar");
        v.addElement(1);
        v.addElement(45);
        v.addElement(45);
    
        modelo.addRow(v);

        v = new Vector();
        v.addElement("pepsi");
        v.addElement(4);
        v.addElement(30);
        v.addElement(120);
    
        modelo.addRow(v);

        v = new Vector();
        v.addElement("frijoles");
        v.addElement(2);
        v.addElement(80);
        v.addElement(160);
    
        modelo.addRow(v);
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
