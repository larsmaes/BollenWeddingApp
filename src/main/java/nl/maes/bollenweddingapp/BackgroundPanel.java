/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BackgroundPanel.java
 *
 * Created on 10-jan-2011, 20:33:48
 */
package nl.maes.bollenweddingapp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author lars
 */
public class BackgroundPanel extends javax.swing.JPanel {

    private Image img;

    /** Creates new form BackgroundPanel */
    public BackgroundPanel(Image img) {
        this.img = img;
        int formwidth = Integer.parseInt(ApplicationProperties.getProperties().getProperty("formwidth"));
        int formheight = Integer.parseInt(ApplicationProperties.getProperties().getProperty("formheight"));
        Dimension size = new Dimension(formwidth,formheight);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, Integer.parseInt(ApplicationProperties.getProperties().getProperty("formwidth")), Integer.parseInt(ApplicationProperties.getProperties().getProperty("formheight")), this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
