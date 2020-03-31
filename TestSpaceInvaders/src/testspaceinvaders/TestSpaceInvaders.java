/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspaceinvaders;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */
public class TestSpaceInvaders extends JFrame {
    
    public TestSpaceInvaders() throws InterruptedException{
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        this.pack();
        this.setVisible(true);
        intro.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        new TestSpaceInvaders();
    }
    
}
