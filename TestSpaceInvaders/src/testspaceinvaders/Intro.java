/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class Intro extends Space {
     @Override
        public void paint(Graphics g) {
            // scrivi nel canvas la scritta in Rosso 
            g.setColor(Color.CYAN);
            // Seleziona i Font della scritta (Bold) e la dimensione dei caratteri (40)
            g.setFont(new Font("Bold", Font.PLAIN, 40));
            // Scrivi partendo dalla posizione x=100 e y=100
            g.drawString("Space Invaders", 100, 100);
            g.setFont(new Font("Bold", Font.PLAIN, 15));
            g.drawString("          by Lorenzo Boero",110,120);            
        }

    void run() {
        
    }
    
}
