/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.m661463050;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

/**
 *
 * @author com4936
 */
public class TestM extends JFrame implements KeyListener, Runnable {

    Image[] image = new Image[9];
    int pSize = 80;
    int x, y = 40;
    int y1 = 140;
    int n = 0;
    Random random = new Random();
    int i = random.nextInt(1, 9);
    int s;

    /**
     * Creates new form TestM
     */
    public TestM() {
        initComponents();
        super.setSize(600, 600);
        image[0] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\1.jpg");
        image[1] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\2.jpeg");
        image[2] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\3.jpeg");
        image[3] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\4.jpg");
        image[4] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\5.jpg");
        image[5] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\6.jfif");
        image[6] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\7.jpg");
        image[7] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\8.jpg");
        image[8] = Toolkit.getDefaultToolkit().createImage("C:\\Users\\com4936\\Documents\\NetBeansProjects\\M661463050\\src\\main\\java\\com\\mycompany\\Pic\\wallpaper\\9.jpg");
        this.addKeyListener(this);

        new Thread(this).start();

    }

    public void paint(Graphics g) {

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        int x = (getWidth() - pSize) / 2;

        g.drawImage(image[n], x, y, pSize, pSize, this);

        g.setColor(Color.RED);
        Font font = new Font("Monospaced", Font.BOLD, 24);
        g.setFont(font);
        g.drawString(i + "", x + 30, y1);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Monospaced", Font.BOLD, 36));
        g.setFont(font);
        g.drawString(s + "", 150, 300);

        if (s == -10) {
            t = 1000000000;
            g.setColor(Color.BLACK);
            g.setFont(new Font("Monospaced", Font.BOLD, 36));
            g.setFont(font);
            g.drawString("Game Over", (getWidth() - pSize) / 2, (getHeight() - pSize) / 2);
        }
        /*
        g.setColor(Color.BLACK);
        g.setFont(new Font("Monospaced", Font.BOLD, 36));
        g.setFont(font);
        g.drawString("Game Over",(getWidth() - pSize) / 2, (getHeight() - pSize) / 2);
         */

    }
    int t = 50;

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(t);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestM.class.getName()).log(Level.SEVERE, null, ex);
            }

            switch (n) {
                case 0:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 1;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 1:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 2;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 2:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 3;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 3:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 4;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 4:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 5;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 5:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 6;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 6:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 7;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 7:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 8;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 8:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 9;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
                case 9:
                    y += 10;
                    y1 += 10;
                    if (y >= 520) {
                        n = 0;
                        y = 40;
                        y1 = 140;
                        i = random.nextInt(1, 9);
                    }
                    break;
            }

            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("key pressed");
        System.out.println(e.getKeyCode());

        if (e.getKeyCode() == 97) {
            if (i == 1) {
                s = s + 3;
            } else if (!(i == 1)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 98) {
            if (i == 2) {
                s = s + 3;
            } else if (!(i == 2)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 99) {
            if (i == 3) {
                s = s + 3;
            } else if (!(i == 3)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 100) {
            if (i == 4) {
                s = s + 3;
            } else if (!(i == 4)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 101) {
            if (i == 5) {
                s = s + 3;
            } else if (!(i == 5)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 102) {
            if (i == 6) {
                s = s + 3;
            } else if (!(i == 6)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 103) {
            if (i == 7) {
                s = s + 3;
            } else if (!(i == 7)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 104) {
            if (i == 8) {
                s = s + 3;
            } else if (!(i == 8)) {
                s = s - 1;
            }
        } else if (e.getKeyCode() == 105) {
            if (i == 9) {
                s = s + 3;
            } else if (!(i == 9)) {
                s = s - 1;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TestM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestM().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
