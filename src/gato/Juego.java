/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gato;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA DEL REFUGIO
 */
public class Juego extends javax.swing.JFrame {

    Menu menu = new Menu();
    Funcion_gato gato = new Funcion_gato();
    public Juego() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cas2 = new javax.swing.JLabel();
        Cas3 = new javax.swing.JLabel();
        Cas4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Cas5 = new javax.swing.JLabel();
        Cas6 = new javax.swing.JLabel();
        Cas1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Cas8 = new javax.swing.JLabel();
        Cas9 = new javax.swing.JLabel();
        Cas7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        jLabel1.setText("Tablero del juego");

        Cas2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        jButton1.setText("Casilla 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Casilla 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Casilla 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Cas5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        jButton4.setText("Casilla 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Casilla 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Casilla 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Cas8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        Cas7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N

        jButton7.setText("Casilla 7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Casilla 8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Casilla 9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(Cas4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)
                            .addComponent(Cas7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cas2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(Cas5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(Cas8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton6)
                            .addComponent(Cas6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(Cas3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cas9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cas2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cas3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cas4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cas5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cas6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cas8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cas9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cas7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean saber = gato.vacia(0, 0);
        String tiro;
        if(saber){
            tiro=gato.tirada(0,0);
            Cas1.setText(tiro);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean saber2 = gato.vacia(0, 1);
        String tiro2;
        if(saber2){
            tiro2=gato.tirada(0,1);
            Cas2.setText(tiro2);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean saber3 = gato.vacia(0, 2);
        String tiro3;
        if(saber3){
            tiro3=gato.tirada(0,2);
            Cas3.setText(tiro3);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean saber4 = gato.vacia(1,0);
        String tiro4;
        if(saber4){
            tiro4=gato.tirada(1,0);
            Cas4.setText(tiro4);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean saber5 = gato.vacia(1,1);
        String tiro5;
        if(saber5){
            tiro5=gato.tirada(1,1);
            Cas5.setText(tiro5);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        boolean saber6 = gato.vacia(1,2);
        String tiro6;
        if(saber6){
            tiro6=gato.tirada(1,2);
            Cas6.setText(tiro6);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        boolean saber7 = gato.vacia(2,0);
        String tiro7;
        if(saber7){
            tiro7=gato.tirada(2,0);
            Cas7.setText(tiro7);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean saber8 = gato.vacia(2,1);
        String tiro8;
        if(saber8){
            tiro8=gato.tirada(2,1);
            Cas8.setText(tiro8);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boolean saber9 = gato.vacia(2,2);
        String tiro9;
        if(saber9){
            tiro9=gato.tirada(2,2);
            Cas9.setText(tiro9);
            try {
                comprobar2();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "La casilla ya esta ocupada", "Cuadro de dialogo", 
                    JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    public void comprobar2() throws IOException, FileNotFoundException, ClassNotFoundException{
        Funciones funcion = new Funciones();
        String bandera = gato.comprobar();
        if(!bandera.equals("")){
            if(bandera.equals("EMPATE")){
                JOptionPane.showConfirmDialog(null, "Hubo un empate\n" +"Buen juego", "Cuadro de dialogo", 
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showConfirmDialog(null, "El ganador es: "+ bandera +"\nFelicidades", "Cuadro de dialogo", 
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                int puntos2 = gato.puntos();
                if(puntos2==5||puntos2==6){
                    puntos2=15;
                }
                else{
                    if(puntos2 == 7|| puntos2 ==8){
                        puntos2 = 10;
                    }
                    else{
                        puntos2 = 5;
                    }
                }
                JOptionPane.showConfirmDialog(null, "El jugador: "+bandera+" ha conseguido "+puntos2+" puntos","Cuadro de dialogo", 
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                funcion.añadirpuntos(bandera, puntos2);
            }
            menu.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public void main() {
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cas1;
    private javax.swing.JLabel Cas2;
    private javax.swing.JLabel Cas3;
    private javax.swing.JLabel Cas4;
    private javax.swing.JLabel Cas5;
    private javax.swing.JLabel Cas6;
    private javax.swing.JLabel Cas7;
    private javax.swing.JLabel Cas8;
    private javax.swing.JLabel Cas9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
