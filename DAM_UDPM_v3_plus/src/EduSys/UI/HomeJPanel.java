/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package EduSys.UI;

import EduSys.Utils.XImage;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author anhba
 */
public class HomeJPanel extends javax.swing.JPanel {
            
    /**
     * Creates new form HomeJPanel
     */
    public HomeJPanel() {
        initComponents();
        XImage.setAnh2("src\\EduSys\\Image\\ong.png", lblAnhNen, 728, 570);
       
    }
//    private void selectAnhNen() {
//        JFileChooser fileChooser = new JFileChooser("src\\EduSys\\Image\\");
//        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//            File file = fileChooser.getSelectedFile();
//            if (XImage.save(file)) {
//                
//                try {
//                    BufferedImage originalImage = ImageIO.read(new File(file.toString()));
//                    
//                    ImageIcon icon = new ImageIcon(originalImage);
//                    
//                    Image image = icon.getImage();
//                    
//                    Image scaledImage = image.getScaledInstance(lblAnhNen.getWidth(), lblAnhNen.getHeight(), Image.SCALE_DEFAULT);
//                    
//                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
//                    //    lblAnhNen.setToolTipText(file.getName());
//                    lblAnhNen.setIcon(scaledIcon);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }   
//                
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnhNen = new javax.swing.JLabel();

        lblAnhNen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhNenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAnhNen, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAnhNen, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnhNenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhNenMouseClicked
        // TODO add your handling code here:
     //   selectAnhNen();
    }//GEN-LAST:event_lblAnhNenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAnhNen;
    // End of variables declaration//GEN-END:variables
}
